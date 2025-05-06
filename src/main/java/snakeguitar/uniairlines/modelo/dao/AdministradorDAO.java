/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import java.util.List;
import snakeguitar.uniairlines.modelo.entidades.usuarios.Administrador;

/**
 *
 * @author snake
 */
public interface AdministradorDAO {
    Administrador obtenerAdministradorPorIdentificador(int identificador);
    List<Administrador> obtenerAdministradores();
    void insertarAdministrador(Administrador admin);
    void actualizarAdministrador(Administrador admin);
    void eliminarAdministrador(int identificador);
}
