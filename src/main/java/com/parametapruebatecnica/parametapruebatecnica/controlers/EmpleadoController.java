package com.parametapruebatecnica.parametapruebatecnica.controlers;

import com.parametapruebatecnica.parametapruebatecnica.models.EmpleadoJson;
import com.parametapruebatecnica.parametapruebatecnica.models.EmpleadoModel;
import com.parametapruebatecnica.parametapruebatecnica.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping()
    public ArrayList<EmpleadoJson> getEmpleados() {
        return empleadoService.getEmpleados();
    }

    @PostMapping()
    public void saveEmpleado(@RequestBody EmpleadoModel empleado) {
        this.empleadoService.saveEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmpleadoJson> getEmpleadoById(@PathVariable("id") Long id) {
        return this.empleadoService.getEmpleadoById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        empleadoService.deleteEmpleado(id);

    }
}
