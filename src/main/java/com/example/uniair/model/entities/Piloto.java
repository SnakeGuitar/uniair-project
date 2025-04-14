package com.example.uniair.model.entities;

import com.example.uniair.model.enums.LicenciaAeronautica;

import java.time.Duration;
import java.util.Date;

public class Piloto extends Empleado {
    private LicenciaAeronautica tipoLicencia;
    private Date fechaCertificacion;
    Duration horasVuelo;

    public Piloto(String identificador, String nombre, String direccion,
                  String telefono, String correo, Date fechaNacimiento,
                  Date fechaContratacion, String genero, double salario,
                  String usuario, String claveAcceso, LicenciaAeronautica tipoLicencia,
                  Date fechaCertificacion, Duration horasVuelo) {
        super(identificador, nombre, direccion,
                telefono, correo, fechaNacimiento,
                fechaContratacion, genero, salario,
                usuario, claveAcceso);
        this.tipoLicencia = tipoLicencia;
        this.fechaCertificacion = fechaCertificacion;
        this.horasVuelo = horasVuelo;
    }

    public LicenciaAeronautica getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(LicenciaAeronautica tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Date getFechaCertificacion() {
        return fechaCertificacion;
    }

    public void setFechaCertificacion(Date fechaCertificacion) {
        this.fechaCertificacion = fechaCertificacion;
    }

    public Duration getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(Duration horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "tipoLicencia=" + tipoLicencia +
                ", fechaCertificacion=" + fechaCertificacion +
                ", horasVuelo=" + horasVuelo +
                "} " + super.toString();
    }
}
