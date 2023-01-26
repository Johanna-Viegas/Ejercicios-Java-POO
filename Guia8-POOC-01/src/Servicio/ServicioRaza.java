/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada
 */
package Servicio;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioRaza {
    
    private ArrayList<Raza> nuevaLista ; //creo lista
    private Scanner leer; // creo scanner



    
    //buena practica :D
    public ServicioRaza() {
        this.nuevaLista = new ArrayList<Raza>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    
    // ingreso de nuevas razas
    public void cargarRaza(){
        System.out.println("De que raza es tu pichicho?");
        String nuevaRaza = leer.nextLine();
        
        nuevaLista.add(new Raza(nuevaRaza));
    }
    
    //imprimir las razas existentes
    public void imprimirRazas(){
        System.out.println("---------- Razas ingresadas ----------");
        for (Raza raza : nuevaLista) {
            System.out.println(raza.toString());
        }
    }
    
    /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada
    */
        
    public void buscaryEliminarRaza(String quitarRaza){
        Iterator<Raza> it = nuevaLista.iterator();
        int elim=0;
        while(it.hasNext()){
            if(it.next().getRaza().equals(quitarRaza)){
                it.remove();
                elim = 1;
            }
        }
        if(elim == 1){
            System.out.println("Raza removida correctamente");
        } else {
            System.out.println("No se encontró la raza a eliminar");
        }
    }
    
}
