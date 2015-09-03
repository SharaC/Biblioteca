
package biblioteca;
import java.util.Scanner;

public class Biblioteca {
    

    
    public static void main(String[] args) {
       String [] libros1= new String[10];
       String [] autores1= new String[10];
       String [] anios_pub1= new String[10];
       String [] codigos1= new String[10];
       Integer [] cantidades1= new Integer[10];
       Integer [] areas1= new Integer[10];
       String [] nombres;
        Informacion libro= new Informacion (libros1,autores1,anios_pub1,codigos1,cantidades1,areas1 );
        libro.inicializar();
        Prestamo libro2= new Prestamo (libros1,autores1,anios_pub1,codigos1,cantidades1,areas1 );
        libro2.inicializar();
        libro2.prestar();
        //nombres =libro.getLibros();
        //System.out.println(nombres);
                  
    }
    
}
