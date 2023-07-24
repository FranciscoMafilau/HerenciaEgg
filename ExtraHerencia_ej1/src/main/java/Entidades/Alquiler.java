/*
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */

package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Alquiler {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Long dni;
    private LocalDate fechaAlquiler; 
    private LocalDate fechaDevolucion;
    private long diferenciaEnDias;
    private Double costoAlquiler;
    private Barco barcoAlquilado;

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    public Alquiler crearAlquiler(){
        
        System.out.println("Ingrese su nombre;");
        this.nombre = leer.next();
        System.out.println("Ingrese su DNI");
        this.dni=leer.nextLong();
        System.out.println("Ingrese año,mes y dia de alquiler en orden");
        Integer anio=leer.nextInt();
        Integer mes= leer.nextInt();
        Integer dia=leer.nextInt();
        this.fechaAlquiler = LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese año,mes y dia de devolucion en orden");
        anio=leer.nextInt();
        mes= leer.nextInt();
        dia=leer.nextInt();
        this.fechaDevolucion = LocalDate.of(anio, mes, dia);
        this.diferenciaEnDias = calcularDiferenciaEnDias(fechaAlquiler, fechaDevolucion);
        this.barcoAlquilado=crearBarco();
        this.costoAlquiler=(barcoAlquilado.calcularModulo()*diferenciaEnDias);
       
        
      return this;
    }
    
    public long calcularDiferenciaEnDias(LocalDate fechaInicial,LocalDate fechaFinal){
        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }
    
    public Barco crearBarco(){
         System.out.println("Que barco desea añadir");
         Barco aux = new Barco();
         Integer opcion=leer.nextInt();
         switch (opcion) {
            case 1:
                aux=crearYate();
                break;
            case 2:
                aux=crearaMotor();
                break;
            case 3:
                aux=crearVelero();
                break;
            default:
                System.out.println("Ingreso una opcion erronea");
        }
        return aux; 
    }
    
    public Yate crearYate(){
        Yate aux= new Yate();
        aux.CargarDatosYate();
        
        return aux;
    }
   
    public aMotor crearaMotor(){
        aMotor aux= new aMotor();
        aux.CargarDatosaMotor();
        return aux;
    }
    
    public Velero crearVelero(){
        Velero aux= new Velero();
        aux.CargarDatosVelero();
        return aux;
    }

    public Double getCostoAlquiler() {
        return costoAlquiler;
    }
    
    
    
    
}
