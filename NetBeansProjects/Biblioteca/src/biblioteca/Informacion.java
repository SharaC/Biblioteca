
package biblioteca;
import java.util.Scanner;
import java.util.Arrays;

public class Informacion {
    
    String nombre;
    String autor;
    String an_publi;
    String codigo;
    int cantidad;
    int area;
    int usuario;
    
    
       public String [] libros= new String[10];
       public String [] autores= new String[10];
       public String [] anios_pub= new String[10];
       public String [] codigos= new String[10];
       public Integer [] cantidades= new Integer[10];
       public Integer [] areas= new Integer[10];
       
       
       public String [] libros1= new String[10];
       public String [] autores1= new String[10];
       public String [] anios_pub1= new String[10];
       public String [] codigos1= new String[10];
       public Integer [] cantidades1= new Integer[10];
       public Integer [] areas1= new Integer[10];
       
       
        public Informacion (String []libros1, String [] autores1, String [] anios_pub1, String [] codigos1, Integer [] cantidades1, Integer[] areas1) {
       libros= libros1;
       autores= autores1;
       anios_pub= anios_pub1;
       codigos= codigos1;
       cantidades= cantidades1;
       areas= areas1;
       //prestados= ;
       //cant_prestados= new int[50];
       //usuar_prestador= new int [50];
                }
  //  public Informacion() {
        
