/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakeguitar.uniairlines.modelo.entidades;

/**
 *
 * @author snake
 */
public class Aerolinea {
    int identificador;
    String IATA;
    String ICAO;
    String nombre;
    String callsign;
    String pais;
    String direccion;
    String sitioWeb;

    public Aerolinea(int identificador, String IATA, String ICAO,
            String nombre, String callsign, String pais,
            String direccion, String sitioWeb) {
        this.identificador = identificador;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.nombre = nombre;
        this.callsign = callsign;
        this.pais = pais;
        this.direccion = direccion;
        this.sitioWeb = sitioWeb;
    }
    
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador() {
        this.identificador = identificador;
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
}
