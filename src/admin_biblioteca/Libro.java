/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_biblioteca;

/**
 *
 * @author martin
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String genero;
    private int nejemplares = 0;

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, int nejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nejemplares = nejemplares;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", nejemplares=" + nejemplares;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void DisminuirLibros(){
        this.nejemplares -= 1;
    }
    
    
}
