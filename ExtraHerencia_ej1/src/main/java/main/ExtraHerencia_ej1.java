

package main;

import Servicio.ServicioAlquiler;

/**
 *
 * @author Julia
 */
public class ExtraHerencia_ej1 {

    public static void main(String[] args) {
        ServicioAlquiler sv = new ServicioAlquiler();
        sv.añadirAlquiler();
        sv.mostrarAlquileres();
        sv.calcularPrecio();
    }
}
