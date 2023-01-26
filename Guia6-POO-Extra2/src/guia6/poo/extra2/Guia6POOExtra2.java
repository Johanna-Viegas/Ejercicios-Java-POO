/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package guia6.poo.extra2;

import Entidad.Puntos;
import Servicio.ServicioPuntos;

/**
 *
 * @author Windows 10
 */
public class Guia6POOExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPuntos p = new ServicioPuntos();
        Puntos punto = p.crearPuntos();
        System.out.println("La distancia entre los puntos P1( " + punto.getX1() + "," + punto.getY1() + ") y P2 (" + punto.getX2() + "," + punto.getY2() + ") es de: " + p.calcularDistancia( punto ));
    }
    
}
