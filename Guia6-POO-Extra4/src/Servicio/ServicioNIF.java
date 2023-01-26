/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioNIF {
    
    public NIF crearNIF(String[] letraNIF){
        Scanner leer = new Scanner(System.in);
        NIF nif = new NIF();
        System.out.println("Introducir su DNI");
        nif.setDNI(leer.nextLong());
        
        int let = (int) (nif.getDNI()%23);
        nif.setLetra(letraNIF[let]);
        return nif;
    }
    
    public void mostrar(NIF nif){
        System.out.println("NIF: " + nif.getDNI() + "-" + nif.getLetra());
    }
    
}
