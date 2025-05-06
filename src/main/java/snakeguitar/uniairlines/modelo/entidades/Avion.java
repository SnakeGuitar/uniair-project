/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakeguitar.uniairlines.modelo.entidades;

/**
 *
 * @author snake
 */
public class Avion {
    private int identificador;
    private String matricula;
    private String modelo;
    private String tipo;
    private String capacidad;
    private String peso;

    public Avion(int identificador, String matricula, String modelo, 
            String tipo, String capacidad, String peso) {
        this.identificador = identificador;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        return "Avion{" + "identificador=" + identificador + ", matricula=" + matricula + ", modelo=" + modelo + ", tipo=" + tipo + ", capacidad=" + capacidad + ", peso=" + peso + '}';
    }
    
    
}
