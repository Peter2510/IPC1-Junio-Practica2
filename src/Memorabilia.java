package src;

import java.util.Scanner;

public class Memorabilia {

    public static void main(String[] args) {
        Memorabilia practica2 = new Memorabilia();
    }
    // definiendo el scanner para toda  la clase
    Scanner scanner = new Scanner(System.in);
    // variables globales  de los clientes
    String nombreCliente;
    int primerId = 0;
    int idCliente;
    int telefonoCliente;
    int contadorCliente = 0;
    int contadorPelicula = 0;
    boolean tienePeliculaPrestada;
    int idClienteBuscar =0;
    int posicionCliente =0;
    int posicionPelicula=0;
    int posicionClienteDevolver=0;
    int posicionPeliculaDevolver=0;
    boolean ordenado = false;


    //variables globales de las peliculas
    String nombrePelicula;
    int idPelicula;
    int primerIdPelicula = 0;
    int anioPelicula;
    String categoria;
    boolean peliculaDisponible;
    int contadorAccion = 0;
    int contadorDrama = 0;
    int contadorDocumental = 0;
    int contadorComedia = 0;
    int contadorRomantica = 0;
    boolean idPeliculaRepetida = false;


    //variables globales peliculas prestadas
    int idPeliculaPrestada =0;
    int idClientePrestamo =0;
    int diasPrestamo =0;
    int contadorPeliculasPrestadas=0;
    int idPeliculaBuscar = 0;
    int idPeliculaDevolver=0;
    int idClienteDevolver = 0;


    //matriz de clientes
    // TipoDeDato nombre[] = new TipoDeDato[tamaño];
    //matriz de nombres
    String matrizNombreCliente[] = new String[30];
    // Matriz de id
    int matrizIdCliente[] = new int[30];
    // Matriz de telefono cliente
    int matrizTelefonoCliente[] = new int[30];
    //Matriz nombre de la pelicula
    String matrizNombrePelicula[] = new String[30];
    //Matriz id pelicula
    int matrizIdPelicula[] = new int[30];
    //matriz anio pelicula
    int matrizAnioPelicula[] = new int[30];
    //matriz categoria pelicula
    String matrizCategoriaPelicula[] = new String[30];
    //matriz disponibilidad de pelicula
    boolean matrizPeliculaDisponible[] = new boolean[30];
    //matriz cliente con pelicula prestada
    boolean matrizClienteDisponibleParaPrestar[] = new boolean[30];
    //matriz dias prestamo
    int diasPrestamoPeliculas[] = new int[30];
    //matrizPeliculasPrestadas
    int  matrizIdPeliculaPrestada[] = new int[30];
    int matrizIdClientePrestador[] = new int[30];

    //constructor de la practica
    public Memorabilia() {
        //Mostrar el menu
        mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion = 0;
        //Mostrar el menu mientras no se ingrese la opcion de salir, es decir, el numero 9
        do {
            System.out.println("\n\n_______________________________   MENU   ______________________________________");
            System.out.println("\nSelecciona una opcion: ");
            System.out.println("\n1. Prestamo de peliculas ");
            System.out.println("2. Devolucion de peliculas ");
            System.out.println("3. Mostrar datos de las peliculas ");
            System.out.println("4. Registrar nueva pelicula ");
            System.out.println("5. Ordenar las peliculas en forma ascente respecto al id ");
            System.out.println("6. Registrar nuevos clientes");
            System.out.println("7. Mostrar clientes registrados");
            System.out.println(matrizIdCliente[1]);
            System.out.println("8. Reportes");
            System.out.println("9. Salir");
            System.out.print("\nIngresa la opcion a realizar: ");
            opcion = scanner.nextInt();

            System.out.println("___________________________________________________________");
            opcionIngresada(opcion);
        } while (opcion != 9);
        {
            // si se ingresa el numero 9, termina el programa
            System.out.println("\nVuelve pronto ");
        }
    }

