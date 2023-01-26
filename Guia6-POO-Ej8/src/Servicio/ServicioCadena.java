/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioCadena {
    public Cadena NewCadena(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cad = new Cadena();
        System.out.println("Ingresar una frase");
        cad.setFrase(leer.next());
        cad.setLongitud(cad.getFrase().length());
        System.out.println(cad.getLongitud());
        return cad;
    }
    
    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
    */
    
    public int mostrarVocales(Cadena cad){
        int q = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
        if (cad.getFrase().substring(i,i+1).equalsIgnoreCase("a") || cad.getFrase().substring(i,i+1).equalsIgnoreCase("e") || cad.getFrase().substring(i,i+1).equalsIgnoreCase("i") || cad.getFrase().substring(i,i+1).equalsIgnoreCase("o") || cad.getFrase().substring(i,i+1).equalsIgnoreCase("u") ) {
            q +=1;
        }   
            }
        return q;
    }
    
    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    public void invertirFrase(Cadena cad){
        int tam = cad.getLongitud();
        for (int i = 0; i < tam; i++) {
            System.out.print(cad.getFrase().substring(tam-i-1,tam-i));
            
        }
        System.out.println("");
    }
    
    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    
    public int vecesRepetido(String letra, Cadena cad){
        int cant = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cant +=1;
            }
        }
        return cant;
    }
    
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
    */
    public boolean compararLongitud(String fraseN, Cadena cad){
        return cad.getLongitud()==fraseN.length();
    }
    
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public String unirFrases(String adj, Cadena cad){
        return cad.getFrase().concat(adj);
    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
    */
    public void reemplazar(String caracter, Cadena cad){
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
                System.out.print(caracter);
            } else {
                System.out.print(cad.getFrase().substring(i, i+1));
            }
        }
        System.out.println("");

    }
    
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    
    public boolean contiene(String let, Cadena cad){
        int si = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i+1).equalsIgnoreCase(let)){
                si =1;
            }
        }
        return si==1;
    }
}
