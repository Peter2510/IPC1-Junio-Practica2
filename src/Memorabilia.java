package src;
import java.util.Scanner;

public class Memorabilia{

	public static void main(String[] args) {
		
		Memorabilia practica2 = new Memorabilia();


	}

	// definiendo el scanner para toda  la clase

	Scanner scanner = new Scanner(System.in);
	
	// variables globales  de los clientes

	String nombreCliente;
	int idCliente;
	int telefonoCliente;
	int contadorCliente =0;
	boolean tienePeliculaPrestada;

	//variables globales de las peliculas
	String nombrePelicula;
	int idPelicula;
	int anioPelicula;
	String categoria;
	boolean disponible;

	//variables globales peliculas prestadas
	int idPeliculaPrestada;
	int idClientePrestamo;
	int diasPrestamo;

	//matriz de clientes
	// TipoDeDato nombre[] = new TipoDeDato[tamaño];
	//matriz de nombres
	String matrizNombreCliente[] = new String[30];

	// Matriz de id
	int matrizIdCliente[] = new int[30];

	// Matriz de telefono cliente
	int matrizTelefonoCliente[] = new int[30];



	//constructor de la practica

   public Memorabilia() {

   	//Mostrar el menu
   	mostrarMenu();

    


   }

   public void mostrarMenu(){
	 	
	int opcion =0;

	//Mostrar el menu mientras no se ingrese la opcion de salir, es decir, el numero 9
	do{

	System.out.println("\nSelecciona una opcion: ");
   	System.out.println("\n1. Prestamo de peliculas ");
   	System.out.println("2. Devolucion de peliculas ");
   	System.out.println("3. Mostrar datos de las peliculas ");
   	System.out.println("4. Registrar nueva pelicula ");
   	System.out.println("5. Ordenar las peliculas en forma ascente respecto al nombre ");
   	System.out.println("6. Registrar nuevos clientes");
   	System.out.println("7. Mostrar clientes registrados");
   	System.out.println("8. Reportes");
   	System.out.println("9. Salir");
   	System.out.print("\nIngresa la opcion a realizar: ");
   	opcion = scanner.nextInt();

   	opcionIngresada(opcion);


	}

   	while (opcion!=9); {

   	// si se ingresa el numero 9, termina el programa
	System.out.println("\nVuelve pronto ");
   
   	}

   }

   public void opcionIngresada(int opcion){
   	
   	//Opcion 1 seleccionada
   		if (opcion==1) {

   		System.out.println("\n1. Prestamo de peliculas ");
   		}

   	//Opcion 2 seleccionada
   		if (opcion==2) {

   			System.out.println("\n2. Devolucion de peliculas ");
   		}

   	//Opcion 3 seleccionada
   		if (opcion==3) {

   		System.out.println("3. Mostrar datos de las peliculas ");
   		
   		}

   		//Opcion 4 seleccionada
   		if (opcion==4) {

   		System.out.println("4. Registrar nueva pelicula ");

   		}

   		//Opcion 5 seleccionada
   		if (opcion==5) {

   		System.out.println("5. Ordenar las peliculas en forma ascente respecto al nombre ");
   	
   		}

   		//Opcion 6 seleccionada
   		if (opcion==6) {

   		registrarClientes();
   	

   		}

   		//Opcion 7 seleccionada
   		if (opcion==7) {

   			if (contadorCliente==0) {
   				System.out.print("\nAun no hay clientes registrados\n");
   			}

   			else{

   				String prestamo;

   			for (int i =0 ; i < contadorCliente ; i++ ) {

   				if (tienePeliculaPrestada==false) {
   					 prestamo = "no";
   				}

   				else{
   					 prestamo = "si";
   				}
   				System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
   				System.out.println("\nid: " + matrizIdCliente[i]+", Nombre del Cliente: "+ matrizNombreCliente[i] + ", telefono: " + matrizTelefonoCliente[i] + ", Posee peliculas de la tienda: "+ prestamo );
   			}

   		System.out.println();

   		}

   			}
   			

   		//Opccion 8 seleccionada
   		if (opcion==8) {

   		System.out.println("8. Reportes");

   		}

   }

   // Registrar cliente nuevo
   public void registrarClientes(){

   		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
   		System.out.println("\nBienvenido al registro de clientes");

   		//Ingresar nonmbre del cliente
      	System.out.print("\nIngrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();
        nombreCliente = scanner.nextLine();
		matrizNombreCliente[contadorCliente]=nombreCliente;
		
		//Ingresar el id del cliente
		System.out.print("\nIngrese el id del cliente: ");
        idCliente = scanner.nextInt();
		matrizIdCliente[contadorCliente]=idCliente;

		//Ingresar el telefono del cliente
		System.out.print("\nIngrese el telefono del cliente: ");
        telefonoCliente = scanner.nextInt();
		matrizTelefonoCliente[contadorCliente]=telefonoCliente;

		//Pelicula prestada
		tienePeliculaPrestada = false;
		contadorCliente++;

      }



   
}