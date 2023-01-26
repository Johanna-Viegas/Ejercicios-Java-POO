/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Ahorcado {
    
    private String[] palabra;
    private int letrasEnconrtadas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] diccionario, String[] palabra, int letrasEnconrtadas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEnconrtadas = letrasEnconrtadas;
        this.jugadasMaximas = jugadasMaximas;
    }



    public String[] getPalabra() {
        return palabra;
    }

    public int getLetrasEnconrtadas() {
        return letrasEnconrtadas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }


    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEnconrtadas(int letrasEnconrtadas) {
        this.letrasEnconrtadas = letrasEnconrtadas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
}
