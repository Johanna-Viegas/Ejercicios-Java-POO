/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package guia6.poo.ej11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        GregorianCalendar fecha = new GregorianCalendar();
        GregorianCalendar fechaActual = new GregorianCalendar();
        System.out.println("Introducir un dia:");
        int dia = leer.nextInt();
        System.out.println("Introducir un mes:");
        int mes = leer.nextInt();
        System.out.println("Introducir un año:");
        int anio = leer.nextInt();
        fecha.set(anio, mes, dia);
        Date fechaAct = new Date();
        fechaActual.setTime(fechaAct);
       int dif = fechaActual.get(Calendar.YEAR)-fecha.get(Calendar.YEAR);
        System.out.println("FECHA: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR));
        System.out.println("FECHA ACTUAL: " + fechaActual.get(Calendar.DATE) + "/" + fechaActual.get(Calendar.MONTH) + "/" + fechaActual.get(Calendar.YEAR));
        System.out.println("DIFERENCIA EN AÑOS: " + dif);
    }
    
}
