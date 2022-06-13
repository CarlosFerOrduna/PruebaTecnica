package com.parametapruebatecnica.parametapruebatecnica.models;

import java.util.Date;

public class EmpleadoJson {

    private Long id;
    private String nombre;
    private String apellido;
    private String tipoDeDocumento;
    private String numeroDeDocumento;
    private Date fechaDeNacimiento;
    private Date fechaDeVinculacionAlACompania;
    private String cargo;
    private Double salario;
    private String edadActual;
    private String tiempoEnCompania;

    public EmpleadoJson(Long id,
                        String nombre,
                        String apellido,
                        String tipoDeDocumento,
                        String numeroDeDocumento,
                        Date fechaDeNacimiento,
                        Date fechaDeVinculacionAlACompania,
                        String cargo,
                        Double salario,
                        String edadActual,
                        String tiempoEnCompania) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.fechaDeVinculacionAlACompania = fechaDeVinculacionAlACompania;
        this.cargo = cargo;
        this.salario = salario;
        this.edadActual = edadActual;
        this.tiempoEnCompania = tiempoEnCompania;
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

    public String getEdadActual() {
        return edadActual;
    }

    public void setEdadActual(String edadActual) {
        this.edadActual = edadActual;
    }

    public String getTiempoEnCompania() {
        return tiempoEnCompania;
    }

    public void setTiempoEnCompania(String tiempoEnCompania) {
        this.tiempoEnCompania = tiempoEnCompania;
    }
}
