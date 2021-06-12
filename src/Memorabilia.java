package src;
import java.util.Scanner;

public class Memorabilia{

	public static void main(String[] args) {
		
		Memorabilia practica2 = new Memorabilia();


	}

	// definiendo el scanner para toda  la clase

	Scanner sc = new Scanner(System.in);
	
	// variables globales  de los clientes

	String nombreCliente;
	int idCliente;
	int telefonoCliente;
	boolean TienePeliculaPrestada;

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
	//String nombreCliente [] = new String[30];


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
   	System.out.println("7. Mostrar clientes registrados:");
   	System.out.println("8. Reportes");
   	System.out.println("9. Salir");
   	System.out.println("\nIngresa la opcion a realizar: ");
   	opcion = sc.nextInt();

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

   	System.out.println("6. Registrar clientes");
   	

   	}

   	//Opcion 7 seleccionada
   	if (opcion==7) {

   	System.out.println("7. Mostrar clientes registrados:");

   		
   	}

   	//Opccion 8 seleccionada
   	if (opcion==8) {

   	System.out.println("8. Reportes");

   		
   	}

   }



   
}