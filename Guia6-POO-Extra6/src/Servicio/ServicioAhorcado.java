/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioAhorcado {
    
    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
    */
    
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        Ahorcado juego= new Ahorcado();
        System.out.println("Cuantas vidas desean tener?");
        juego.setJugadasMaximas(leer.nextInt());
        System.out.println("Jugador dios, es tu turno de agregar el diccionario al juego");
        juego.setPalabra(diccionario());
        juego.setLetrasEnconrtadas(0);
        return juego;
        
    }
    
    public String[] diccionario(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas palabras queres agregar?");
        int q = leer.nextInt();
        String[] diccionario = new String[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Introducí tu palabra " + i);
            diccionario[i]= leer.next();
        }
        int numero = (int)(Math.random()*((q-1)-0+1)+0);
        String palabra = diccionario[numero];
        String[] vectorBusqueda = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vectorBusqueda[i]= palabra.substring(i, i+1);
        }
        return vectorBusqueda;
    }
    
    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
    */
    
    public void longitud(Ahorcado juego){
        System.out.println("JUGADOR NIVEL BASE --> QUE EMPIECE EL JUEGO");
        System.out.println("La palabra a descubrir tiene...  " + juego.getPalabra().length);
        
    }
    
    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    
    public void buscar(String letra, Ahorcado juego){
        int aparece = 0;
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equals(letra)){
                aparece +=1;
            } 
        }
        if (aparece != 0){
                System.out.println("La letra " + letra + " pertenece a la palabra.");
                System.out.println("La letra " + letra + " aparece " + aparece + " veces.");
                System.out.println("");
                juego.setLetrasEnconrtadas(juego.getLetrasEnconrtadas()+aparece);
            } else {
                System.out.println("La letra " + letra + " NO pertenece a la palabra.");
                System.out.println("");
                juego.setJugadasMaximas(juego.getJugadasMaximas()-1);
            }
        
        System.out.println("Letras totales encontradas/faltantes " + juego.getLetrasEnconrtadas() + "/" + (juego.getPalabra().length-juego.getLetrasEnconrtadas()));
        System.out.println("");
        System.out.println("Te quedan " + juego.getJugadasMaximas() + " vidas.");
        System.out.println("");
    }
    
    public void imprimir(Ahorcado juego){
        for (int i = 0; i < juego.getPalabra().length; i++) {
            System.out.print(juego.getPalabra()[i]);
        }
    }
    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    
    
}
