/*
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */

package Entidades;

import java.util.Scanner;


public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     protected String matricula;
     protected Integer eslora;
     protected Integer anioFabricacion;
     protected Integer precioBase;
     
     // GETTERS SETTERS //

    public String getMatricula() {
        return matricula;
        
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }
     
    
    // CONST //

    public Barco(String matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.precioBase=eslora*10;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        
    }

    public Barco() {
        
    }
    
    // METODOS //

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
     
    public void crearBarco(){
        System.out.println("Ingrese tamaño de la eslora");
        this.eslora= leer.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        this.anioFabricacion= leer.nextInt();
        System.out.println("Ingrese la matricula");
        this.matricula= leer.next();
    }
    
    public double calcularModulo() {
        return this.eslora * 10;
    }
    
     
     
}
