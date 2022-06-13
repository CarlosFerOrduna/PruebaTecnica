package com.parametapruebatecnica.parametapruebatecnica.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "empleado")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "tipo_de_documento", nullable = false)
    private String tipoDeDocumento;
    @Column(name = "numero_de_documento", nullable = false)
    private String numeroDeDocumento;
    @Column(name = "fecha_de_nacimiento", nullable = false)
    private Date fechaDeNacimiento;
    @Column(name = "fecha_de_vinculacion", nullable = false)
    private Date fechaDeVinculacionAlACompania;
    @Column(name = "cargo", nullable = false)
    private String cargo;
    @Column(name = "salario", nullable = false)
    private Double salario;


    public EmpleadoModel() {

    }

    public EmpleadoModel(String nombre, String apellido, String tipoDeDocumento, String numeroDeDocumento, Date fechaDeNacimiento, Date fechaDeVinculacionAlACompania, String cargo, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeVinculacionAlACompania = fechaDeVinculacionAlACompania;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Date getFechaDeVinculacionAlACompania() {
        return fechaDeVinculacionAlACompania;
    }

    public void setFechaDeVinculacionAlACompania(Date fechaDeVinculacionAlACompania) {
        this.fechaDeVinculacionAlACompania = fechaDeVinculacionAlACompania;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
