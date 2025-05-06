/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import java.util.Date;
import java.util.List;
import snakeguitar.uniairlines.modelo.entidades.Vuelo;

/**
 *
 * @author snake
 */
public interface VueloDAO {
    Vuelo obtenerVuueloPorIdentificador(int identificador);
    Vuelo obtenerVueloPorCodigoVuelo(int codigoVuelo);
    List<Vuelo> obtenerVuelos();
    void insertarVuelo(Vuelo vuelo);
    void actualizarVuelo(Vuelo vuelo);
    void eliminarVuelo(int identificador, String codigoVuelo, String nombre,
            Date fechaSalida, Date fechaLlegada);
}
