
package biblioteca;
import java.util.Scanner;
import java.util.Arrays;

public class Prestamo extends Informacion {
    
   public String cedula;
   public int usuario2;
   public String [] prestados= new String[50];
  // public int [] cant_prestados= new int[50];
   public String [] usuar_prestador= new String [50];
   public String [] prestados1= new String[50];
   //public int [] cant_prestados1= new int[50];
   public int [] usuar_prestador1= new int [50];

    public Prestamo(String[] libros1, String[] autores1, String[] anios_pub1, String[] codigos1, Integer[] cantidades1, Integer[] areas1) {
        super(libros1, autores1, anios_pub1, codigos1, cantidades1, areas1);
    }

    

   public String[] getLibros () { return libros; } 
   public String[] getAutores () { return autores; }
   public String[] getAnios_pub () { return anios_pub; } 
   public String[] getCodigos () { return codigos; }
   public Integer [] getCantidades () { return cantidades; }
   public Integer [] getAreas () { return areas; }
   
   public void inicializar(){
       Prestamo objeto = new Prestamo(libros, autores,anios_pub,codigos,cantidades,areas);
       libros=objeto.getLibros();
       System.out.println(Arrays.asList(libros));
       autores=objeto.getAutores();
       System.out.println(Arrays.asList(autores));
       anios_pub=objeto.getAnios_pub();
       codigos=objeto.getCodigos();
       cantidades=objeto.getCantidades();
       areas= objeto.getAreas();
       
   }
   public void prestar(){
       //Informacion objeto1= new Informacion(libros,autores,anios_pub,codigos,cantidades,areas);
      // objeto1.buscar();
       Prestamo objeto2= new Prestamo(libros,autores,anios_pub,codigos,cantidades,areas);
       objeto2.inicializar();
       Scanner teclado= new Scanner(System.in);
       
        int var=0;
        
        System.out.println("Ingrese el nombre del libro que desea prestar");
        nombre= teclado.nextLine();
        for(int i=0;i<=9;i++){
            if(libros[i]!=null){
            if (libros[i].equals(nombre)){
             
                System.out.println("Nombre: "+libros[i]);
                System.out.println(" Autor: "+autores[i]);
                System.out.println(" Anio de publicación: "+anios_pub[i]);
                System.out.println(" código: "+codigos[i]);
                System.out.println(" cantidad de libros almacenados: "+cantidades[i]);
                System.out.println(" Area a la que pertenece el libro: "+areas[i]);
                System.out.println(" Ingrese su cedula");
                cedula= teclado.next();
                cantidades[i]=cantidades[i]-1;
            for (int j=0;i<=49;i++){
            if (usuar_prestador[j]== null){
                usuar_prestador[j]=cedula;
                
                usuario2=j;
               i=50;
                
            }else if(i==49){
                System.out.println("No se pueden prestar libros en este momento");
            }
            
        }
                
                usuario=i;
                
                i=10;
            }else if(i==9){
                var=1;
            }
            }else if (i==9 || var==1 ){
                
                System.out.println("El libro solicitado no se encuentra registrado");
                System.out.println("en la base de datos");
            }
        }
       
       
        }
}
