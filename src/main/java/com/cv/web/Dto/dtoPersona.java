package com.cv.web.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {

    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String cargo;
    @NotBlank
    private String ciudad;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String img;

    // Constructor
    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String cargo, String ciudad, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.img = img;
    }

    // Getter y Setters
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
