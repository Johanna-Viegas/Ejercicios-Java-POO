/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package guia6.poo.ej7;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj7 {

    /**
     Scanner leer = new Scanner(System.in);
        ServicioCafetera caf = new ServicioCafetera();
        Cafetera c = caf.newCafetera();
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona p = new ServicioPersona();
        /*Persona p1 = p.CrearPersona();
        Persona p2 = p.CrearPersona();
        Persona p3 = p.CrearPersona();
        Persona p4 = p.CrearPersona();  
        */
        Persona p5 = new Persona("Juan",-2 , "masc", 28.1, 1.62);
        int debajo = 0;
        int ideal = 0;
        int encima = 0;
        int mayor = 0;
        int menor = 0;
        System.out.println("Persona 5");
        System.out.println("IMC " + p.calcularIMC( p5));
        try{
           System.out.println("Es mayor de edad " + p.esMayorDeEdad(p5));
        if (p.calcularIMC( p5)==-1){
            debajo +=1;
        } else if (p.calcularIMC( p5)==0){
            ideal +=1;
        } else {
            encima +=1;
        }
        if(p.esMayorDeEdad(p5)== true){
            mayor +=1;
        } else {
            menor +=1;
        }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*try{
           System.out.println("Es mayor de edad " + p.esMayorDeEdad(p1));
        if (p.calcularIMC( p1)==-1){
            debajo +=1;
        } else if (p.calcularIMC( p1)==0){
            ideal +=1;
        } else {
            encima +=1;
        }
        if(p.esMayorDeEdad(p1)== true){
            mayor +=1;
        } else {
            menor +=1;
        }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Persona 2");
        System.out.println("IMC " + p.calcularIMC( p2));
        System.out.println("Es mayor de edad " + p.esMayorDeEdad(p2));
        if (p.calcularIMC( p2)==-1){
            debajo +=1;
        } else if (p.calcularIMC( p2)==0){
            ideal +=1;
        } else {
            encima +=1;
        }
        if(p.esMayorDeEdad(p2)== true){
            mayor +=1;
        } else {
            menor +=1;
        }
        
        System.out.println("Persona 3");
        System.out.println("IMC " + p.calcularIMC( p3));
        System.out.println("Es mayor de edad " + p.esMayorDeEdad(p3));
        if (p.calcularIMC( p3)==-1){
            debajo +=1;
        } else if (p.calcularIMC( p3)==0){
            ideal +=1;
        } else {
            encima +=1;
        }
        if(p.esMayorDeEdad(p3)== true){
            mayor +=1;
        } else {
            menor +=1;
        }
        
        System.out.println("Persona 4");
        System.out.println("IMC " + p.calcularIMC( p4));
        System.out.println("Es mayor de edad " + p.esMayorDeEdad(p4));
        if (p.calcularIMC( p4)==-1){
            debajo +=1;
        } else if (p.calcularIMC( p4)==0){
            ideal +=1;
        } else {
            encima +=1;
        }
        if(p.esMayorDeEdad(p4)== true){
            mayor +=1;
        } else {
            menor +=1;
        }
        */
        System.out.println("Porcentajes");
        System.out.println("P. Bajo Peso: " + (debajo*100/4));
        System.out.println("P. Peso Ideal: " + (ideal*100/4));
        System.out.println("P. Sobre Peso: " + (encima*100/4));
        
        System.out.println("P. Mayores: " + (mayor*100/4));
        System.out.println("P. Menores: " + (menor*100/4));
    }
    
}
