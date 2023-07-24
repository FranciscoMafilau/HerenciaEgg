/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidades;


public class aMotor extends Barco{
       private Integer potencia;
       private Integer precioDiario;
               
               
    public aMotor() {
        
    }

    public aMotor(Integer potencia, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        precioDiario = precioBase+potencia;
    }

    public Integer getPrecioDiario() {
        return precioDiario;
    }
    

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "aMotor{" + "potencia=" + potencia + '}';
    }
     
    public void CargarDatosaMotor(){
        crearBarco();
        System.out.println("Ingrese la potencia del motor");
        this.potencia=leer.nextInt();
    }
    
    @Override
     public double calcularModulo() {
        return super.calcularModulo() + potencia ;
    }
    
}
