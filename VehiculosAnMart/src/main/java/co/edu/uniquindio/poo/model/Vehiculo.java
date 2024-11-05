package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    public String numeroDeMatricula;
    public String modelo;
    public String marca;
    public String añoDeFabricacion;
    public int diasReserva;
    public int precioBase;
    public Vehiculo(String numeroDeMatricula, String modelo, String marca, String añoDeFabricacion, int diasReserva, int precioBase){
        this.numeroDeMatricula= numeroDeMatricula;
        this.modelo=modelo;
        this.marca=marca;
        this.añoDeFabricacion=añoDeFabricacion;
        this.diasReserva=diasReserva;
        this.precioBase=precioBase;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public int getDiasReserva() {
        return diasReserva;
    }
    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }
    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }
    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAñoDeFabricacion() {
        return añoDeFabricacion;
    }
    public void setAñoDeFabricacion(String añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
    public abstract double calculoDecostoReserva();

    
    @Override
    public String toString() {
        return "vehiculo [numeroDeMatricula=" + numeroDeMatricula + ", modelo=" + modelo + ", marca=" + marca
                + ", añoDeFabricacion=" + añoDeFabricacion + ", diasReserva=" + diasReserva + ", precioBase="
                + precioBase + "]";
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}