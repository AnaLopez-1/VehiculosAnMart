package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo {
    private double capacidadDeCarga;
    public Camioneta (String numeroDeMatricula, String modelo, String marca, String añoDeFabricacion, int diasReserva, double capacidadDeCarga, int precioBase){
        super(numeroDeMatricula, modelo, marca, añoDeFabricacion, diasReserva, precioBase);
        this.capacidadDeCarga=capacidadDeCarga;
    }
    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }
    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }
    @Override
    public double calculoDecostoReserva(){
        double calculoDecostoReserva;
        if(capacidadDeCarga<=10){
            calculoDecostoReserva= precioBase+(precioBase*0.2)*diasReserva;
        }else{
            if(capacidadDeCarga>10 && capacidadDeCarga <=15){
                calculoDecostoReserva= precioBase+(precioBase*0.1)*diasReserva;
            }else{
                if(capacidadDeCarga>15){
                    calculoDecostoReserva= precioBase+(precioBase*0.5)*diasReserva;
                }else{
                    calculoDecostoReserva= precioBase*diasReserva;
                }
            }
        }
        return calculoDecostoReserva;
    }
}
