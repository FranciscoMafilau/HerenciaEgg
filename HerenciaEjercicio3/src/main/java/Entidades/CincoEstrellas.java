/*
 Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */

package Entidades;


public class CincoEstrellas extends CuatroEstrellas {
      private Integer cantSalonesConfe;
      private Integer cantSuites;
      private Integer cantLimosinas;

    public CincoEstrellas(Integer cantSalonesConfe, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String encargado, String localidad, String direccion) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, nombre, encargado, localidad, direccion);
        this.cantSalonesConfe = cantSalonesConfe;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public CincoEstrellas() {
    }
   
    
      @Override
     public double calcularPrecioHabitacion() {
        return super.calcularPrecioHabitacion()+(cantLimosinas*15);
     } 
}
