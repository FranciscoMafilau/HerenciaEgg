/*
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
 */

package Entidades;


public class Hotel extends Alojamiento {
     protected Integer cantHabitaciones;
     protected Integer numCamas;
     protected Integer cantPisos;
     protected Double precioHabitacion;
      
     
    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String encargado, String localidad, String direccion) {
        super(nombre, encargado, localidad, direccion);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = 50.0;
    }

    public Hotel() {
       
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
     
    
    
    
    @Override
    public double calcularPrecioHabitacion() {
        return precioHabitacion*cantHabitaciones;
    }
        
    
     
     
}
