/*
 Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package guia6.poo.slack01;

import Entidad.Fracciones;
import Servicio.ServicioFracciones;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOSlack01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioFracciones f = new ServicioFracciones();
        Fracciones fracciones = f.crearFraccion();
        int opc = 0;
        do{
            System.out.println(" MENU ");
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    f.suma(fracciones);
                    break;
                case 2:
                    f.resta(fracciones);
                    break;
                case 3:
                    f.multiplicacion(fracciones);
                    break;
                case 4:
                    f.division(fracciones);
                    break;    
            }
    }while (opc>0 && opc<5);
    
}
