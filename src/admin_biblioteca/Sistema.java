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
public class Sistema {
    
    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
    
    public void addLibro(){
        
        System.out.println("Agregue el titulo: ");
        String titulo = sc.leer.nextLine();
        System.out.println("Agregue el autor: ");
        String autor = sc.leer.nextLine();
        System.out.println("Agregue el genero: ");
        String genero = sc.leer.nextLine();
        System.out.println("Agregue el numero de ejemplares:");
        int nejemplares = sc.leer.nextInt();
        
        Libro l = new Libro(titulo, autor, genero, nejemplares);
        this.libros.add(l);
    }
    
    public void showLibros(){
        int i=1;
        for (Libro li : libros) {
            System.out.println("Libro: "+i++);
            System.out.println(li.toString());
            System.out.println("________________________");
        }
    }
    
    public void addVisitante(){
        System.out.println("Agregue el nombre :");
        String nombre = sc.leer.nextLine();
        System.out.println("Agrega el numero del libro que decee:");
        LocalDateTime fechayhora = LocalDateTime.now();
        Visitante vi = new Visitante(nombre, fechayhora);
        this.showLibros();
        int nlibro;
        int opc;
        do {
            nlibro = sc.leer.nextInt();
            vi.addLibros(this.libros.get(nlibro-1));
            this.libros.get(nlibro-1).DisminuirLibros();
            System.out.println("Decea agregar otro libro: \n1.si\n2.no");
            opc = sc.leer.nextInt();
        } while (opc != 2);
        
        this.visitantes.add(vi);
    }
    
    public void showVisitantes(){
        for (Visitante vi : visitantes) {
            System.out.println(vi.toString());
            vi.showLibros();
        }
    }
    
    
}
