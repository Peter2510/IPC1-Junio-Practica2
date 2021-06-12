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


	//constructor de la practica

   public Memorabilia() {

   	//Mostrar el menu
   	mostrarMenu();

    


   }

   public void mostrarMenu(){

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
   	System.out.println("Ingresa la opcion a realizar: ");
   	int opcion = sc.nextInt();

   }



}