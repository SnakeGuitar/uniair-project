package com.example.uniair.model.dto;

import com.example.uniair.model.enums.ClaseBoleto;

import java.util.Date;

public class BoletoDTO {
    private final String nombreAerolinea;
    private final String codigoVuelo;
    private final String nombrePasajero;
    private final String asiento;
    private final ClaseBoleto clase;
    private final int puertaSalida;
    private final int puertaLlegada;
    private final String ciudadSalida;
    private final String ciudadLlegada;
    private final Date fecha;
    private final Date hora;

    public BoletoDTO(String nombreAerolinea, String codigoVuelo, String nombrePasajero, String asiento,
                     ClaseBoleto clase, int puertaSalida, int puertaLlegada, String ciudadSalida,
                     String ciudadLlegada, Date fecha, Date hora) {
        this.nombreAerolinea = nombreAerolinea;
        this.codigoVuelo = codigoVuelo;
        this.nombrePasajero = nombrePasajero;
        this.asiento = asiento;
        this.clase = clase;
        this.puertaSalida = puertaSalida;
        this.puertaLlegada = puertaLlegada;
        this.ciudadSalida = ciudadSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String getAsiento() {
        return asiento;
    }

    public ClaseBoleto getClase() {
        return clase;
    }

    public int getPuertaSalida() {
        return puertaSalida;
    }

    public int getPuertaLlegada() {
        return puertaLlegada;
    }

    public String getCiudadSalida() {
        return ciudadSalida;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "BoletoDTO{" +
                "nombreAerolinea='" + nombreAerolinea + '\'' +
                ", codigoVuelo='" + codigoVuelo + '\'' +
                ", nombrePasajero='" + nombrePasajero + '\'' +
                ", asiento='" + asiento + '\'' +
                ", clase=" + clase +
                ", puertaSalida=" + puertaSalida +
                ", puertaLlegada=" + puertaLlegada +
                ", ciudadSalida='" + ciudadSalida + '\'' +
                ", ciudadLlegada='" + ciudadLlegada + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }
}
