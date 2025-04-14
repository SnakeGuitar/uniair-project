package com.example.uniair.model.entities;
import com.example.uniair.model.services.ContactoServicio;

public class Aerolinea {
    String IATA;
    String ICAO;
    String nombre;
    String callsign;
    String pais;
    String direccion;
    String sitioWeb;
    ContactoServicio contacto;

    public Aerolinea(String IATA, String ICAO, String nombre, String callsign, String pais, String direccion, String sitioWeb, ContactoServicio contacto) {
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.nombre = nombre;
        this.callsign = callsign;
        this.pais = pais;
        this.direccion = direccion;
        this.sitioWeb = sitioWeb;
        this.contacto = contacto;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public ContactoServicio getContacto() {
        return contacto;
    }

    public void setContacto(ContactoServicio contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Aerolinea{" +
                "IATA='" + IATA + '\'' +
                ", ICAO='" + ICAO + '\'' +
                ", nombre='" + nombre + '\'' +
                ", callsign='" + callsign + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", contacto=" + contacto +
                '}';
    }
}
