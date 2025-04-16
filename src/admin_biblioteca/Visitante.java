/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin_biblioteca;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author martin
 */
public class Visitante {
    
    private String nombre;
    private ArrayList<Libro> libros;
    private LocalDateTime fecha;

    public Visitante() {
    }

    public Visitante(String nombre, LocalDateTime fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.libros = new ArrayList<>();
    }
    
    public void addLibros(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", fecha=" + fecha;
    }
    
    public void showLibros(){
        for (Libro li : libros) {
            System.out.println("Titulo: "+li.getTitulo());
        }
    }
    
    
    
}