    public void opcionIngresada(int opcion) {
        //Opcion 1 seleccionada
        if (opcion == 1) {
            prestamoPeliculas();
        }
        //Opcion 2 seleccionada
        if (opcion == 2) {

            devolverPeliculas(matrizIdPeliculaPrestada);
        }
        //Opcion 3 seleccionada
        if (opcion == 3) {
            mostrarPeliculas();
        }
        //Opcion 4 seleccionada
        if (opcion == 4) {
            registrarPelicula(matrizIdPelicula);
        }
        //Opcion 5 seleccionada
        if (opcion == 5) {

            ordenado = true;
            ordenarAscendenteId(matrizIdCliente);
        }
        //Opcion 6 seleccionada
        if (opcion == 6) {
            registrarClientes(matrizIdCliente);
        }
        //Opcion 7 seleccionada
        if (opcion == 7) {
            mostrarClientes();
        }
        //Opccion 8 seleccionada
        if (opcion == 8) {
            reportes();
        }
    }

    // Registrar cliente nuevo
    public void registrarClientes(int [] array) {





        System.out.println("___________________________________________________________");
        System.out.println("");
        System.out.println("\nBienvenido al registro de clientes");
        //Ingresar nonmbre del cliente



        if (contadorCliente==0) {


          //Ingresar el id del cliente
        System.out.print("\nIngrese el id del cliente: ");
        idCliente = scanner.nextInt();
        matrizIdCliente[contadorCliente] = idCliente;
        



        System.out.print("\nIngrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();
        nombreCliente = scanner.nextLine();
        matrizNombreCliente[contadorCliente] = nombreCliente;


        System.out.print("\nIngrese el telefono del cliente: ");
        telefonoCliente = scanner.nextInt();
        matrizTelefonoCliente[contadorCliente] = telefonoCliente;

        
        matrizClienteDisponibleParaPrestar[contadorCliente]=false;
        
        contadorCliente++;

        
      
        //Pelicula prestada
        System.out.println("___________________________________________________________");




   
        }



        else{

            
        System.out.print("\nIngrese el id del cliente: ");
        idCliente = scanner.nextInt();

        int posicion = -1;

        for (int i = 0; i < array.length; i++) {

            if (idCliente == array[i]) {

                posicion = i;

            }

        }

        if (posicion >= 0) {

            //System.out.println(" El dato " + idCliente + " se encuentra en la posicion " + posicion);
            System.out.println("INGRESE UN ID DISTINTO");

        } else {
            //System.out.println("Dato no encontrado");








         matrizIdCliente[contadorCliente] = idCliente;


        System.out.print("\nIngrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();
        nombreCliente = scanner.nextLine();
        matrizNombreCliente[contadorCliente] = nombreCliente;


        System.out.print("\nIngrese el telefono del cliente: ");
        telefonoCliente = scanner.nextInt();
        matrizTelefonoCliente[contadorCliente] = telefonoCliente;

         matrizClienteDisponibleParaPrestar[contadorCliente]=false;
        contadorCliente++;


       
        //Pelicula prestada
        System.out.println("___________________________________________________________");





        }


        }







    }

    //imprimir en pantalla los clientes
    public void mostrarClientes() {

        if (ordenado == false) {

            if (contadorCliente == 0) {
            System.out.print("\nAun no hay clientes registrados\n");
        } else {

             System.out.println("           *********   Clientes Registrados   *********   ");
            String prestamo;
            for (int i = 0; i < contadorCliente; i++) {
                if (tienePeliculaPrestada == false) {
                    prestamo = "no";
                } else {
                    prestamo = "si";
                }
               
                System.out.println("\nid " + "     "    + " Nombre del Cliente " + "      "    + " telefono: " + "      "+ " Posee peliculas de la tienda " );
                 System.out.println("\n" + matrizIdCliente[i] + "        " + matrizNombreCliente[i] + "                " + matrizTelefonoCliente[i] + "              " + matrizClienteDisponibleParaPrestar[i]);
            }
            System.out.println();
        }
            
        }
            else{
                System.out.println("Ahorita vot");
            }

        
    }

    // Registrar nueva pelicua
    public void registrarPelicula(int[] array) {

        System.out.println("");
        System.out.println("");
        System.out.println("\n               ****   Bienvenido al registro de peliculas   ****\n");

        if (contadorPelicula == 0) {

            System.out.print("\nIngrese el id de la pelicula:  ");
            idPelicula = scanner.nextInt();
            matrizIdPelicula[contadorPelicula] = idPelicula;

            System.out.print("\nIngrese el nombre de la pelicula:  ");
            nombrePelicula = scanner.nextLine();
            nombrePelicula = scanner.nextLine();
            matrizNombrePelicula[contadorPelicula] = nombrePelicula;

            System.out.print("\nIngrese el año de estreno de la pelicula: ");
            anioPelicula = scanner.nextInt();
            matrizAnioPelicula[contadorPelicula] = anioPelicula;

            System.out.println("\nIngrese la categoria de la pelicula:  ");
            System.out.println("\n                      Categorias disponibles:  ");
            System.out.println("\n1. Accion");
            System.out.println("\n2. Drama");
            System.out.println("\n3. Documental");
            System.out.println("\n4. Comedia");
            System.out.println("\n5. Romantica");
            System.out.print("\nIngresa el numero de la categoria: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {

                matrizCategoriaPelicula[contadorPelicula] = "acción";
                contadorAccion++;
            }

            if (opcion == 2) {
                matrizCategoriaPelicula[contadorPelicula] = "drama";
                contadorDrama++;
            }
            if (opcion == 3) {
                matrizCategoriaPelicula[contadorPelicula] = "documental";
                contadorDocumental++;
            }
            if (opcion == 4) {
                matrizCategoriaPelicula[contadorPelicula] = "Comedia";
                contadorComedia++;
            }
            if (opcion == 5) {
                matrizCategoriaPelicula[contadorPelicula] = "Romantica";
                contadorRomantica++;
            }

            matrizPeliculaDisponible[contadorPelicula] = true;
            //cREAR PELICUAL
            peliculaDisponible = true;
            contadorPelicula++;


        } else {

            System.out.println("Ingrese el id de la pelicula");
            int idPelicula = scanner.nextInt();
            int posicion = -1;

            for (int i = 0; i < array.length; i++) {

                if (idPelicula == array[i]) {

                    posicion = i;

                }

            }

            if (posicion >= 0) {

                //System.out.println(" El dato " + idPelicula + " se encuentra en la posicion " + posicion);
                System.out.println("******  INGRESA UN ID DISTINTO   ******");
                

            } else {
                
                
                
                 matrizIdPelicula[contadorPelicula] = idPelicula;

                
                System.out.print("\nIngrese el nombre de la pelicula:  ");
                nombrePelicula = scanner.nextLine();
                nombrePelicula = scanner.nextLine();
                matrizNombrePelicula[contadorPelicula] = nombrePelicula;

                System.out.print("\nIngrese el año de estreno de la pelicula: ");
                anioPelicula = scanner.nextInt();
                matrizAnioPelicula[contadorPelicula] = anioPelicula;

                System.out.print("\nIngrese la categoria de la pelicula:  ");
                System.out.print("\nCategorias disponibles:  ");
                System.out.print("\n1. Accion");
                System.out.print("\n2. Drama");
                System.out.print("\n3. Documental");
                System.out.print("\n4. Comedia");
                System.out.print("\n5. Romantica");
                System.out.print("\nIngresa el numero de la categoria: ");
                int opcion = scanner.nextInt();

                if (opcion == 1) {

                    matrizCategoriaPelicula[contadorPelicula] = "acción";
                    contadorAccion++;
                }

                if (opcion == 2) {
                    matrizCategoriaPelicula[contadorPelicula] = "drama";
                    contadorDrama++;
                }
                if (opcion == 3) {
                    matrizCategoriaPelicula[contadorPelicula] = "documental";
                    contadorDocumental++;
                }
                if (opcion == 4) {
                    matrizCategoriaPelicula[contadorPelicula] = "Comedia";
                    contadorComedia++;
                }
                if (opcion == 5) {
                    matrizCategoriaPelicula[contadorPelicula] = "Romantica";
                    contadorRomantica++;
                }

                matrizPeliculaDisponible[contadorPelicula] = true;
                //cREAR PELICUAL
                peliculaDisponible = true;
                contadorPelicula++;

            }

        }

    }

    public void mostrarPeliculas() {
      
        String enPrestamo;
        if (contadorPelicula == 0) {
            System.out.print("\n*****   Aun no hay peliculas registradas   *****\n");

        } else {
                            System.out.println("\nId|" + "   | Nombre de la pelicula | " + "| Año de estreno |" + "| Categoria |" + "| Disponible  |" );

            for (int i = 0; i < contadorPelicula; i++) {
                if (matrizPeliculaDisponible[i] == false) {
                    enPrestamo = "no";
                } else {
                    enPrestamo = "si";
                }
                
                System.out.println("\n" +matrizIdPelicula[i] +"      "+ matrizNombrePelicula[i] +"                 "+ matrizAnioPelicula[i] +"             "+ matrizCategoriaPelicula[i] +"        "+enPrestamo);
                }

                if (contadorPeliculasPrestadas>0) {
                    imprimirPrestadas();
                    
                }else{
                System.out.println();        
                }
                
            
        }
    }

    public void prestamoPeliculas() {

        //si hay peliculas registradas
        if (contadorPelicula > 0 && contadorCliente > 0) {

            mostrarPeliculas();

            System.out.println("\nSolo puedes prestar una pelicula a la vez");

            buscarIdPeliculaPrestada(matrizIdPelicula);




        } else {


            System.out.println();
            System.out.println("\n*****   Verifica que al menos exista un cliente y pelicula registrada  *****\n");


        }


    }

    public void reportes() {
        System.out.println("");
        System.out.println("");
        System.out.println("CANTIDAD DE PELICULAS POR CATEGORIA");
        System.out.println("\nPeliculas categoria en acción: " + contadorAccion);
        System.out.println("Peliculas categoria en drama: " + contadorDrama);
        System.out.println("Peliculas categoria en documental: " + contadorDocumental);
        System.out.println("Peliculas categoria en comedia: " + contadorComedia);
        System.out.println("Peliculas categoria en Romantica: " + contadorRomantica);
        System.out.print("\n Ingrese la opcion para observar las peliculas registradas por categoria: \n");
        System.out.print("\n1. Accion");
        System.out.print("\n2. Drama");
        System.out.print("\n3. Documental");
        System.out.print("\n4. Comedia");
        System.out.println("\n5. Romantica");
        System.out.print("Ingresa una opcion: ");
        int opcionCg = scanner.nextInt();

          if (opcionCg == 1) {

                    System.out.println("\nPeliculas registradas en la categoria de acción: " + contadorAccion);
                }

                if (opcionCg == 2) {

                    System.out.println("\nPeliculas registradas en la categoria de drama: " + contadorDrama);
                    
                }
                if (opcionCg == 3) {
                            System.out.println("\nPeliculas registradas en la categoria de documental:  "+ contadorDocumental);

                    
                }
                if (opcionCg == 4) {
                            System.out.println("\nPeliculas registradas en la categoria de comedia: " + contadorComedia);

                   
                }
                if (opcionCg == 5) {
                            System.out.println("\nPeliculas registradas en la categoria de romance: " + contadorRomantica);

                   
                }


    }



   

    public void buscarIdPeliculaPrestada(int[] array) {

        System.out.print("Ingrese el id de la pelicula que deseas prestar: ");
        idPeliculaBuscar = scanner.nextInt();
        idPeliculaPrestada=idPeliculaBuscar;
        int posicion = -1;

        for (int i = 0; i < array.length; i++) {

            if (idPeliculaBuscar == array[i]) {

                posicion = i;
                posicionPelicula=i;

            }

        }

        if (posicion >= 0) {

            if (matrizPeliculaDisponible[posicionPelicula]==false) {

                System.out.println("La pelicula actualmente no se encuentra disponible");
                
            }

            else{

            //System.out.println(" El dato " + idPeliculaBuscar + " se encuentra en la posicion " + posicion);

            
            System.out.print("Ingresa el id del cliente a prestará la pelicula:");

           
            mostrarClientes();

            buscarIdClienteAPrestar(matrizIdCliente);

            }

           





        } else {
            //System.out.println("Dato no encontrado");

             System.out.println("*******   INGRESA UN ID DISTINTO   ***********");
        } 



    }

     public void buscarIdClienteAPrestar(int[] array) {

        System.out.print("Ingrese el id del cliente que prestará la pelicula");
        idClienteBuscar = scanner.nextInt();
        idClientePrestamo = idClienteBuscar;
        int posicion = -1;

        for (int i = 0; i < array.length; i++) {

            if (idClienteBuscar == array[i]) {

                posicion = i;
                posicionCliente=i ;

            }

        }

        if (posicion >= 0) {


            if (matrizClienteDisponibleParaPrestar[posicionCliente]==true) {

                System.out.println("El cliente no se encuentra disponible para pedir prestamos");
                
            }

            else{

                // System.out.println(" El dato " + idClienteBuscar + " se encuentra en la posicion " + posicion);
            
 

            matrizIdClientePrestador[contadorPeliculasPrestadas]=idClientePrestamo;
            matrizIdPeliculaPrestada[contadorPeliculasPrestadas]= idPeliculaBuscar;


            System.out.print("Ingrese la cantidad de dias a prestar");
            diasPrestamo = scanner.nextInt();
            diasPrestamoPeliculas[contadorPeliculasPrestadas]=diasPrestamo;




            matrizPeliculaDisponible[posicionPelicula]= false;
            matrizClienteDisponibleParaPrestar[posicionCliente]=true;

            contadorPeliculasPrestadas++;

               System.out.println(" *************   La pelicula fue prestada   *************");


            }

        


        } else {
        //System.out.println("Dato no encontrado");
             System.out.println(" *******  INGRESA UN ID VALIDO  *******");
        }

    }

    public void imprimirPrestadas(){
        System.out.println("\n____________________   HISTORIAL DE  PELICULAS PRESTADAS   __________________________________________________");
                
        for (int j = 0; j < contadorPeliculasPrestadas ; j++ ) {
                            System.out.println("\nNombre del cliente "+matrizNombreCliente[j]+" id Cliente " + matrizIdClientePrestador[j] + "nombre Pelicula" +matrizNombrePelicula[j] + ", idPeliculaPrestada: " + matrizIdPeliculaPrestada[j] + ", cantidad de dias: " + diasPrestamoPeliculas[j]);

        }

       
    }

    public void devolverPeliculas(int [] array){

        
        if (contadorPeliculasPrestadas>0) {

              imprimirPrestadas();


        System.out.println("Ingrese el id de la pelicula a devolver");
        idPeliculaDevolver = scanner.nextInt();
        
        int posicion = -1;

        for (int i = 0; i < array.length; i++) {

            if (idPeliculaDevolver == array[i]) {

                posicion = i;
                posicionClienteDevolver=i ;
                

            }

        }

        if (posicion >= 0) {



            //System.out.println(" El dato " + idPeliculaDevolver + " se encuentra en la posicion " + posicion);
 

            devolverPeliculasCliente(matrizIdClientePrestador);


        } else {
            System.out.println("Dato no encontrado");
             System.out.println(" *********       INGRESA UN ID VALIDO *********       ");
        }

            
        }

        else{

            System.out.println();
            System.out.println("\n*****  Aun no hay peliculas prestadas  *****\n");
            
        }

      


    }

    public void devolverPeliculasCliente(int[] array){

        System.out.print("Ingrese el id del cliente que devulve la pelicula");
        idClienteDevolver = scanner.nextInt();
        
        int posicion = -1;

        for (int i = 0; i < array.length; i++) {

            if (idClienteDevolver == array[i]) {

                posicion = i;
                posicionClienteDevolver =i;

                
                

            }

        }

        if (posicion >= 0) {



          //  System.out.println(" El dato " + idClienteDevolver + " se encuentra en la posicion " + posicion);
            

            matrizPeliculaDisponible[posicionPeliculaDevolver]= true;
            matrizClienteDisponibleParaPrestar[posicionClienteDevolver]=false;
            
            

               System.out.println("\n********       La pelicula fue devuleta      *************");


            

        


        } else {
            System.out.println("Dato no encontrado");
             System.out.println("   **********    INGRESA UN ID VALIDO   **********     ");
        }



    }

    public void ordenarAscendenteId(int [] array){
        int auxiliar;

        for (int i = 0; i < array.length  ; i++ ) {

            for (int j = 0; j < (array.length -1 ) ; j++ ) {
                


                if (array[j] > array[j+1]) {

                    auxiliar = array[j];
                    array[j]= array[j+1];
                    array[j+1]= auxiliar;
                    
                }

            }
            
        } 

        for (int i = 0; i < array.length ; i++ ) { 

            System.out.println(array[i] + " " ) ;
            
        }

    }





}
