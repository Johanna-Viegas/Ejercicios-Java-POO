/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
 */
public class ServicioMatematica {
    
    public Matematica NewMatematica(){
    Matematica m = new Matematica();
    Scanner leer = new Scanner(System.in);
    m.setNum1((float) (Math.random()*10));
    m.setNum2((float) (Math.random()*10));
    return m;
    }
    
    /*
    Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    */
    
    public void devolverMayor(Matematica m){
        float mayor = Math.max(m.getNum1(),m.getNum2());
        System.out.println("El mayor entre "+ m.getNum1() + " y " + m.getNum2() + " es " + mayor);
    }
    
    /*
    Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
    */
    public void calcularPotencia(Matematica m){
        int num1 = Math.round(m.getNum1());
        int num2 = Math.round(m.getNum2());
        int potencia = (int) Math.pow(Math.max(num1, num2), Math.min(num1, num2));
        System.out.println("la potencia de  "+ Math.max(num1, num2) + " elevado a  " + Math.min(num1, num2) + " es " + potencia);
    }
    
    /*
    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public void calculaRaiz(Matematica m){
        double num = Math.abs(Math.min(m.getNum1(),m.getNum2()));
        System.out.println("la raiz de  "+ num + " es  " + Math.sqrt(num));
    }
}
