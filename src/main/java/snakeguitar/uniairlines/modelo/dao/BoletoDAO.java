/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import snakeguitar.uniairlines.modelo.entidades.Boleto;

/**
 *
 * @author snake
 */
public interface BoletoDAO {
    Boleto obtenerBoleto(int identificador, String codigoVuelo);
    void insertarBoleto(Boleto boleto);
    void actualizarBoleto(Boleto boleto);
    void eliminarBoleto(int identificador, String codigoVuelo);
}
