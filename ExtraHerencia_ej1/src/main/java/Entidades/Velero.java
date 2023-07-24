/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidades;


public class Velero extends Barco {
     private Integer numeroMastiles;
     private Integer precioDiario;
     

    public Velero(Integer numeroMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
        precioDiario=numeroMastiles+precioBase;
    }

   

    public Integer getPrecioDiario() {
        return precioDiario;
    }

   

    public Velero() {
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }
     
     public void CargarDatosVelero(){
         super.crearBarco();
         System.out.println("Cuantos mastiles tiene el velero");
         this.numeroMastiles=leer.nextInt();
     }
     
     @Override
     public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}
