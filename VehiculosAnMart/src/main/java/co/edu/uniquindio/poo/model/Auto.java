package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo {
    private int numeroDePuertas;
    public Auto (String numeroDeMatricula, String modelo, String marca, String añoDeFabricacion, int diasReserva, int numeroDePuertas, int precioBase){
        super(numeroDeMatricula, modelo, marca, añoDeFabricacion, diasReserva, precioBase);
        this.numeroDePuertas=numeroDePuertas;
    }
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public double calculoDecostoReserva(){
        double costoReserva= precioBase*diasReserva;
        return costoReserva;
    }

}
