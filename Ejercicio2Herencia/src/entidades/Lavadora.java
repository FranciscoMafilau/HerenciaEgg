package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
	this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, String consumo, Double peso) {
	super(precio, color, consumo, peso);
	this.carga = carga;
    }

    public Double getCarga() {
	return carga;
    }

    public void setCarga(Double carga) {
	this.carga = carga;
    }
/////para mostrar haccer un toString con los datos pasados a mano de la clase padre
    public void crearLavadora() {
    Scanner leer = new Scanner(System.in);
crearElectrodomestico();
    System.out.println("Ingrese la capacidad de carga: ");
    carga = leer.nextDouble();
    precioFinal();
    }

@Override
    public void precioFinal() {
super.precioFinal();
    if(getCarga()>30){
    setPrecio(getPrecio()+500);
}/////System.out.println("el precio final de la lavadora es: "+ getPrecio());
    }
}
