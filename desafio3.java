package desafio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio3 {

	static char Respuesta;
	static String[] TituloLibro = { "Caca", "Las Aventuras de Pepe", "Five night with Cristian", "Faustino juegos",
	"El roba Quesos cremosos", "El señor de la Noche" };
	static String[] Autor = { "Culo", "Pepe", "Freddy", "Faustino", "Josue", "Antony" };
	static int[] Numpag = { 70, 400, 50, 92, 1000, 148 };
	static int opcion = 0;
	static String busqueda;
	static boolean bandera = false;

	public static void IngDatos() {
	Scanner datos = new Scanner(System.in);
	try {
	System.out.println("\n\tSeleccionar una opcion\n");

	System.out.println("1. Lista de libros");
	System.out.println("2. Buscar Libros");
	System.out.println("3. Salir del programa");

	System.out.println("\nOpcion seleccionada: ");
	opcion = datos.nextInt();

	if (opcion >= 4 || opcion <= 0) {
	throw new InputMismatchException();
	}
	} catch (InputMismatchException e) {
	System.out.println("Error: Debés ingresar un dato valido.");
	}
	}

	public static void ListaDeLibros() {

	for (int i = 0; i < TituloLibro.length; i++) {

	System.out.println("Libro N" + (i + 1) + " Titulo: " + TituloLibro[i] + " Autor: " + Autor[i] + " Paginas: "
	+ Numpag[i]);

	}

	}

	public static void Busqueda() {
	Scanner datos = new Scanner(System.in);
	try {
	System.out.println("Que libro desea buscar");
	busqueda = datos.nextLine();

	busqueda = busqueda.toUpperCase();
	for (int i = 0; i < TituloLibro.length; i++) {
	if (busqueda.equals(TituloLibro[i].toUpperCase())) {
	System.out.println("\nTitulo: " + TituloLibro[i] + " Autor: " + Autor[i] + " Paginas: " + Numpag[i]);
	}
	else{
	throw new ArithmeticException();
	}
	}
	} catch (ArithmeticException e) {
	System.out.println("No se a encontrado un libro con ese nombre");
	}

	}
	public static void seguirOno() {
	Scanner datos = new Scanner(System.in);
	System.out.println("\nDesea seguir con el programa?(elegir S o N)");
	Respuesta = datos.next().charAt(0);

	if (Respuesta == 'S' || Respuesta == 's') {
	bandera = false;
	}
	if (Respuesta == 'N' || Respuesta == 'n') {
	bandera = true;
	}
	}
	public static void main(String[] args) {
	while (bandera != true) {
	IngDatos();
	switch (opcion) {
	case 1: {ListaDeLibros();
	seguirOno();
	break;
	}
	case 2: {Busqueda();
	seguirOno();
	break;
	}
	case 3: {bandera = true;
	break;

	}
	}
	}
	}
	}
	

