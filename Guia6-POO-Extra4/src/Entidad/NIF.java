/*
  Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class NIF {
    
    private long DNI;
    private String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
