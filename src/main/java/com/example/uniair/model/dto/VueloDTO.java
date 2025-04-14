package com.example.uniair.model.dto;

import com.example.uniair.model.entities.Aeropuerto;

import java.time.Duration;
import java.util.Date;

public class VueloDTO {
    private String codigoVuelo;
    private int cantidadPasajeros;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoLlegada;
    private Date fechaSalida;
    private Date fechaLlegada;
    private Date horaSalida;
    private Date horaLlegada;
    private Duration duracionVuelo;
    private int puertaSalida;
    private int puertaLlegada;
    private double precioClaseTurista;
    private double precioClaseEjecutiva;
    private double precioPrimeraClase;

    public VueloDTO(String codigoVuelo, int cantidadPasajeros, Aeropuerto aeropuertoSalida,
                    Aeropuerto aeropuertoLlegada, Date fechaSalida, Date fechaLlegada,
                    Date horaSalida, Date horaLlegada, Duration duracionVuelo,
                    int puertaSalida, int puertaLlegada, double precioClaseTurista,
                    double precioClaseEjecutiva, double precioPrimeraClase) {
        this.codigoVuelo = codigoVuelo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracionVuelo = duracionVuelo;
        this.puertaSalida = puertaSalida;
        this.puertaLlegada = puertaLlegada;
        this.precioClaseTurista = precioClaseTurista;
        this.precioClaseEjecutiva = precioClaseEjecutiva;
        this.precioPrimeraClase = precioPrimeraClase;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public Duration getDuracionVuelo() {
        return duracionVuelo;
    }

    public int getPuertaSalida() {
        return puertaSalida;
    }

    public int getPuertaLlegada() {
        return puertaLlegada;
    }

    public double getPrecioClaseTurista() {
        return precioClaseTurista;
    }

    public double getPrecioClaseEjecutiva() {
        return precioClaseEjecutiva;
    }

    public double getPrecioPrimeraClase() {
        return precioPrimeraClase;
    }
}