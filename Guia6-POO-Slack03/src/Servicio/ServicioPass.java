/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPass {
    
    /*
    ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
    */
    
    public Pass crearPass(){
        Pass p = new Pass( "Joha", 39066750);
        return p;
    }
    
    /*
    ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    */
    
    public void crearPass1(Pass p){
        Scanner leer = new Scanner(System.in);
        System.out.println("Intresar contraseña (min 10 caracteres)");
        String cont = leer.next(); 
        while (cont.length()<10){
            System.out.println("Contraseña inconsistente, ingresar nueva contraseña");
            cont = leer.next();
        }
        p.setPass(cont);
    }
    
    /*
    ● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
    */
    
    public void analizarPass(Pass p){
        int z = 0;
        int a = 0;
        for (int i = 0; i < p.getPass().length(); i++) {
            if (p.getPass().substring(i, i+1).equals("z")){
                z += 1;
            }
            if (p.getPass().substring(i, i+1).equals("a")){
                a += 1;
            }
        }

        if (z > 0 && a>1){
            System.out.println("Su contraseña es nivel ALTO");
        } else if (z < 1){
            System.out.println("Su contraseña es nivel BAJO");
        } else if (z >0 ){
            System.out.println("Su contraseña es nivel MEDIO");
        }
    }
    
    /*
    ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
    */
    
    public void cambiarPass(Pass p){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar su contraseña actual");
        String cont = leer.next();
        while (!p.getPass().equals(cont)){
            System.out.println("Contraseña incorrecta, reingresar contraseña actual");
            cont = leer.next();
        }
        System.out.println("Intresar contraseña nueva");
        p.setPass(leer.next());
    }
    
    public void cambiarDNI(Pass p){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar su contraseña ");
        String cont = leer.next();
        while (!cont.equals(p.getPass())){
            System.out.println("Contraseña incorrecta, reingresar contraseña");
            cont = leer.next();
        }
        System.out.println("Intresar DNI nuevo");
        p.setDNI(leer.nextInt());
    }
    
    public void cambiarNombre(Pass p){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar su contraseña ");
        String cont = leer.next();
        while (!cont.equals(p.getPass())){
            System.out.println("Contraseña incorrecta, reingresar contraseña");
            cont = leer.next();
        }
        System.out.println("Intresar Nombre nuevo");
        p.setNombre(leer.next());
    }
}
