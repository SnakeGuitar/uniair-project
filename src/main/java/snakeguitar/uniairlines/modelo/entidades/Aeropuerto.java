/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakeguitar.uniairlines.modelo.entidades;

/**
 *
 * @author snake
 */
public class Aeropuerto {
    private int identificador;
    private String nombre;
    private String pais;
    private String ciudad;

    public Aeropuerto(int identificador, String nombre, String pais, String ciudad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
    }
    
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
}
