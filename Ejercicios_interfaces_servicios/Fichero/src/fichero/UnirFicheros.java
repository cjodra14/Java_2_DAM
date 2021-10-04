package fichero;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnirFicheros {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		int opcionMenu;
		String nombreFichero_segundo, nombreFichero_primero;
		RandomAccessFile fichero_primero = null; 
		RandomAccessFile fichero_segundo = null;
			
		try {
			System.out.println("PROGRAMA PARA TRABAJAR CON FICHEROS DE NÚMEROS ENTEROS");
			System.out.println("Introduzca el nombre del primer fichero sin extension:");
			nombreFichero_primero=src.nextLine();
			nombreFichero_primero= validarNombreFichero(nombreFichero_primero);
			System.out.println("Introduzca el nombre del segundo fichero sin extension:");
			nombreFichero_segundo=src.nextLine();
			nombreFichero_segundo= validarNombreFichero(nombreFichero_segundo);
			fichero_primero = new RandomAccessFile("datos/"+nombreFichero_primero+".dat","rw");
			fichero_segundo = new RandomAccessFile("datos/"+nombreFichero_segundo+".dat","rw");
			presentarMenu(nombreFichero_primero,nombreFichero_segundo);
			RandomAccessFile ficheroUnido= new RandomAccessFile("datos/"+nombreFichero_primero+nombreFichero_segundo+"Unir.dat","rw");
			
			do {
				opcionMenu = src.nextInt();
				switch(opcionMenu) {
				case 1:
					introducirDatos(fichero_primero,fichero_segundo,nombreFichero_primero,nombreFichero_segundo);
					presentarMenu(nombreFichero_primero,nombreFichero_segundo);
					break;				
				case 2:
					listarFichero(ficheroUnido,nombreFichero_primero+nombreFichero_segundo+"Unir");
					presentarMenu(nombreFichero_primero,nombreFichero_segundo);
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
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}catch (InputMismatchException e) {
				System.out.println("La informacion proporcionada no es valida");
			}
			finally {
				try {
					if(fichero_primero!=null)fichero_primero.close();
					if(fichero_segundo!=null)fichero_segundo.close();
					src.close();
					System.out.println("El programa ha terminado");
				}
				catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
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
	private static void introducirDatos(RandomAccessFile fichero_primero, RandomAccessFile fichero_segundo,
			String nombreFichero_primero, String nombreFichero_segundo) {
		int dato1=0, dato2=0;
		RandomAccessFile ficheroUnido= null;
		System.out.println("Entrada de datos en el fichero< "+nombreFichero_primero+nombreFichero_segundo+"Unidos >");
		try {			
			ficheroUnido = new RandomAccessFile("datos/"+nombreFichero_primero+nombreFichero_segundo+"Unir.dat","rw");
			fichero_primero.seek(0);
			fichero_segundo.seek(0);
			do {	
				if(fichero_primero.getFilePointer()<fichero_primero.length()) {				
				dato1=fichero_primero.readInt();				
				ficheroUnido.seek(ficheroUnido.length());
				ficheroUnido.writeInt(dato1);}
				
				if(fichero_segundo.getFilePointer()<fichero_segundo.length()) {				
				dato2=fichero_segundo.readInt();				
				ficheroUnido.seek(ficheroUnido.length());
				ficheroUnido.writeInt(dato2);}
			} while (fichero_primero.getFilePointer()<fichero_primero.length()||fichero_segundo.getFilePointer()<fichero_segundo.length());		
			
			
		} catch (IOException e) {
			System.err.print(e.getMessage());
		} 
		
	}
	private static String validarNombreFichero(String nombreFichero) {
		if(nombreFichero.contains(".")) {
			nombreFichero= nombreFichero.substring(0, nombreFichero.indexOf("."));
		}
		return nombreFichero;
		}
	private static void presentarMenu(String nombre1, String nombre2) {
		System.out.println("\nMENÚ: Operaciones con el fichero <"+nombre1+"> <"+nombre2+">");
		System.out.println("................................................");
		System.out.println("1- Unir datos");
		System.out.println("2- Listar fichero unido");
		System.out.println("0- Finalizar programa\n");
		System.out.println("¿Opcion?");
		
	}
}
