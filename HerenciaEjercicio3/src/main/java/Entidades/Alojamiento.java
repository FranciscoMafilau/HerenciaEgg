/*
 Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
 */

package Entidades;


public abstract class Alojamiento {
  protected String nombre;
  protected String encargado;
  protected String localidad;
  protected String direccion;

    public Alojamiento(String nombre, String encargado, String localidad, String direccion) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.localidad = localidad;
        this.direccion = direccion;
    }

    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", encargado=" + encargado + ", localidad=" + localidad + ", direccion=" + direccion + '}';
    }
  
  public abstract double calcularPrecioHabitacion();
        
    
  
}
