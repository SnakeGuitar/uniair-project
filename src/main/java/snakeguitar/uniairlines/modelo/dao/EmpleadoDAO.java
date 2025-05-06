/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakeguitar.uniairlines.modelo.dao;

import java.util.List;
import snakeguitar.uniairlines.modelo.entidades.usuarios.Empleado;

/**
 *
 * @author snake
 */
public interface EmpleadoDAO {
    Empleado obtenerEmpleadoPorIdentificador(int identificador);
    List<Empleado> obtenerEmpleados();
    void insertarEmpleado(Empleado admin);
    void actualizarEmpleado(Empleado admin);
    void eliminarEmpleado(int identificador, String nombre);
}
