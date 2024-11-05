package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private TipoTransmision tipoTransmision;
    public Moto(String numeroDeMatricula, String modelo, String marca, String añoDeFabricacion, int diasReserva, TipoTransmision tipoTransmision, int precioBase){
        super(numeroDeMatricula, modelo, marca, añoDeFabricacion, diasReserva, precioBase);
        this.tipoTransmision=tipoTransmision;
    }
    
    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    
    @Override
    public double calculoDecostoReserva(){
        double calculoDecostoReserva;
        if(tipoTransmision==TipoTransmision.AUTOMATICA){
            calculoDecostoReserva= precioBase+25.000;
        }else{
            calculoDecostoReserva= precioBase;
        }
        return calculoDecostoReserva;
    }
}
