

package servicioaccesodatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import com.sun.xml.internal.fastinfoset.sax.Properties;


@Deprecated
public class ServAccDatos {
	static RandomAccessFile fichero = null;
	 private static String NOMBRE_FICHERO="alumno.dat";
	ArrayList<Integer> numeros = new ArrayList<Integer>();

	public ServAccDatos() {
		
	}
	
	public static RandomAccessFile  accesoFichero() {
		try {
			//Retorna el fichero para poder tenerlo en otras clases
			fichero= new RandomAccessFile(NOMBRE_FICHERO,"rw");
			System.out.println("Fichero abierto");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			e.printStackTrace();
		}
		
		return fichero;
		
	}
	
	
	public static void terminar() throws IOException {
		fichero.close();}

}
