
package Servicio;

import Entidades.Alquiler;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioAlquiler {
      private ArrayList<Alquiler> listaAlquileres = new ArrayList();
      private  Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      public void añadirAlquiler(){
          System.out.println("Cuantos alquileres desea añadir");
          int cantidad=leer.nextInt();
          for (int i = 0; i < cantidad; i++) {
              Alquiler aux= new Alquiler();
              aux.crearAlquiler();
              listaAlquileres.add(aux);
          }
      }
      public void mostrarAlquileres(){
          for (Alquiler aux : listaAlquileres) {
              System.out.println(aux.getBarcoAlquilado().toString());
          }
      }
      public void calcularPrecio(){
        
          for (Alquiler aux : listaAlquileres) {
              System.out.println("El precio es"+ aux.getCostoAlquiler());
          }
      }
}
