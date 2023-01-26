/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Servicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Perro> perros = new ArrayList<>();
    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<String> perrosElegidos = new ArrayList<>();
    
    public void crearPerro(){
        String rta ;
        
        do{
         
        System.out.println("Ingresar el nombre del perro en adopción:");
        String nombre = leer.next();
        System.out.println("Ingresar su raza:");
        String raza = leer.next();
        System.out.println("Ingresar su tamaño:");
        String tamano = leer.next();
        System.out.println("Ingresar su edad:");
        Integer edad = leer.nextInt();
        Perro perro = new Perro(nombre,raza,edad,tamano);
        perros.add(perro);   
        System.out.println("Desea ingresar un perrito mas a la adopcion?");
         rta = leer.next();
        } while (rta.equalsIgnoreCase("si"));
        
    }
    
    public void crearPersona(){
        String rta ;
        String nombrePerro;
        
        do{
        
        System.out.println("Ingresar el nombre del adoptante:");
        String nombre = leer.next();
        System.out.println("Ingresar apellido:");
        String apellido = leer.next();
        System.out.println("Ingresar su edad:");
        Integer edad = leer.nextInt();
        System.out.println("Ingresar su DNI:");
        Integer dni = leer.nextInt();
        Persona persona = new Persona(nombre,apellido,edad,dni);
        personas.add(persona);  
        System.out.println("Que perrito desea adoptar de la lista disponible?");
        mostrarPerros();
        nombrePerro = leer.next();
        persona.setPerro(perros.get(buscarPerro(nombrePerro)));
        System.out.println("Desea ingresar un adoptante mas?");
        rta = leer.next();
        
        } while (rta.equalsIgnoreCase("si"));
        
    }
    
    public void mostrarPerros(){
        System.out.println("Disponibles:");
        for (Perro perro : perros) {
            System.out.println(perro.getNombre());
        }
    }
    
    public int buscarPerro(String nombrePerro){
        int posicion = -1;
        String rta = "ok";
        do{
            rta= "ok";
        for (String perroE : perrosElegidos) {
            if(nombrePerro.equalsIgnoreCase(perroE)){
                rta= "no";
                System.out.println("Ese perrito ya fue adoptado, cual desea elegir?");
                nombrePerro = leer.next();
            }
        }
        }while(!rta.equalsIgnoreCase("ok"));
        

       for (Perro perro : perros) {
           if(nombrePerro.equalsIgnoreCase(perro.getNombre()))
            posicion = perros.indexOf(perro);
           perrosElegidos.add(nombrePerro);
        } 
       
       return posicion;
    }
    
    public void mostrarPersonas(){
        for (Persona persona : personas) {
            System.out.println(persona);

        }
    }
}
