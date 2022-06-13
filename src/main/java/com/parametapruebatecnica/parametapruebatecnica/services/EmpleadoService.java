package com.parametapruebatecnica.parametapruebatecnica.services;

import com.parametapruebatecnica.parametapruebatecnica.models.EmpleadoJson;
import com.parametapruebatecnica.parametapruebatecnica.models.EmpleadoModel;
import com.parametapruebatecnica.parametapruebatecnica.repositories.EmpleadoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;
    ArrayList<EmpleadoJson> empleadosJsons = new ArrayList<>();

    public ArrayList<EmpleadoJson> getEmpleados() {
        empleadosJsons.clear();
        ArrayList<EmpleadoModel> empleados = (ArrayList<EmpleadoModel>) empleadoRepository.findAll();


        for (EmpleadoModel empleado : empleados) {

            empleadosJsons.add(new EmpleadoJson(empleado.getId(),
                    empleado.getNombre(),
                    empleado.getApellido(),
                    empleado.getTipoDeDocumento(),
                    empleado.getNumeroDeDocumento(),
                    empleado.getFechaDeNacimiento(),
                    empleado.getFechaDeVinculacionAlACompania(),
                    empleado.getCargo(),
                    empleado.getSalario(),
                    this.edadActual(empleado),
                    this.tiempoEnCompania(empleado)));

        }
        return empleadosJsons;
    }

    public void saveEmpleado(EmpleadoModel empleado) {
        if (isFieldsNull(empleado) && isAdult(empleado)) {
            empleadoRepository.save(empleado);
        }
    }

    public Optional<EmpleadoJson> getEmpleadoById(Long id) {
        empleadosJsons.clear();
        Optional<EmpleadoModel> empleado = empleadoRepository.findById(id);

        empleadosJsons.add(new EmpleadoJson(empleado.get().getId(),
                empleado.get().getNombre(),
                empleado.get().getApellido(),
                empleado.get().getTipoDeDocumento(),
                empleado.get().getNumeroDeDocumento(),
                empleado.get().getFechaDeNacimiento(),
                empleado.get().getFechaDeVinculacionAlACompania(),
                empleado.get().getCargo(),
                empleado.get().getSalario(),
                this.edadActual(empleado.get()),
                this.tiempoEnCompania(empleado.get())));

        return Optional.ofNullable(empleadosJsons.get(0));
    }

    public void deleteEmpleado(Long id) {
        try {
            empleadoRepository.deleteById(id);

        } catch (Exception err) {
        }
    }

    public boolean isFieldsNull(@NotNull EmpleadoModel empleado) {
        String fechaDeNacimiento = new SimpleDateFormat("yyyy-MM-dd").format(empleado.getFechaDeNacimiento());
        String fechaDeVinculacion = new SimpleDateFormat("yyyy-MM-dd").format(empleado.getFechaDeVinculacionAlACompania());
        boolean resultado = false;
        if (!empleado.getNombre().isEmpty()
                && !empleado.getApellido().isEmpty()
                && !empleado.getCargo().isEmpty()
                && !fechaDeNacimiento.isEmpty()
                && !fechaDeVinculacion.isEmpty()
                && !empleado.getNumeroDeDocumento().isEmpty()
                && !empleado.getTipoDeDocumento().isEmpty()
                && empleado.getSalario().isNaN()) {

            resultado = true;
        }

        return resultado;
    }

    public boolean isAdult(@NotNull EmpleadoModel empleado) {
        boolean resultado = false;

        Date fechaHoraActual = new Date();

        Long nacimientoEmpleado = fechaHoraActual.getTime() - empleado.getFechaDeNacimiento().getTime();

        if (nacimientoEmpleado > 5.676e+11) {
            resultado = true;
        }
        return resultado;
    }

    public String tiempoEnCompania(@NotNull EmpleadoModel empleado) {

        String stringFechaIngreso = new SimpleDateFormat("yyyy-MM-dd").format(empleado.getFechaDeNacimiento());

        LocalDate fechaIngreso = LocalDate.parse(stringFechaIngreso);

        Period tiempoEnCompania = Period.between(fechaIngreso, LocalDate.now());

        return "Años: " + tiempoEnCompania.getYears() + ", meses: " + tiempoEnCompania.getMonths();
    }

    public String edadActual(@NotNull EmpleadoModel empleado) {

        String stringFechaNaciemiento = new SimpleDateFormat("yyyy-MM-dd").format(empleado.getFechaDeNacimiento());

        LocalDate fechaNacimiento = LocalDate.parse(stringFechaNaciemiento);

        Period edad = Period.between(fechaNacimiento, LocalDate.now());

        return "Años: " + edad.getYears() + ", meses: " + edad.getMonths() + ", días: " + edad.getDays();
    }
}
