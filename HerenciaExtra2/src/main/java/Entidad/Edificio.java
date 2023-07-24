/*
ancho, alto y largo.
 */

package Entidad;


public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    
}
