/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPersona {
    /*
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Intrese su nombre");
        Persona per = new Persona();
        per.setNombre(leer.next());
        System.out.println("Ingrese su fecha de Nacimiento (dd-mm-aaaa)");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        per.setFechaNacimiento(new Date(anio- 1900, mes -1, dia));
        return per;
    }
    
    /*
     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
    */
    
    public int calcularEdad(Persona per){
        Date fechaActual = new Date();
        System.out.println(per.getFechaNacimiento().getYear());
        return fechaActual.getYear() - per.getFechaNacimiento().getYear();
    }
    
    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
    */
    
    public  boolean menorQue(int edad2, int edad){
        return edad<edad2;
    }
    
    /*
    Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
    */
    
    public  void mostrarPersona(Persona per){
        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Fecha de Nacimiento: " + per.getFechaNacimiento().toString());
    }
}
