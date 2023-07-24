package guia12_herencia_ej4_formas;

import Entidades.Circulo;
import Entidades.Rectangulo;


public class Guia12_herencia_ej4_formas {

    
    public static void main(String[] args) {
        Circulo c=new Circulo(4,8);
        System.out.println("el area es :  " + c.areaFormas());
        System.out.println("el perimetro es :" + c.perimetroFormas());
        Rectangulo r = new Rectangulo(4,5);
         System.out.println("el area es :  " + r.areaFormas());
        System.out.println("el perimetro es :" + r.perimetroFormas());      
    }

}
