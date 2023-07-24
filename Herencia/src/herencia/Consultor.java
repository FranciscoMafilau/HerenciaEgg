
package herencia;


public class Consultor extends Persona {
    int numConsultor;

    public Consultor() {
    }

    public Consultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }

    public Consultor(int numConsultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numConsultor = numConsultor;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
    
    
}
