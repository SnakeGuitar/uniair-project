/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import snakeguitar.uniairlines.modelo.entidades.Avion;

/**
 *
 * @author snake
 */
public interface AvionDAO {
    Avion obtenerAvionPorIdentificador(int identificador);
    Avion obtenerAvionPorMatricula(String matricula);
    void insertarAvion(Avion avion);
    void actualizarAvion(Avion avion);
    void eliminarAvion(int identificador);
    void eliminarAvion(String matricula);
}
