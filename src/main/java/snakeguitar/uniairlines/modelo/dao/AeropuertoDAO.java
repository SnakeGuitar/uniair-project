/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import snakeguitar.uniairlines.modelo.entidades.Aeropuerto;

/**
 *
 * @author snake
 */
public interface AeropuertoDAO {
    Aeropuerto obtenerAeropuertoPorIdentificador(int identificador);
    Aeropuerto obtenerAeropuertoPorNombre(String nombre);
    void insertarAeropuerto(Aeropuerto aeropuerto);
    void actualizarAeropuerto(Aeropuerto aeropuerto);
    void eliminarAeropuerto(int identificador);
    void eliminarAeropuerto(String nombre);
}
