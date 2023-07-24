/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;


public class Polideportivo extends Edificio {
     private String nombre;
     private boolean techado;

    public Polideportivo(String nombre, boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

   
     
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo es "+ancho*largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo es " +ancho*largo*alto);
    }
}
