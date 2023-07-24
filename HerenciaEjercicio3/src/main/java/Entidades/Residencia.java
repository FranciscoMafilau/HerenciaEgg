/*
 Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */

package Entidades;


public abstract class Residencia extends AlojamientoExtraHotelero {
   
    private Integer cantHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia(Integer cantHabitaciones, boolean descuento, boolean campoDeportivo) {
	this.cantHabitaciones = cantHabitaciones;
	this.descuento = descuento;
	this.campoDeportivo = campoDeportivo;
    }

 

    public Residencia() {
       
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
}
