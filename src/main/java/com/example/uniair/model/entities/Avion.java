package com.example.uniair.model.entities;

public class Avion {
    private String ID;
    private String modelo;
    private String tipo;
    private String capacidad;
    private String peso;

    public Avion(String ID, String modelo, String tipo, String capacidad, String peso) {
        this.ID = ID;
        this.modelo = modelo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "ID='" + ID + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }

    public Avion registrarAvion() {
        return this;
    }
}