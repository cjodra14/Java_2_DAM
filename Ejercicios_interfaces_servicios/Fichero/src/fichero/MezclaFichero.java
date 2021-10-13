package fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MezclaFichero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombreFichero1, nombreFichero2;
		System.out.println("MEZCLA DATOS DE DOS FICHEROS CON NÚMEROS ENTEROS");
		System.out.println("Asegurese que los ficheros existen en el directorio \'datos\' del programa");
		System.out.println("LA salida del programa es el fichero \'datos/mezclaFichero.dat \' ");
		try {
			System.out.println("Introduce el nombre dle primer fichero");
			nombreFichero1= teclado.nextLine();
			RandomAccessFile fichero1 = new RandomAccessFile("datos/"+nombreFichero1, "r");
			long faltaLeerFichero1 = fichero1.length();
			
			System.out.println("Introduce el nombre del segundofichero");
			nombreFichero2= teclado.nextLine();
			RandomAccessFile fichero2 = new RandomAccessFile("datos/"+nombreFichero2, "r");
			long faltaLeerFichero2 = fichero2.length();
			
			File ficheroMezcla = new File("datos/mezclaFichero.dat");
			ficheroMezcla.delete();
			RandomAccessFile fichero3 = new RandomAccessFile("datos/mezclaFicheros.dat","rw");
			
			int dato;
			while(faltaLeerFichero1>0||faltaLeerFichero2>0) {
				if(faltaLeerFichero1>0) {
					dato= fichero1.readInt();
					faltaLeerFichero1-=4;
					fichero3.seek(fichero3.length());
					fichero3.writeInt(dato);
				}if(faltaLeerFichero2>0) {
					dato= fichero2.readInt();
					faltaLeerFichero2-=4;
					fichero3.seek(fichero3.length());
					fichero3.writeInt(dato);
				}
			}
			teclado.close();
			fichero1.close();
			fichero2.close();
			fichero3.close();
			System.out.println("Fin del Programa");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
