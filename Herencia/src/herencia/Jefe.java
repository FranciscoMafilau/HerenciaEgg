
package herencia;


public class Jefe extends Persona{
    int idJefe;
    String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int idJefe, String departamentoJefe) {
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
    
    
}
