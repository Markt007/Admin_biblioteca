/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admin_biblioteca;

/**
 *
 * @author HP
 */
public class Admin_biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sistema s = new Sistema();
        int opc;

        do {
            System.out.println("1. Agregar Libros");
            System.out.println("2. Ver Libros");
            System.out.println("3. Agregar visitantes");
            System.out.println("4. Ver visitantes");

            opc = sc.leer.nextInt();
            sc.leer.nextLine();

            switch (opc) {
                case 1:
                    s.addLibro();
                    break;
                case 2:
                    s.showLibros();
                    break;
                case 3:
                    s.addVisitante();
                    break;
                case 4:
                    s.showVisitantes();
                    break;

            }
        } while (opc != 6);
    }

}
