/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import snakeguitar.uniairlines.modelo.entidades.Cliente;

/**
 *
 * @author snake
 */
public interface ClienteDAO {
    Cliente obtenerClientePorIdentificador(int identificador);
    Cliente obtenerClientePorNombre(String nombre);
    void insertarCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(int identificador, String nombre);
    void eliminarCliente(int identificador);
    void eliminarCliente(String nombre);
}