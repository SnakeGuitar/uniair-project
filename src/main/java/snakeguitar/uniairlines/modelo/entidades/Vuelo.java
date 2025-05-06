/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakeguitar.uniairlines.modelo.entidades;

import java.time.Duration;
import java.util.Date;

/**
 *
 * @author snake
 */
public class Vuelo {
    int identificador;
    String codigoVuelo;
    int cantidadPasajeros;
    Aeropuerto aeropuertoSalida;
    Aeropuerto aeropuertoLlegada;
    Date fechaSalida;
    Date fechaLlegada;
    Date horaSalida;
    Date horaLlegada;
    Duration duracionVuelo;
    int puertaSalida;
    int puertaLlegada;
    double precioClaseTurista;
    double precioClaseEjecutiva;
    double precioPrimeraClase;

    public Vuelo() {}

    public Vuelo(int identificador, String codigoVuelo, int cantidadPasajeros, Aeropuerto aeropuertoSalida,
                     Aeropuerto aeropuertoLlegada, Date fechaSalida, Date fechaLlegada,
                     Date horaSalida, Date horaLlegada, Duration duracionVuelo,
                     int puertaSalida, int puertaLlegada, double precioClaseTurista,
                     double precioClaseEjecutiva, double precioPrimeraClase) {
            this.identificador = identificador;
            this.codigoVuelo = codigoVuelo;
            this.cantidadPasajeros = cantidadPasajeros;
            this.aeropuertoSalida = aeropuertoSalida;
            this.aeropuertoLlegada = aeropuertoLlegada;
            this.fechaSalida = fechaSalida;
            this.fechaLlegada = fechaLlegada;
            this.horaSalida = horaSalida;
            this.horaLlegada = horaLlegada;
            this.duracionVuelo = duracionVuelo;
            this.puertaSalida = puertaSalida;
            this.puertaLlegada = puertaLlegada;
            this.precioClaseTurista = precioClaseTurista;
            this.precioClaseEjecutiva = precioClaseEjecutiva;
            this.precioPrimeraClase = precioPrimeraClase;
        }
     
        public int getIdentificador() {
            return identificador;
        }
        
        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        public String getCodigoVuelo() {
            return codigoVuelo;
        }

        public void setCodigoVuelo(String codigoVuelo) {
            this.codigoVuelo = codigoVuelo;
        }

        public int getCantidadPasajeros() {
            return cantidadPasajeros;
        }

        public void setCantidadPasajeros(int cantidadPasajeros) {
            this.cantidadPasajeros = cantidadPasajeros;
        }

        public Aeropuerto getAeropuertoSalida() {
            return aeropuertoSalida;
        }

        public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
            this.aeropuertoSalida = aeropuertoSalida;
        }

        public Aeropuerto getAeropuertoLlegada() {
            return aeropuertoLlegada;
        }

        public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
            this.aeropuertoLlegada = aeropuertoLlegada;
        }

        public Date getFechaSalida() {
            return fechaSalida;
        }

        public void setFechaSalida(Date fechaSalida) {
            this.fechaSalida = fechaSalida;
        }

        public Date getFechaLlegada() {
            return fechaLlegada;
        }

        public void setFechaLlegada(Date fechaLlegada) {
            this.fechaLlegada = fechaLlegada;
        }

        public Date getHoraSalida() {
            return horaSalida;
        }

        public void setHoraSalida(Date horaSalida) {
            this.horaSalida = horaSalida;
        }

        public Date getHoraLlegada() {
            return horaLlegada;
        }

        public void setHoraLlegada(Date horaLlegada) {
            this.horaLlegada = horaLlegada;
        }

        public Duration getDuracionVuelo() {
            return duracionVuelo;
        }

        public void setDuracionVuelo(Duration duracionVuelo) {
            this.duracionVuelo = duracionVuelo;
        }

        public int getPuertaSalida() {
            return puertaSalida;
        }

        public void setPuertaSalida(int puertaSalida) {
            this.puertaSalida = puertaSalida;
        }

        public int getPuertaLlegada() {
            return puertaLlegada;
        }

        public void setPuertaLlegada(int puertaLlegada) {
            this.puertaLlegada = puertaLlegada;
        }

        public double getPrecioClaseTurista() {
            return precioClaseTurista;
        }

        public void setPrecioClaseTurista(double precioClaseTurista) {
            this.precioClaseTurista = precioClaseTurista;
        }

        public double getPrecioClaseEjecutiva() {
            return precioClaseEjecutiva;
        }

        public void setPrecioClaseEjecutiva(double precioClaseEjecutiva) {
            this.precioClaseEjecutiva = precioClaseEjecutiva;
        }

        public double getPrecioPrimeraClase() {
            return precioPrimeraClase;
        }

        public void setPrecioPrimeraClase(double precioPrimeraClase) {
            this.precioPrimeraClase = precioPrimeraClase;
        }
}
