package com.example.uniair.model.entities;

import java.util.Date;

public class Admin extends Empleado {
    private String departamento;
    private Date inicioTurno;
    private Date finTurno;

    public Admin(String identificador, String nombre, String direccion,
                 String telefono, String correo, Date fechaNacimiento,
                 Date fechaContratacion, String genero, double salario,
                 String usuario, String claveAcceso, String departamento,
                 Date inicioTurno, Date finTurno) {
        super(identificador, nombre, direccion,
                telefono, correo, fechaNacimiento,
                fechaContratacion, genero, salario,
                usuario, claveAcceso);
        this.departamento = departamento;
        this.inicioTurno = inicioTurno;
        this.finTurno = finTurno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getInicioTurno() {
        return inicioTurno;
    }

    public void setInicioTurno(Date inicioTurno) {
        this.inicioTurno = inicioTurno;
    }

    public Date getFinTurno() {
        return finTurno;
    }

    public void setFinTurno(Date finTurno) {
        this.finTurno = finTurno;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "departamento='" + departamento + '\'' +
                ", inicioTurno=" + inicioTurno +
                ", finTurno=" + finTurno +
                "} " + super.toString();
    }

    public Admin registrarAdmin() {
        // Lógica para registrar un administrador
        return null;
    }
}
