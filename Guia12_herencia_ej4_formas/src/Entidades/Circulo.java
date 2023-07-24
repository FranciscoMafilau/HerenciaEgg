
package Entidades;

import Interfaz.CalculosFormas;


public class Circulo implements CalculosFormas{
    private double radio;
    private double diametro;
    
    
    @Override
    public double areaFormas(){
        return PI * Math.pow(radio,2);
    }
    
     @Override
    public double perimetroFormas(){
        return PI * diametro;
        
    }

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
}
