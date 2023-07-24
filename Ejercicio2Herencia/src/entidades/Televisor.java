package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

    private Double resolucion;

    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizador) {
	this.resolucion = resolucion;
	this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
	return resolucion;
    }

    public void setResolucion(Double resolucion) {
	this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
	return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
	this.sintonizador = sintonizador;
    }

    public Double getPrecio() {
	return precio;
    }

    public void setPrecio(Double precio) {
	this.precio = precio;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public String getConsumo() {
	return consumo;
    }

    public void setConsumo(String consumo) {
	this.consumo = consumo;
    }

    public Double getPeso() {
	return peso;
    }

    public void setPeso(Double peso) {
	this.peso = peso;
    }

    public Televisor(Double resolucion, boolean sintonizador, Double precio, String color, String consumo, Double peso) {
	super(precio, color, consumo, peso);
	this.resolucion = resolucion;
	this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
      Scanner leer = new Scanner(System.in);
     crearElectrodomestico();
     System.out.println("Ingrese Resolucion en pulgadas");
        setResolucion(leer.nextDouble());
        
        System.out.println("Tiene Sitonizador ");
        String conSinto = leer.next();
        if(conSinto.equalsIgnoreCase("S")){
           setSintonizador(true);            
        }
        precioFinal();
}


@Override
    public void precioFinal() {
super.precioFinal();
    if(getResolucion()>40){
	
    setPrecio(getPrecio()*0.30);
}
if(isSintonizador()){
    setPrecio(getPrecio()+500);
} ////System.out.println("el precio final del TV  es: " + getPrecio());
  }   
}