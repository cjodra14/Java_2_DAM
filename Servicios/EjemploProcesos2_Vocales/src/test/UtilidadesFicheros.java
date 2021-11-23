package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UtilidadesFicheros {
	public static BufferedReader getBufferedReader(String nombreFichero) throws FileNotFoundException {
		FileReader lector;
		lector = new FileReader(nombreFichero);
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(lector);
		return bufferedReader;
	}

	public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
		PrintWriter printWriter;
		FileWriter fileWriter;
		fileWriter = new FileWriter(nombreFichero);
		printWriter = new PrintWriter(fileWriter);
		return printWriter;
		// Fin de getPrintWriter
	}

	public static void escribir(String nombreFichero, String mensaje) throws IOException {
		PrintWriter printWriter = getPrintWriter(nombreFichero);
		printWriter.print(mensaje);
		printWriter.flush();
	}

	public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {
		ArrayList<String> lineas = new ArrayList<String>();
		BufferedReader bfr = getBufferedReader(nombreFichero);
		// Leemos l�neas del fichero...
		String linea = bfr.readLine();
		while (linea != null) {
			// Y las a�adimos al array
			lineas.add(linea);
			linea = bfr.readLine();
		}
		// Fin del bucle que lee l�neas
		return lineas;
	}

}
