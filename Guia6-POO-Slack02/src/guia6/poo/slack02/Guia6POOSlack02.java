/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package guia6.poo.slack02;

import Entidad.Tiempo;
import Servicio.ServicioTiempo;

/**
 *
 * @author Windows 10
 */
public class Guia6POOSlack02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioTiempo t = new ServicioTiempo();
       Tiempo tiempo = t.crearTiempo();
       t.pasoTiempo(tiempo);
    }
    
}
