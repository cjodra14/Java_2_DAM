package sad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Properties;


public class ServicioAccesoDatos {
	
	
	RandomAccessFile fichero = null;
	String NOMBRE_FICHERO;
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	Properties archivoElegido= new Properties();

	public ServicioAccesoDatos() {
		try {
			
			//Lee el archivo de propiedasdes para cambiar de fichero facilmente
			archivoElegido.load(new FileInputStream(new File("archivoLeer.properties")));
			NOMBRE_FICHERO=archivoElegido.getProperty("archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  RandomAccessFile  accesoFichero() {
		try {
			//Retorna el fichero para poder tenerlo en otras clases
			fichero= new RandomAccessFile(NOMBRE_FICHERO,"r");
			System.out.println("Fichero abierto");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			e.printStackTrace();
		}
		
		return fichero;
		
	}
	
	
	

}
