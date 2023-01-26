/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import Enum.Numero;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList< Carta> cartas = new ArrayList<>();
    ArrayList< Carta> monton = new ArrayList<>();
    
    
    public Baraja crearBaraja(){
        
        Carta carta = new Carta();
      
            for (Palo palo : Palo.values()) {
            carta.setPalo(palo);
                for (Numero numero : Numero.values()) {
                    carta.setNumero(numero);
                    cartas.add(new  Carta(palo,numero));
                    System.out.println(carta);
                }
            }
            
            Baraja baraja = new Baraja(cartas);
            //System.out.println("Original List : \n" + cartas);
            return baraja;
    }
    
    public void barajar(Baraja baraja){

        Collections.shuffle(cartas);
         System.out.println("CARTAS MEZCLADAS");
        for (Carta carta : cartas) {
           
            System.out.println(carta);
        }
        
    }
    
    public void siguienteCarta(Baraja baraja){
        if(cartas.get(0)!=null){
        System.out.println("La siguiente carta es:");
        System.out.println(cartas.get(0));
        monton.add(cartas.get(0));
        cartas.remove(0);
        } else {
            System.out.println("No quedan mas cartas en la bajara");
        }
    }
    
    public void cartasDisponibles(Baraja baraja){
        System.out.println("La cantidad de cartas que queda en la Baraja es: ");
        System.out.println(cartas.size());
    }
    
    public void darCartas(Baraja baraja){
        System.out.println("Cuantas cartas queres que te de?");
        int cantidad = leer.nextInt();
        if (cantidad<cartas.size()) {
            System.out.println("Tus cartas son:");
            for (int i = 0; i < cantidad; i++) {
               System.out.println(cartas.get(0));
                monton.add(cartas.get(0));
                cartas.remove(0); 
            } 
        }
    }
    
    public void cartasMonton(){
        if (!monton.isEmpty()) {
            System.out.println("Las cartas del monton son:");
            for (int i = 0; i < monton.size(); i++) {
               System.out.println(monton.get(i));
            } 
        }
    }
    
        public void mostrarBaraja(){
        if (!cartas.isEmpty()) {
            System.out.println("Las cartas de la baraja son:");
            for (int i = 0; i < cartas.size(); i++) {
               System.out.println(cartas.get(i));
            } 
        }
    }
        
    public void menu(Baraja baraja){
        int opc=1;
        while(opc<7 && opc>0){
        System.out.println("");
        System.out.println("-----------MENU-------------");
        System.out.println("1- Mezclar");
        System.out.println("2- Mostrar la carta siguiente");
        System.out.println("3- Mostrar cuantas cartas hay en la baraja");
        System.out.println("4- Dar cartas");
        System.out.println("5- Mostrar las cartas que salieron");
        System.out.println("6- Mostrar las cartas de la baraja");
        System.out.println("7- Salir");
        System.out.println("");
        opc = leer.nextInt();
        switch(opc){
            case 1:
                barajar(baraja);
                System.out.println("");
                break;
            case 2:
                siguienteCarta(baraja);
                System.out.println("");
                break;
            case 3:
                cartasDisponibles(baraja);
                System.out.println("");
                break;
            case 4:
                darCartas(baraja);
                System.out.println("");
                break;
            case 5:
                cartasMonton();
                System.out.println("");
                break;
            case 6:
                mostrarBaraja();
                System.out.println("");
                break;     
        }
        }
    }
}
