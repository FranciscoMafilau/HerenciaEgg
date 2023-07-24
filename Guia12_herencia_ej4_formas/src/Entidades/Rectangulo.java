
package Entidades;


public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    
    public double areaFormas(){
        return base*altura;
    }
    
    public double perimetroFormas(){
        return (base+altura)*2;
    }
}
