/*
 Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPuntos {
    
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos punto = new Puntos();
        System.out.println("Ingresar la posicion del primer punto (x,y)");
        punto.setX1(leer.nextDouble());
        punto.setY1(leer.nextDouble());
        System.out.println("Ingresar la posicion del segundo punto (x,y)");
        punto.setX2(leer.nextDouble());
        punto.setY2(leer.nextDouble());
        return punto;
    }
    
    public double calcularDistancia( Puntos punto){
        return Math.sqrt((Math.pow((punto.getX2()-punto.getX1()), 2)+(Math.pow((punto.getY2()-punto.getY1()),2))));
    }
}
