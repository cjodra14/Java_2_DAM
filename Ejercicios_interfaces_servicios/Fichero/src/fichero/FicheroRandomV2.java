package fichero;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FicheroRandomV2 {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		int opcionMenu;
		String nombreFichero;
		RandomAccessFile fichero = null;
		try {
			System.out.println("PROGRAMA PARA TRABAJAR CON FICHEROS DE NÚMEROS ENTEROS");
			System.out.println("Introduzca el nombre del fichero sin extension:");
			nombreFichero=src.nextLine();
			nombreFichero= validarNombreFichero(nombreFichero);
			
			fichero = new RandomAccessFile("datos/"+nombreFichero+".dat","rw");
			
			presentarMenu(nombreFichero);
			do {
				opcionMenu = src.nextInt();
				switch(opcionMenu) {
				case 1:
					introducirDato(fichero,nombreFichero, src);
					presentarMenu(nombreFichero);
					break;				
				case 2:
					listarFichero(fichero, nombreFichero);
					presentarMenu(nombreFichero);
					break;
				case 0:
					System.out.println("Adiós \n Fin programa");
					System.exit(0);
					break;
				default:
					opcionMenu=1;
					System.out.println("No se ha seleccionado una opción valida de menú");
					System.out.println("Intentelo de nuevo");
					break;
				}
			} while (opcionMenu==1||opcionMenu==2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("La informacion proporcionada no es valida");
		}
		finally {
			try {
				if(fichero!=null)fichero.close();
				src.close();
				System.out.println("El programa ha terminado");
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static void presentarMenu(String nombre) {
		System.out.println("\nMENÚ: Operaciones con el fichero <"+nombre+">");
		System.out.println("................................................");
		System.out.println("1- Almacenar datos");
		System.out.println("2- Listar fichero");
		System.out.println("0- Finalizar programa\n");
		System.out.println("¿Opcion?");
		
	}
	private static String validarNombreFichero(String nombreFichero) {
		if(nombreFichero.contains(".")) {
			nombreFichero= nombreFichero.substring(0, nombreFichero.indexOf("."));
		}
		return nombreFichero;
	}
	public static void listarFichero(RandomAccessFile fichero,String nombre ) {
		int dato;
		try {
			System.out.println("\nLISTADO: "+nombre);
			System.out.println(".....................................................");
			
			fichero.seek(0);
			while(true){			
				dato= fichero.readInt();				
				System.out.print(dato+", ");
				}
		}catch (EOFException e) {
			System.out.println();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
		
	}
	
	public static void introducirDato(RandomAccessFile fichero, String nombre, Scanner src) {
		int dato;
		System.out.println("Entrada de datos en el fichero< "+nombre+" >");
		try {
			do {
				System.out.println("Introduzca un un numeor entero , o cualquier otro tipo de dato para finalizar la entrada");
				dato= src.nextInt();
				fichero.seek(fichero.length());

				fichero.writeInt(dato);
			} while (true);
			
			
			
		} catch (IOException e) {
			System.err.print(e.getMessage());
		} catch (InputMismatchException e) {
			src.nextLine();
		}
	}

}
