
package herencia;


public class Herencia {

    
    public static void main(String[] args) {
     
       
       Consultor c1 = new Consultor();
       c1.getNumConsultor();
       c1.getNombre();
       
       Empleado e1 = new Empleado();
       e1.getNombre();
       e1.getApellido();
       
       Persona vector[] = new Persona[5];
       vector[0] = new Persona();
       vector[1] = new Empleado();
       vector[2] = new Consultor();
       vector[3] = new Jefe();
       
       Persona p1 = new Persona();
       Consultor c2 = new Consultor();
       
       p1=c2; //asigno un objeto a otro objeto porque es una clase hija a la clase padre
       
    }
    
}
