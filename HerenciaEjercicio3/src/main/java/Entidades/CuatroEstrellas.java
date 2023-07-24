/*
 Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */

package Entidades;


public class CuatroEstrellas extends Hotel {
      protected String gimnasio;
      protected String nombreRestaurante;
      protected Integer capacidadRestaurante;

    public CuatroEstrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String encargado, String localidad, String direccion) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, encargado, localidad, direccion);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

   

    

    public CuatroEstrellas() {
        
    }

   
      @Override
      public double calcularPrecioHabitacion() {
          Integer precioAniadido;
          if(capacidadRestaurante<30){
              precioAniadido=10;
          }else if(capacidadRestaurante<50){
              precioAniadido=30;
          }else{
              precioAniadido=50;
          }
          if(gimnasio.equalsIgnoreCase("A")){
              precioAniadido+=50;
          }else{
              precioAniadido+=30;
          }
        return super.calcularPrecioHabitacion()+precioAniadido;
    }
      
      
}
