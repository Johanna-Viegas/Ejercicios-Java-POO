/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioAlumno {
    
    private ArrayList<Alumno> lista;
    private ArrayList<Integer> notas;
    private Scanner leer;

    public ServicioAlumno() {
        this.lista = new ArrayList<>();
        this.notas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearAlumno(){
        System.out.println("Como se llama el alumno?");
        String nombre = leer.next();
        System.out.println("Introducir su nota 1");
        Integer nota1 = leer.nextInt();
        System.out.println("Introducir su nota 2");
        Integer nota2 = leer.nextInt();
        System.out.println("Introducir su nota 3");
        Integer nota3 = leer.nextInt();
        
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        lista.add(new Alumno(nombre, notas));
    }
    
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
    */
    
    public void checkAlumno(String alumnoFinal){
        int encontrado = 0;
        int suma = 0;
        for (Alumno alumno : lista) {
            if(alumno.getNombre().equalsIgnoreCase(alumnoFinal)){
                System.out.println("Alumno " + alumnoFinal + " encontrado, su nota final es: ");
                encontrado = 1;
                for (Integer nota : notas) {
                    suma += nota;
                }
                System.out.println("La nota final es: " + (suma/3));

            } 
        }
        if(encontrado == 0){
            System.out.println("El alumno " + alumnoFinal + " no fue encontrado. ");
        }
    }
    
    public void notaFinal(String alumnoFinal){
        
    }
}
