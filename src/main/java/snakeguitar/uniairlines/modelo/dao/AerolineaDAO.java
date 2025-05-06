/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import snakeguitar.uniairlines.modelo.entidades.Aerolinea;

/**
 *
 * @author snake
 */
public interface AerolineaDAO {
    Aerolinea obtenerAerolineaPorIdentificador(int identificador);
    Aerolinea obtenerAerolineaPorICAO(String ICAO);
    void insertarAerolinea(Aerolinea aerolinea);
    void actualizarAerolinea(Aerolinea aerolinea);
    void eliminarAerolinea(int identificador);
    void eliminarAerolinea(String ICAO);
}
