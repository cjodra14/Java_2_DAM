package test;

import java.io.File;
import java.io.IOException;

public class Lanzador {

	static String PREFIJO_FICHEROS = "C:\\Eclipse_JavaEE\\eclipse\\workspace\\EjemploProcesos2_Vocales\\";

	public static void main(String[] args) throws IOException, InterruptedException {
		File directorioProcesadorFichero = new File(
				"C:\\Eclipse_JavaEE\\eclipse\\workspace\\EjemploProcesos2_Vocales\\bin\\");
		String ficheroEntrada;
		// ficheroEntrada = args[0];
		ficheroEntrada = "C:\\Eclipse_JavaEE\\eclipse\\workspace\\HolaMundo\\src\\hola\\HolaMundo.java";
		String[] vocales = { "A", "E", "I", "O", "U" };
		/* Se lanzan los procesos */
		for (int i = 0; i < vocales.length; i++) {
			String fichErrores = "Errores_" + vocales[i] + ".txt";
			ProcessBuilder pb = new ProcessBuilder("java", "test.ProcesadorFichero", ficheroEntrada, vocales[i],
					PREFIJO_FICHEROS + vocales[i] + ".txt");
			pb.directory(directorioProcesadorFichero);
			// Si hay algún error, almacenarlo en un fichero
			pb.redirectError(new File(fichErrores));
			pb.start();
			// Fin del for

		}
		/* Esperamos un poco */
		Thread.sleep(3000);
		//
		int sumaTotal = 0;
		for (int i = 0; i < vocales.length; i++) {
			sumaTotal = sumaTotal + Integer
					.parseInt(UtilidadesFicheros.getLineasFichero(PREFIJO_FICHEROS + vocales[i] + ".txt").get(0));
		}
		System.out.println("sumaTotal: " + sumaTotal);
	}
}
