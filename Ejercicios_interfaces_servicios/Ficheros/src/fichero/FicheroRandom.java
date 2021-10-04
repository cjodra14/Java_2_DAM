package fichero;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FicheroRandom {
	public static void main(String []args) {
		//Crecaión del Scanner de teclado
		Scanner src= new Scanner(System.in);
		//cRear Puntero al Fichero de tipo access random(acceso aleatorio)
		RandomAccessFile fichero = null;
		//Crear variable para numero enteros
		int numero;
		
		try {
			//Apertura del fichero para lectura- escritura, con este metodo si no existe se crea, si no, lo abre
			fichero= new RandomAccessFile("datos/enteros.dat", "rw");
			
			// Se llama a una funcion que muestra el contenido del fichero y lo vamos a mostrar por consola
			mostrarFichero(fichero);
			
			// se pide numero por teclado para guardar el fichero
			System.out.println("Introduce un numero:");
			numero=src.nextInt();	
			
			// Se utiliza por teclado para añadir el numero al final del fichero
			fichero.seek(fichero.length());
			fichero.writeInt(numero);
			mostrarFichero(fichero);
			
			
			
		} catch (IOException e) {
			System.err.print(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("El número introducido no es un número entero");
		}
		
		//matar todos los procesos par liberar recurso de maquina
		finally {
			try {
				if (fichero!= null) {
					src.close();
					fichero.close();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		
	}
	
	public static void mostrarFichero(RandomAccessFile file) {
		int numero;
		final int VALOR_INICIO=0;
		try {
			//Situamos el puntero al principio del fichero, porque lo vamos a listar de forma secuencial
			file.seek(VALOR_INICIO);
			System.out.println("......................... ");
			while (true) {
				//Sale del bucle al encontrar el EOF(produce una excepcion)
				numero= file.readInt();
				System.out.print(numero+",");
			}
		} catch (EOFException e) {
			System.out.println();
			System.out.println("............................");
		}catch (IOException e) {
		System.out.println(e.getMessage());}
	}

}
