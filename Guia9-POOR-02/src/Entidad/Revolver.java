/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Revolver {
    
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //-----------------------METODOS--------------------------------
    //llenarRevolver(): le pone los valores de posición actual y de 
    //posición del agua. Los valores deben ser aleatorios.
    
    public void llenarRevolver(){
        posicionActual = (int) (Math.random()*5+1);
        posicionAgua = (int) (Math.random()*5+1);
    }
    
    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar(){
        
        return posicionActual == posicionAgua;
    }
    
    //siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro(){
        if(posicionActual==5){
            posicionActual= 1;
        } else {
            posicionActual +=1;
        }
    }
    
    //toString(): muestra información del revolver (posición actual y donde está el agua)

    @Override
    public String toString() {
        return "Posicion Actual: " + posicionActual + " - Posicion del Agua: " + posicionAgua;
    }
    
    
}
