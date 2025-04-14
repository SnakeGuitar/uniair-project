package com.example.uniair.model.entities;

public class Aeropuerto {
    private String nombre;
    private String pais;
    private String ciudad;

    public Aeropuerto(String nombre, String pais, String ciudad) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public Aeropuerto registrarAeropuerto() {
        return this;
    }
}
