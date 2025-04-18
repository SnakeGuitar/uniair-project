package com.example.uniair.model.entities;
import com.example.uniair.model.enums.ClaseBoleto;

import java.util.Date;

public class Boleto {
    private String nombreAerolinea;
    private String codigoVuelo;
    private String nombrePasajero;
    private String asiento;
    private ClaseBoleto clase;
    private int puertaSalida;
    private int puertaLlegada;
    private String ciudadSalida;
    private String ciudadLlegada;
    private Date fecha;
    private Date hora;

    public Boleto() {
    }

    public Boleto(String nombreAerolinea, String codigoVuelo, String nombrePasajero, String asiento,
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

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public ClaseBoleto getClase() {
        return clase;
    }

    public void setClase(ClaseBoleto clase) {
        this.clase = clase;
    }

    public int getPuertaSalida() {
        return puertaSalida;
    }

    public void setPuertaSalida(int puertaSalida) {
        this.puertaSalida = puertaSalida;
    }

    public int getPuertaLlegada() {
        return puertaLlegada;
    }

    public void setPuertaLlegada(int puertaLlegada) {
        this.puertaLlegada = puertaLlegada;
    }

    public String getCiudadSalida() {
        return ciudadSalida;
    }

    public void setCiudadSalida(String ciudadSalida) {
        this.ciudadSalida = ciudadSalida;
    }

    public String getCiudadLlegada() {
        return ciudadLlegada;
    }

    public void setCiudadLlegada(String ciudadLlegada) {
        this.ciudadLlegada = ciudadLlegada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Boleto generarBoleto() {
        return this;
    }
}
