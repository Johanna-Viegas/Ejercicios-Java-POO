/*
 Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package guia6.poo.slack03;

import Entidad.Pass;
import Servicio.ServicioPass;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOSlack03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPass p = new ServicioPass();
        Pass pass = p.crearPass();
        int opc =0;
        do{
            System.out.println(" MENU ");
            System.out.println("1- Ingresar Contraseña");
            System.out.println("2- Nivel Contraseña");
            System.out.println("3- Modificar Contraseña");
            System.out.println("4- Modificar DNI");
            System.out.println("5- Modificar Nombre");
            System.out.println("6- Salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    p.crearPass1(pass);
                    break;
                case 2:
                    p.analizarPass(pass);
                    break;
                case 3:
                    p.cambiarPass(pass);
                    break;
                case 4:
                    p.cambiarDNI(pass);
                    break;    
                case 5:
                    p.cambiarNombre(pass);
                    break;    
            }
    }while (opc>0 && opc<6);
    }
    
}
