/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDePrueba;

import java.util.Scanner;
import Entidades.Libro;
import servicio.*;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        LibroServicio libroServicio = new LibroServicio();        
        Libro libroActual = libroServicio.crearUnlibro();
        
        System.out.println(libroActual);
        
//        Libro l1 = new Libro();
//        l1.crearUnlibro();
       
    }
    
}
