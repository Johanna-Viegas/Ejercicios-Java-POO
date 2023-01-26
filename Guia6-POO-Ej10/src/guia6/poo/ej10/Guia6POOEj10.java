/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guia6.poo.ej10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int tamA = 50;
       int tamB = 20;
       double[] arregloA = new double[tamA];
       double[] arregloB = new double[tamB];
       rellenar(arregloA, tamA);
        System.out.println(" ARREGLO A");
       imprimir(arregloA, tamA); 
       Arrays.sort(arregloA);
       rellenar2(arregloB, arregloA, tamB);
        System.out.println(" ARREGLO A ORDENADO");
        imprimir(arregloA, tamA);
        System.out.println(" ARREGLO B");
        imprimir(arregloB, tamB);
    }
    
    public static void rellenar(double[] arregloA, int tamA){
        for (int i = 0; i < tamA; i++) {
            arregloA[i]= (double) Math.floor(Math.random() * 10);
        }
    }
    
    public static void imprimir(double[] arregloA, int tamA){
        for (int i = 0; i < tamA; i++) {
            System.out.print("[" + arregloA[i] + "]");
        }
        System.out.println("");
    }
    public static void rellenar2(double[] arregloB,double[] arregloA, int tamB){
        for (int i = 0; i < tamB; i++) {
           if (i<10){
               arregloB[i]=arregloA[i];
           } else {
               arregloB[i]= 0.5;
           }
        }
    }
}
