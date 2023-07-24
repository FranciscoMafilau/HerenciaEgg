/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidades;


public class Yate extends Barco {
     private Integer cantCamarotes;
     private Integer potencia;
     private Integer precioDiario;

    public Yate(String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.precioDiario= precioBase+potencia+cantCamarotes;
    }

    public Yate() {
        
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getPrecioDiario() {
        return precioDiario;
    }

    

    @Override
    public String toString() {
        return "Yate{" +"eslora" + eslora + "matricula"+ matricula + "cantCamarotes=" + cantCamarotes + ", potencia=" + potencia + '}';
    }

    public void  CargarDatosYate(){
        this.crearBarco();
        System.out.println("Cuantos camarotes tiene el yate");
        this.cantCamarotes=leer.nextInt();
        System.out.println("Cuanta potencia tiene el yate");
        this.potencia=leer.nextInt();
        
    }
     @Override
     public double calcularModulo() {
        return super.calcularModulo() + potencia + cantCamarotes;
    }
     
     
}
