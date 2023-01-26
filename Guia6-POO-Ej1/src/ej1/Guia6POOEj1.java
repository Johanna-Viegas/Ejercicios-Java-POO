/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej1;

import Entidad.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLibro ls = new ServicioLibro();
        Libro l1 = ls.AltaLibro();
        System.out.println("ISBN: " + l1.getISBN());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Cantidad de Paginas: " + l1.getqPaginas());
    }

    
}
