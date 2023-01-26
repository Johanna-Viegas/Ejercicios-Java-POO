/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioLibro {
    
    public Libro AltaLibro (){
        /*
        Instancio un objeto de tipo libro nuevo
        */
        Libro L1 = new Libro();
        // llenamos los datos del libro
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN del libro:");
        L1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Titulo del libro:");
        L1.setTitulo(leer.next());
        System.out.println("Ingrese el Autor del libro:");
        L1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de paginas del libro:");
        L1.setqPaginas(leer.nextInt());
        return L1;
    }
    
    public void informe(Libro L1){
        System.out.println(L1);
    }
}
