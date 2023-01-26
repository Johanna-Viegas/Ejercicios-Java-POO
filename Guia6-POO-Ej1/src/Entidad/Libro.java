/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int qPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int qPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.qPaginas = qPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getqPaginas() {
        return qPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setqPaginas(int qPaginas) {
        this.qPaginas = qPaginas;
    }


    
    
    
}