    //}
        

       
    public String [] getLibros(){
        return libros;
    }
    public void setLibros(String [] libros){
        this.libros =libros ;
    }
    public void inicializar(){
        
        System.out.println(Arrays.asList(libros));
    Scanner teclado= new Scanner(System.in);
    Informacion objeto= new Informacion(libros1,autores1,anios_pub1,codigos1,cantidades1,areas);
    boolean salir =false;
    int otro;
        
        do{
            System.out.println("Ingrese la opción de gestion que desee asi:");
            System.out.println("'1' para ingresar un libro nuevo, '2' para actualizar información de un libro existente,");
            System.out.println( "'3' para eliminar un libro existente, '4' para buscar un libro en la base de datos");
            System.out.println    ("si desea gestionar el PRÉSTAMO de un libro digite '5',");
        int opcion= teclado.nextInt();
            switch(opcion){
                case 1:
                    objeto.Ingresar_libro();
                    
                    System.out.println("si desea realizar otra gestión");
                    System.out.println(" digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    
                case 2:
                    objeto.actualizar();
                    System.out.println("si desea realizar otra gestión");
                    System.out.println(" digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    
                case 3:
                    objeto.eliminar();
                    System.out.println("si desea realizar otra gestión");
                    System.out.println(" digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                case 4:
                    objeto.buscar();
                    System.out.println("si desea realizar otra gestión");
                    System.out.println(" digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                case 5:
                    Prestamo libro2=new Prestamo(libros1,autores1,anios_pub1,codigos1,cantidades1,areas);
                    libro2.prestar();
                    //System.out.print("ya listo");
                    break;
                    
                default: 
                    System.out.println("ingrese una opción válida por favor");
            }
            
        }while (salir == false);
}    
        
    public void Ingresar_libro(){
        
        
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        nombre= teclado.nextLine();
        System.out.println("Ingrese el autor del libro");
        autor= teclado.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        an_publi= teclado.next();
        System.out.println("Ingrese el codigo del libro");
        codigo= teclado.next();
        System.out.println("Ingrese la cantidad de libros de este tipo a ingresar");
        cantidad= teclado.nextInt();
        //teclado.next();
        System.out.println("Ingrese el area del libro asi: digite '1' para quimica, ");
        System.out.println("'2' para fisica, '3' para tecnologia, '4' para cálculo y ");
        System.out.println("'5' para programación ");
        area= teclado.nextInt();
        
        
        
        for (int i=0;i<=9;i++){
            if (libros1[i]== null){
                libros1[i]=nombre;
                usuario=i;
                System.out.println(Arrays.asList(libros1));
                i=10;
                
            }else if(i==9){
                System.out.println("La base de datos está llena, debe eliminar un libro existente.");
            }
            
        }
        
        
        libros1[usuario]=nombre;
        autores1[usuario]= autor;
        anios_pub1[usuario]=an_publi;
        codigos1[usuario]= codigo;
        cantidades1[usuario]= cantidad;
        areas1[usuario]= area;
        
    }
    
    public void actualizar(){
        
        
        boolean salir= false;
        int otro;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro a actualizar");
        nombre= teclado.nextLine();
        int var=0;
        for(int i=0;i<=9;i++){
            if(libros1 [i]!=null){
            if (libros1[i].equals(nombre)){
                
                do{
                System.out.println("para actualizar: a) el autor digite '1', ");
                System.out.println("b) el año de publicación digite '2', c) el código del ");
                System.out.println("libro digite '3', d) la cantidad de libros digite '4',");
                System.out.println("e) el area del libro digite '5'");
                int cambio= teclado.nextInt();
                
                switch (cambio){
                    case 1:
                      
                        System.out.println("Ingrese el autor del libro");
                        String vacia=  teclado.next();
                        autor= teclado.nextLine();
                        autores1[i]= autor;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 2:
                        System.out.println("Ingrese el año de publicación del libro");
                        an_publi= teclado.next();
                        anios_pub1[i]= an_publi;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 3:
                        System.out.println("Ingrese el codigo del libro");
                        codigo= teclado.next();
                        codigos1[i]= codigo;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 4:
                        System.out.println("Ingrese la cantidad de libros a añadir. "
                                + "NOTA: la cantidad de libros actual es: "+cantidades[i]);
                        cantidad= teclado.nextInt();
                        cantidades1[i]= cantidades[i]+cantidad;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                    case 5:
                        System.out.println("Ingrese el area del libro asi: digite '1' para quimica, "
                + "'2' para fisica, '3' para tecnologia, '4' para cálculo y '5' para programación");
                        area= teclado.nextInt();
                        areas1[i]= area;
                        System.out.println("si desea actualizar otro dato del "
                                + "mismo libro digite '1', en caso contrario digite '2'");
                        otro= teclado.nextInt();
                        if(otro ==1){
                            salir= false;
                        } else if (otro==2){
                            salir = true;
                        }else {
                            System.out.println("Instrucción incorrecta, debe volver al menú ");
                            salir=true;
                        }
                    break;
                        
                    default:
                        System.out.println("Por favor ingrese una opción correcta ");
                        
                }
                } while  (salir == false);
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
    
    
    public void eliminar(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro a eliminar");
        nombre= teclado.nextLine();
        int var=0;
        for(int i=0;i<=9;i++){
            if(libros1 [i]!=null){
            if (libros1[i].equals(nombre)){
             
                libros1[i]= null;
                autores1[i]=null;
                anios_pub1[i]= null;
                codigos1[i]=null;
                cantidades1[i]= null;
                areas1[i]=null;
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
    
    public int buscar(){
        Prestamo objeto1= new Prestamo(libros1,autores1,anios_pub1,codigos1,cantidades1,areas);
        Scanner teclado= new Scanner(System.in);
        int var=0;
        objeto1.inicializar();
        System.out.println("Ingrese el nombre del libro que desea encontrar");
        nombre= teclado.nextLine();
        for(int i=0;i<=9;i++){
            if(libros1[i]!=null){
            if (libros1[i].equals(nombre)){
             
                System.out.println("Nombre: "+libros1[i]);
                System.out.println(" Autor: "+autores1[i]);
                System.out.println(" Anio de publicación: "+anios_pub1[i]);
                System.out.println(" código: "+codigos1[i]);
                System.out.println(" cantidad de libros almacenados: "+cantidades1[i]);
                System.out.println(" Area a la que pertenece el libro: "+areas1[i]);
                usuario=i;
                /*autores[i]=null;
                anios_pub[i]= null;
                codigos[i]=null;
                cantidades[i]= null;
                areas[i]=null;
                usuario=i;*/
                i=10;
            }else if(i==9){
                var=1;
            }
            }else if (i==9 || var==1 ){
                
                System.out.println("El libro solicitado no se encuentra registrado");
                System.out.println("en la base de datos");
            }
        }
        //System.out.print(" si ud desea prestar este libro digite '1', de lo contrario digite '2'");
        //int presto= teclado.nextInt();
        //if(presto==1){
          //  objeto1.prestar();
            //System.out.println(Arrays.asList(cantidades1));
        //}
        
        return usuario;
    }
    
   
    
}
