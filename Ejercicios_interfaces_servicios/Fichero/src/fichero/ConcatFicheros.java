package fichero;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ConcatFicheros {
	//Valores por defecto para crear el fichero
	private static final String DIRECCION_FICHERO= "datos/";
	private static final String TIPO_FICHERO= ".dat";
	private static final String STD_NOMB_FICHERO = "concatFichero.dat";
	
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		RandomAccessFile fichero1 = null;
		RandomAccessFile fichero2 = null;
		RandomAccessFile fichero3 = null;
		String nombreFichero1, nombreFichero2, nombreFichero3;
		
		//Introducir nombre de los ficheros
		System.out.println("PROGRAMA PARA CONCATENAR FICHEROS DE NUMEROS ENTEROS");
		System.out.println("Introduzca el nombre del fichero:");
		nombreFichero1=teclado.nextLine();
		nombreFichero1=extraerName(nombreFichero1);
		System.out.println("Introduzca el nombre del fichero 2:");
		nombreFichero2=teclado.nextLine();
		nombreFichero2=extraerName(nombreFichero2);
		nombreFichero3=STD_NOMB_FICHERO;
		
		try {
			//Conseguimos e acceso a los ficheros
			fichero1 = new RandomAccessFile(DIRECCION_FICHERO+nombreFichero1,"r");
			fichero2 = new RandomAccessFile(DIRECCION_FICHERO+nombreFichero2,"r");
			fichero3 = new RandomAccessFile(DIRECCION_FICHERO+nombreFichero3,"rw");	
			boolean f1EOF = false;
			boolean f2EOF = false;
			
			try {
				//Nos aseguramos que todos los archivos tengan como punto de partida el inicio del fichero
				fichero1.seek(0);
				fichero2.seek(0);
				fichero3.seek(0);
				do {
					if (f1EOF) {
						try {
							fichero3.writeInt(fichero1.readInt());
						} catch (IOException e) {
							f1EOF=true;
						}
						}
					
						if(f2EOF) {
						try {
							
							fichero3.writeInt(fichero2.readInt());
						} catch (IOException e) {
							f2EOF=true;
						}}
					
				} while (!f1EOF|| !f2EOF);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				if (fichero1!=null) fichero1.close();
				if(fichero2!=null) fichero2.close();
				if(fichero3!=null) fichero3.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			teclado.close();
			System.out.println("Fin del programa");
		}
		
	}

	private static String extraerName(String name) {
		if(name.contains(".")) {
			int pointIndex = name.indexOf(".");
			name=name.substring(0,pointIndex);
		}
		
		return name+TIPO_FICHERO;
	}
}
