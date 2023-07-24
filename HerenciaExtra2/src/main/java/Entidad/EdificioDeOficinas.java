/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import java.util.Scanner;


public class EdificioDeOficinas extends Edificio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Integer numOficinas;
    private Integer personasPorOficina;
    private Integer numPisos;

    public EdificioDeOficinas(Integer numOficinas, Integer personasPorOficina, Integer numPisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

   
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es "+ancho*largo);
    }

    @Override
    public void calcularVolumen() {
         System.out.println("El volumen del edificio es " +ancho*largo*alto);
    }
    
    public void cantPersonas(){
       /* System.out.println("Cuantas personas entran por oficina?");
        this.personasPorOficina=leer.nextInt();
        System.out.println("Cuantas oficinas hay por piso?");
        this.numOficinas=leer.nextInt();
        System.out.println("Cuantos pisos tiene el edificio");
        this.numPisos=leer.nextInt();
         */
       
        Integer porPiso=personasPorOficina*numOficinas;
        System.out.println("Por cada piso hay "+porPiso+" personas");
        System.out.println("Entran en el edificio una cantidad de  "+numOficinas*numPisos*personasPorOficina+" personas");
    }
}
