package fichero;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fichero {
	

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		RandomAccessFile fichero = null;
		Fichero f1= new Fichero();
		String nombreFichero="";
		boolean seguir=true;
		System.out.println("Programa para trabajar con ficheros de números entero");
		System.out.println("Cual es el nombre del fichero, sin extensión");
		nombreFichero=src.nextLine();
		if(-1!=nombreFichero.indexOf(".")) {
		nombreFichero=nombreFichero.substring(0,nombreFichero.indexOf("."))+".dat";
		}
		else {
			nombreFichero=nombreFichero+".dat";
		}
		try {
			fichero= new RandomAccessFile("datos/"+nombreFichero, "rw");
		} catch (Exception e) {
			System.out.println("El fichero que ha indicado no existe "+e.getMessage());
			System.exit(0);
		}try {
			
		
		while(seguir) {int opcion;
		opcion=menu(nombreFichero,src,fichero);
		if(opcion==1||opcion==2) {
			}else {
				seguir=false;
			}
		}} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	public static int menu(String nombreFichero, Scanner src, RandomAccessFile fichero) {
		System.out.println("\nMenu:Operaciones con <"+nombreFichero+">");
		System.out.println("-----------------------------------------");
		System.out.print("1.- Almacenar datos\n2.- Listar fichero\n0.- Finalizar programa\nOpcion?\n");
		int opcion = src.nextInt();
	
			switch(opcion) {
			case 0:
				System.out.println("Adiós\nFin del programa.");
				System.exit(0);//Se acaba el programa.
				break;
			case 1:
				almacenar(fichero, src);
			    break;
			case 2:
				listar(fichero);
				
				break;
				default:
					
					break;
			}
			return opcion;
		
	}
	
	public static void listar(RandomAccessFile fichero) {
		int numero;
		final int VALOR_INICIO=0;
		try {
			//Situamos el puntero al principio del fichero, porque lo vamos a listar de forma secuencial
			fichero.seek(VALOR_INICIO);
			System.out.println("......................... ");
			while (true) {
				//Sale del bucle al encontrar el EOF(produce una excepcion)
				numero= fichero.readInt();
				System.out.print(numero+",");
			}
		} catch (EOFException e) {
			System.out.println();
			System.out.println("............................");
		}catch (IOException e) {
		System.out.println(e.getMessage());}
	
	}
	public static void almacenar(RandomAccessFile fichero, Scanner src) {
		try {
		int numero;
		System.out.println("Introduce un numero:");
		numero=src.nextInt();	
		
		// Se utiliza por teclado para añadir el numero al final del fichero
		fichero.seek(fichero.length());
		fichero.writeInt(numero);
		
		
		
	} catch (IOException e) {
		System.err.print(e.getMessage());
	} catch (InputMismatchException e) {
		System.err.println("El número introducido no es un número entero");
	}
	}

}
