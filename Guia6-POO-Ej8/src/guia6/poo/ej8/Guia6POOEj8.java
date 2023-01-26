/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6.poo.ej8;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCadena c = new ServicioCadena();
        Cadena cad = c.NewCadena();
        System.out.println("La frase " + cad.getFrase() + " tiene " + c.mostrarVocales(cad) + " vocales." );
        System.out.print("La frase " + cad.getFrase() + " invertida es " );
        c.invertirFrase(cad);
        System.out.println("Que letra queres buscar?");
        String letra = leer.next();
        System.out.println("La frase " + cad.getFrase() + " tiene la letra " + letra + c.vecesRepetido(letra, cad) + " veces.");
        System.out.println("Introducir una nueva frase");
        String fraseN = leer.next();
        System.out.println("La frase" + fraseN + " tiene la misma cantidad de caracteres= " + c.compararLongitud(fraseN, cad));
        System.out.println("Agregar un adjetivo");
        String adj = leer.next();
        System.out.println("Tu frase nueva será " + c.unirFrases(adj, cad));
        System.out.println("Introducir un caracter");
        String caracter = leer.next();
        System.out.print("Tu frase con el caracter nuevo será ");
        c.reemplazar(caracter, cad);
        System.out.println("Que letra queres buscar?");
        String let = leer.next();
        System.out.println("La frase " + cad.getFrase() + " tiene la letra " + let +": " + c.contiene(let, cad));
        
    
    }
    
}
