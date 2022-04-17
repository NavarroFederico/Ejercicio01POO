/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import Entidades.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LibroServicio {
  
   //creo un metodo para que retorne un objeto de tipo Libro
    
    public Libro crearUnlibro(){
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de ISBN");
        String ISBN= leer.nextLine();
        
        System.out.println("Ingrese el Título del libro");
        String titulo= leer.nextLine();
        
        System.out.println("Ingrese el Autor del libro");
        String autor= leer.nextLine();
        
        System.out.println("Ingrese el número de páginas");
        int numeroDePaginas = leer.nextInt();
        
        Libro objetoLibroNuevo = new Libro(ISBN, titulo, autor, numeroDePaginas);//Instancio un objeto de tipo Libro
        return objetoLibroNuevo;
    }
    public Libro crearUnlibroComoElVideo(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro objetoLibroNuevo = new Libro();//Instancio un objeto de tipo Libro
     
        System.out.println("Ingrese el numero de ISBN");
        //llamo al set de la clase entidades del objeto libro
        objetoLibroNuevo.setISBN(leer.next());
        
        System.out.println("Ingrese el Título del libro");
        objetoLibroNuevo.setTitulo(leer.next());
        
        System.out.println("Ingrese el Autor del libro");
        objetoLibroNuevo.setAutor(leer.next());
        
        System.out.println("Ingrese el número de páginas");
        objetoLibroNuevo.setNumeroDePaginas(leer.nextInt());
        
        return objetoLibroNuevo;
    }

}
