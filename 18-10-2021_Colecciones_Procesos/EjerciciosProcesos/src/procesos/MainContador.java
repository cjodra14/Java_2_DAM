package procesos;

import java.io.File;
import java.io.IOException;

public class MainContador {
	
	public static void lanzarProcesos(char letra,String ficheroEntrada,String ficheroSalida) throws IOException {
		String comando;
		comando="procesos.SumaLetra";
		System.out.println("En el fichero "+ficheroEntrada+" pone el total de veces que aparece la vocal "+letra);
		File directorioVocales;
		directorioVocales = new File("C:\\Eclipse_JavaSE\\workspace\\EjerciciosProcesos\\bin\\");
		File ficheroResultado = new File(ficheroSalida);
		ProcessBuilder pb;
		pb = new ProcessBuilder("java", comando, Character.toString(letra),ficheroEntrada);
		pb.directory(directorioVocales);
		pb.redirectOutput(ficheroResultado);
		pb.start();		
	}

	
	public static void main(String[] args) {
		char [] vocales= {'a','e','i','o','u'};
		final String NOMBRE_FICHERO = "Test";
		try {
			for (int i = 0; i < vocales.length; i++) {
				lanzarProcesos(vocales[i],"FicheroEjemplo",NOMBRE_FICHERO+vocales[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("fin");

	}

}
