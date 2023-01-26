/*
y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioTiempo {
    
    public Tiempo crearTiempo(){
        Scanner leer = new Scanner(System.in);
        Tiempo t = new Tiempo();
        System.out.println("Ingresar su hora en HH MM SS");
        t.setHoras(leer.nextInt());
        while (t.getHoras()>24){
            System.out.println("no hay mas de 24 horas en un dia...");
            t.setHoras(leer.nextInt());
        }
        t.setMinutos(leer.nextInt());
        while (t.getMinutos()>59){
            System.out.println("no hay mas de 60 minutos en una hora...");
            t.setMinutos(leer.nextInt());
        }             
        t.setSegundos(leer.nextInt());
        while (t.getMinutos()>59){
            System.out.println("no hay mas de 60 segundos en un minuto...");
            t.setSegundos(leer.nextInt());
        }
        return t;      
    }
    
    public void pasoTiempo(Tiempo t){
        System.out.println("El tiempo pasa volando, no lo desperdicies...");
        for (int i = 0; i < 80; i++) {
            if (t.getSegundos()<59){
                t.setSegundos(t.getSegundos()+1);
            } else {
                t.setSegundos(0);
                t.setMinutos(t.getMinutos()+1);
            }
            System.out.println(t.getHoras() + ":" + t.getMinutos() + ":" + t.getSegundos());
        }
    }
}
