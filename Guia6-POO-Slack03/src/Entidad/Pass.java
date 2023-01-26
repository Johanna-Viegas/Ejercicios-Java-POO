/*
 Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Pass {
    
    private String pass;
    private String nombre;
    private int DNI;

    public Pass() {
    }

    public Pass( String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
}
