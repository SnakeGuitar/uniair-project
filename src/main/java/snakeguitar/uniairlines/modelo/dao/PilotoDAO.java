/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import java.util.Date;
import java.util.List;
import snakeguitar.uniairlines.modelo.entidades.Piloto;
import snakeguitar.uniairlines.modelo.enums.LicenciaAeronautica;

/**
 *
 * @author snake
 */
public interface PilotoDAO {
    Piloto obtenerEmpleadoPorIdentificador(int identificador);
    Piloto obtenerEmpleadoPorLicencia(LicenciaAeronautica tipoLicencia, Date fechaCertificacion);
    List<Piloto> obtenerPilotos();
    void insertarPiloto(Piloto piloto);
    void actualizarPiloto(Piloto piloto);
    void eliminarPiloto(int identificador, String nombre);
}
