/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.herenciaextra2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Julia
 */
public class HerenciaExtra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> listaDeEdificios = new ArrayList();
        Edificio poliA = new Polideportivo("Pepito", false, 100, 60, 200);
        Edificio poliB = new Polideportivo("Presidente AquilesBailo", true, 150, 30, 300);
        Edificio oficinaA = new EdificioDeOficinas(3, 20, 7, 50, 70, 30);
        Edificio oficinaB = new EdificioDeOficinas(1, 15, 10, 40, 95, 40);
        listaDeEdificios.add(poliA);
        listaDeEdificios.add(poliB);
        listaDeEdificios.add(oficinaA);
        listaDeEdificios.add(oficinaB);
        int techados=0;
        
        for (Edificio aux : listaDeEdificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
            if(aux instanceof Polideportivo){
               if(((Polideportivo) aux).isTechado()) {
                   techados++;
               }
            }
            if(aux instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) aux).cantPersonas();
            }
            System.out.println("===========================");
        }
        System.out.println("Hay "+techados+" polideportivo(s) techado(s) "); 
       
    }
}
