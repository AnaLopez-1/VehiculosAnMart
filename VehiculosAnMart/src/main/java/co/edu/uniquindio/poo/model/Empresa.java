package co.edu.uniquindio.poo.model;
import java.util.LinkedList;
public class Empresa {
    private String nombre;
    private LinkedList<Camioneta> camionetas;
    private LinkedList<Moto> motos;
    private LinkedList<Auto> autos;
    
    public Empresa(String nombre, Camioneta camionetas, Moto motos, Auto autos){
        this.nombre=nombre;
        this.camionetas= new LinkedList<>();
        this.motos= new LinkedList<>();
        this.autos= new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Camioneta> getCamionetas() {
        return camionetas;
    }
    public void setCamionetas(LinkedList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }
    public LinkedList<Moto> getMotos() {
        return motos;
    }
    public void setMotos(LinkedList<Moto> motos) {
        this.motos = motos;
    }
    public LinkedList<Auto> getAutos() {
        return autos;
    }
    public void setAutos(LinkedList<Auto> autos) {
        this.autos = autos;
    }
    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", camionetas=" + camionetas + ", motos=" + motos + ", autos=" + autos
                + "]";
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
