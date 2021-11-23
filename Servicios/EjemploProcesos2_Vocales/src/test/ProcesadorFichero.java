package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProcesadorFichero {
	public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {
		ArrayList<String> lineas = new ArrayList<String>();
		BufferedReader bfr = UtilidadesFicheros.getBufferedReader(nombreFichero);
		// Leemos líneas del fichero...
		String linea = bfr.readLine();
		while (linea != null) {
			// Y las añadimos al array
			lineas.add(linea);
			linea = bfr.readLine();
		}
		// Fin del bucle que lee líneas
		return lineas;
	}

	/**
	 * Dado un fichero pasado como argumento, contará cuantas apariciones hay de una
	 * cierta vocal (pasada como argumento) y dejará la cantidad en otro fichero
	 * (también pasado como argumento)
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// args = new String[3];
		// args[0] =
		// "C:\\Eclipse_JavaEE\\eclipse\\workspace\\HolaMundo\\src\\hola\\HolaMundo.java";
		// args[1] = "A";
		// args[2] = "A.txt";
		System.err.println(args[0]);
		System.err.println(args[1]);
		System.err.println(args[2]);
		String nombreFicheroEntrada = args[0];
		String letra = args[1];
		String nombreFicheroResultado = args[2];
		hacerRecuento(nombreFicheroEntrada, letra.charAt(0), nombreFicheroResultado);

//Fin del main
	}

	public static void hacerRecuento(String nombreFicheroEntrada, char letra, String nombreFicheroResultado)
			throws Exception {
		ArrayList<String> lineas = getLineasFichero(nombreFicheroEntrada);
		int suma = 0;
		String linea = null;
		for (int i = 0; i < lineas.size(); i++) {
			linea = lineas.get(i);
			suma = suma + contarCaracteres(linea, letra);
		}
		System.err.println("suma: " + suma);
		UtilidadesFicheros.escribir(nombreFicheroResultado, suma + "");
	}

	public static int contarCaracteres(String cadena, char caracter) {
		int posicion, contador = 0;
		String cadenaMayusculas = cadena.toUpperCase();
		char caracterMayusculas = Character.toUpperCase(caracter);
		// se busca la primera vez que aparece
		posicion = cadenaMayusculas.indexOf(caracterMayusculas);
		while (posicion != -1) { // mientras se encuentre el caracter
			contador++; // se cuenta
			// se sigue buscando a partir de la posición siguiente a la encontrada
			posicion = cadenaMayusculas.indexOf(caracterMayusculas, posicion + 1);
		}
		return contador;
	}

}
