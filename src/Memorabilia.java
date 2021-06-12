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
	int primerId =0;
	int idCliente;
	int telefonoCliente;
	int contadorCliente =0;
	int contadorPelicula=0;
	boolean tienePeliculaPrestada;

	//variables globales de las peliculas
	String nombrePelicula;
	int idPelicula;
	int primerIdPelicula =0;
	int anioPelicula;
	String categoria;
	boolean peliculaDisponible;
	int contadorAccion =0;
	int contadorDrama =0;
	int contadorDocumental =0;
	int	contadorComedia =0;
	int	contadorRomantica =0;

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


	//constructor de la practica

   public Memorabilia() {

   	//Mostrar el menu
   	mostrarMenu();

    


   }

   public void mostrarMenu(){
	 	
	int opcion =0;

	//Mostrar el menu mientras no se ingrese la opcion de salir, es decir, el numero 9
	do{



   	System.out.println("___________________________________________________________");
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
   	System.out.println(primerId);
   	System.out.println(primerIdPelicula);

   	System.out.print("\nIngresa la opcion a realizar: ");
   	opcion = scanner.nextInt();

   	System.out.println("___________________________________________________________");

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

   		prestamoPeliculas();
   		}

   	//Opcion 2 seleccionada
   		if (opcion==2) {

   			System.out.println("\n2. Devolucion de peliculas ");
   		}

   	//Opcion 3 seleccionada
   		if (opcion==3) {

   		mostrarPeliculas();
   		
   		}

   		//Opcion 4 seleccionada
   		if (opcion==4) {

   		registrarPelicula();

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

   			mostrarClientes();

   			}
   			

   		//Opccion 8 seleccionada
   		if (opcion==8) {

   		reportes();

   		}

   }

   // Registrar cliente nuevo
   public void registrarClientes(){

   		System.out.println("___________________________________________________________");
   		System.out.println("");
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

		System.out.print("\nIngrese el telefono del cliente: ");
        telefonoCliente = scanner.nextInt();
		matrizTelefonoCliente[contadorCliente]=telefonoCliente;

		//Pelicula prestada
		tienePeliculaPrestada = false;
		contadorCliente++;

   		System.out.println("___________________________________________________________");

	
      }

      /* if (contadorCliente==0) {
			primerId=idCliente;

			//Ingresar el telefono del cliente
					System.out.print("\nIngrese el telefono del cliente: ");
        			telefonoCliente = scanner.nextInt();
					matrizTelefonoCliente[contadorCliente]=telefonoCliente;

					//Pelicula prestada
					tienePeliculaPrestada = false;
					contadorCliente++;
		}

		else{
			for (int i = 0 ; i < contadorCliente ; i++ ) {

				if (matrizIdCliente[i]!=(primerId)) {
					System.out.println("Ingresa un id distinto");
					registrarClientes();
				}

				else{
					System.out.print("\nENTRE AL ELSEIngrese el telefono del cliente: ");
        			telefonoCliente = scanner.nextInt();
					matrizTelefonoCliente[contadorCliente]=telefonoCliente;

					//Pelicula prestada
					tienePeliculaPrestada = false;

				}
			}

				

					System.out.print("\nENTRE AL ELSEIngrese el telefono del cliente: ");
        			telefonoCliente = scanner.nextInt();
					matrizTelefonoCliente[contadorCliente]=telefonoCliente;

					//Pelicula prestada
					tienePeliculaPrestada = false;
					contadorCliente++;	
			
		} */

		//imprimir en pantalla los clientes
		public void mostrarClientes(){

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
   				System.out.println("CLIENTES REGISTRADOS");
   				System.out.println("\nid: " + matrizIdCliente[i]+", Nombre del Cliente: "+ matrizNombreCliente[i] + ", telefono: " + matrizTelefonoCliente[i] + ", Posee peliculas de la tienda: "+ prestamo );
   			}

   		System.out.println();

   		}

		}

		// Registrar nueva pelicua
   		public void registrarPelicula(){

   		System.out.println("___________________________________________________________");
   		System.out.println("");
   		System.out.println("\nBienvenido al registro de peliculas");

   		//Ingresar nonmbre de la pelicula
      	System.out.print("\nIngrese el nombre de la pelicula:  ");
        nombrePelicula = scanner.nextLine();
        nombrePelicula = scanner.nextLine();
		matrizNombrePelicula[contadorPelicula]=nombrePelicula;
		
		//Ingresar el id del cliente
		System.out.print("\nIngrese el id de la pelicula: ");
        idPelicula = scanner.nextInt();
		matrizIdPelicula[contadorPelicula]=idPelicula;

		System.out.print("\nIngrese el año de estreno de la pelicula: ");
        anioPelicula = scanner.nextInt();
		matrizAnioPelicula[contadorPelicula]=anioPelicula;

		System.out.print("\nIngrese la categoria de la pelicula:  ");
		System.out.print("\nCategorias disponibles:  ");
		System.out.print("\n1. Accion");
		System.out.print("\n2. Drama");
		System.out.print("\n3. Documental");
		System.out.print("\n4. Comedia");
		System.out.print("\n5. Romantica");
		System.out.print("\nIngresa el numero de la categoria: ");
		int opcion = scanner.nextInt();

		if (opcion==1) {

			contadorAccion++;	
		}

		if (opcion==2) {
			
			contadorDrama++;
		}

		if (opcion==3) {
			
			contadorDocumental++;
		}

		if (opcion==4) {
			
			contadorComedia++;
		}

		if (opcion==5) {

			contadorRomantica++;
			
		}

        categoria = scanner.nextLine();
        
		matrizCategoriaPelicula[contadorPelicula]= categoria ;

		matrizPeliculaDisponible[contadorPelicula] = true;



		//Pelicula prestada
		peliculaDisponible = true;
		contadorPelicula++;
		primerIdPelicula = idPelicula;
		System.out.println(primerId);

   		System.out.println("___________________________________________________________");

	}

	public void mostrarPeliculas(){
		String enPrestamo;
		if (contadorPelicula==0) {
   				System.out.print("\nAun no hay peliculas registradas\n");
   			}

   			else{


   			for (int i =0 ; i < contadorPelicula ; i++ ) {

   				if (matrizPeliculaDisponible[i] ==false) {
   					 enPrestamo = "si";
   				}

   				else{
   					 enPrestamo = "no";
   				}
   				System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
   				System.out.println("\nid: " + matrizIdPelicula[i] +", Nombre de la pelicula: "+ matrizNombrePelicula[i] + ", año de estreno: " + matrizAnioPelicula[i] + ", Categoria: "+ matrizCategoriaPelicula[i]+ ", disponible: " + matrizPeliculaDisponible[i]);
   			}

   		System.out.println();

   		}
	}

	public void prestamoPeliculas(){
		
		int idPrestar=0;

		//se muestran las peliculas registradas
		mostrarPeliculas();

		//si hay peliculas registradas
		if (contadorPelicula>0) {

   				System.out.println("\nSolo puedes prestar una pelicula a la vez");
   				
   				System.out.println("\nIngresa el id de la pelicula que deseas : ");
   				idPrestar = scanner.nextInt();
   				buscarIdPelicula(idPrestar);


   			}
		
	}

		public void buscarIdPelicula(int buscar){
			
			//System.out.println("\nIngresa el id de la pelicula que deseas buscar: ");
			//buscar = scanner.nextInt();
			int contador=0;
			while ((contador < matrizIdPelicula[contadorPelicula]) &&(matrizIdPelicula[contador]) !=buscar) {
				contador++;
					
			}

			if (contador != matrizIdCliente[contadorPelicula]) {

				System.out.println("Lo encontre");
				System.out.println("Se encontro el numero ingresado");

			}

				else{

					System.out.println("No lo encontre");	
					System.out.println("No se encontro el numero ingresado" );	
				}


	}

	public void codigoPeliculaAlquilar(){
		System.out.println("Ingrese la pelicula a alquilar:");
		int codigo = scanner.nextInt();

		//matrizIdPelicula
	}

	public void reportes(){

		System.out.println("___________________________________________________________");
		System.out.println("");
		System.out.println("CANTIDAD DE PELICULAS POR CATEGORIA");
		System.out.println("\nPeliculas categoria en acción: " + contadorAccion);
		System.out.println("Peliculas categoria en drama: " + contadorDrama);
		System.out.println("Peliculas categoria en documental: " + contadorDocumental);
		System.out.println("Peliculas categoria en comedia: " + contadorComedia);
		System.out.println("Peliculas categoria en Romantica: " + contadorRomantica);
		System.out.println("___________________________________________________________");
		


	}

}    




