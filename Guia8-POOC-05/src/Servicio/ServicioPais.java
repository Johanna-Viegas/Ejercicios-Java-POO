/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPais {
    
    private HashSet<Pais> lista;
    private Scanner leer;

    public ServicioPais() {
        this.lista = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearPais(){
        System.out.println("Ingresar el país");
        String nombre = leer.next();
        
        lista.add(new Pais(nombre));
    }
    
    public void mostrarPaises(){
        for (Pais pais : lista) {
            System.out.println(pais);
        }
    }
    
    //Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    //cómo se ordena un conjunto.
    
    public void ordenarPaises(){
        ArrayList<String> listaPaises = new ArrayList(lista);
        Collections.sort(listaPaises);
    }
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
    */
    
    public void eliminarPais(String eliminar){
        Iterator<Pais> it = lista.iterator();
        int elim = 0;
        while(it.hasNext()){
            if(it.next().getNombre().equalsIgnoreCase(eliminar)){
                it.remove();
                elim = 1;
            }
        }
        if(elim == 0){
            System.out.println("No se encontro " + eliminar + " en la lista de Paises");
        }
    }
}
