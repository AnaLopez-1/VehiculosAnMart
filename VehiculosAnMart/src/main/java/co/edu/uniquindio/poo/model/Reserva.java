package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reserva {
    // Atributos
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String cliente;
    private String vehiculo;
    private double costo;

    // Constructor
    public Reserva(LocalDate fechaInicio, LocalDate fechaFin, String cliente, String vehiculo, double costo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.costo = costo;
    }

    // Métodos getters y setters
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Método para mostrar información de la reserva (opcional)
    @Override
    public String toString() {
        return "Reserva{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", cliente='" + cliente + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                ", costo=" + costo +
                '}';
    }
}
