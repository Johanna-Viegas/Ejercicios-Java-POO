/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.Motor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Servicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Barco> barcos = new ArrayList<>();
    ArrayList<Alquiler> alquileres = new ArrayList<>();
        
    public void crearBarcos(){
    Barco b1 = new Barco("AS123DE",3,new Date(1995,05,23),"desocupado");
    Barco b2 = new Barco("AS127DE",4,new Date(1980,03,20),"desocupado");
    Velero b3 = new Velero(2,"AT164DE",3,new Date(1895,05,23),"desocupado");
    Velero b4 = new Velero(1,"BS523DE",3,new Date(2001,01,10),"desocupado");
    Motor b5 = new Motor(3,"FG186DE",3,new Date(2011,02,12),"desocupado");
    Motor b6 = new Motor(2,"FG186DE",3,new Date(2011,02,12),"desocupado");
    Yate b7 = new Yate(1,3,"FG186DE",3,new Date(2011,02,12),"desocupado");
    Yate b8 = new Yate(2,2,"FG186DE",3,new Date(2011,02,12),"desocupado");
        
        
        
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);
        barcos.add(b4);
        barcos.add(b5);
        barcos.add(b6);
        barcos.add(b7);
        barcos.add(b8); 
    }
    
    public void mostrarBarcos(){
        for (Barco barco : barcos) {
            System.out.println(barco.toString()); 
        }
    }
    
        public void mostrarBarcosDisponibles(){
            int i =0;
        for (Barco barco : barcos) {
            if(barco.getOcupado().equals("desocupado")){
            System.out.println(i +  barco.toString()); 
            }
            i+=1;
        }
    }
    
    /*
        private String nombre;
    private long dni;
    private Date fechaAlq;
    private Date fechaDev;
    private Integer Posicion;
    private Barco tipo;
        */
        public void nuevoAlquiler(){
            Alquiler a = new Alquiler();
            System.out.print("Nombre: ");
            a.setNombre(leer.next());
            System.out.print("DNI: ");
            a.setDni(leer.nextLong());
            System.out.print("Fecha de Alquiler: ");
            a.setFechaAlq(new Date(leer.nextInt(),leer.nextInt(),leer.nextInt()));
            System.out.print("Fecha de Devolucion: ");
            a.setFechaDev(new Date(leer.nextInt(),leer.nextInt(),leer.nextInt()));
            System.out.println("En que posicion se quedaran?");
            a.setPosicion(leer.nextInt());
            System.out.println("Que tipo de barco desea elegir de los que tenemos disponibles?");
            mostrarBarcosDisponibles();
            int pos = leer.nextInt();
            a.setPos(pos);
            System.out.println("El precio del alquiler será de $" + precioAlquiler(a));
            alquileres.add(a);
        
    }   
    
    public Integer precioAlquiler(Alquiler a){
        barcos.get(a.getPos()).setOcupado("ocupado");
        long diff = a.getFechaDev().getTime() - a.getFechaAlq().getTime();
        int dias = (int) (diff*0.000000012);
        System.out.println("Dias: " + dias );
        int modulo = 10*barcos.get(a.getPos()).getEslora();
        for (Barco barco : barcos) {
            if(barco instanceof Yate){
                modulo += ((Yate) barco).getCamarotes() + ((Yate) barco).getPotenciaCV();
 
            }
            if(barco instanceof Motor){
                modulo += ((Motor) barco).getPotenciaCV();
 
            }
            if(barco instanceof Velero){
                modulo += ((Velero) barco).getMastiles();
 
            }
        }
        int precio = dias*modulo;
        return precio;
    }
}
