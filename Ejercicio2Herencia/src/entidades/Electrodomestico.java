package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;

    protected String color;

    protected String consumo;
    protected Double peso;

    public Electrodomestico() {
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

    public Electrodomestico(Double precio, String color, String consumo, Double peso) {
	this.precio = precio;
	this.color = color;
	this.consumo = consumo;
	this.peso = peso;
    }

    public String comprobarConsumo(String letra) {

	if (!(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("E"))) {
	    letra = "F";
	}
	return letra;
    }

    public String comprobarColor(String color) {
	if (!(color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Gris"))) {
	    color = "Blanco";
	}
	return color;
    }

    public void crearElectrodomestico() {
	Scanner leer = new Scanner(System.in);

	this.precio = 1000d;/////la "d" es de double
	System.out.println("Ingrese el color: ");
	this.color = leer.next();
	System.out.println("Ingrese el consumo energético: ");
	this.consumo = leer.next();
	System.out.println("Ingrese el peso: ");
	this.peso = leer.nextDouble();
	comprobarConsumo(consumo);
	comprobarColor(color);

    }

    public void precioFinal() {
	Double precioFinal = precio;
	switch (consumo) {
	    case "A":
		precioFinal += 1000;
		break;
	    case "B":
		precioFinal += 800;
		break;
	    case "C":
		precioFinal += 600;
		break;
	    case "D":
		precioFinal += 500;
		break;
	    case "E":
		precioFinal += 300;
		break;
	    case "F":
		precioFinal += 100;
		break;
	}
	if (peso <= 19) {
	    precioFinal += 100;
	} else if (peso > 19 && peso <= 49) {
	    precioFinal += 500;
	} else if (peso > 49 && peso <= 79) {
	    precioFinal += 800;
	} else {
	    precioFinal += 1000;
	}precio = precioFinal;
	System.out.println("el precio final del producto es: " + getPrecio());
    } 
}
