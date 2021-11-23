package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainSumas {
	static long N1 = 10;
	static long N2 = 10_000;

	static final long NUM_PROCESOS = 10;
	static final String PREFIJO_FICHEROS = "fich";

	public static void lanzarSumador(long n1, long n2, String fichResultados) throws IOException {
		String comando;
		comando = "prueba.Sumador";
		System.out.println("En el fichero " + fichResultados + " pone la suma entre " + n1 + " y " + n2);
		File directorioSumador;
		directorioSumador = new File("C:\\Eclipse_JavaSE\\workspace\\EjemploProcesos\\bin\\");
		File fichResultado = new File(fichResultados);
		ProcessBuilder pb;
		pb = new ProcessBuilder("java", comando, String.valueOf(n1), String.valueOf(n2));
		pb.directory(directorioSumador);
		pb.redirectOutput(fichResultado);
		pb.start();
	}

	public static long getResultadoFichero(String nombreFichero) {

		long suma = 0;
		try {
			FileInputStream fichero = new FileInputStream(nombreFichero);
			InputStreamReader fir = new InputStreamReader(fichero);
			BufferedReader br = new BufferedReader(fir);
			String linea = br.readLine();
			suma = new Long(linea);
			return suma;
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir " + nombreFichero);

		} catch (IOException e) {
			System.out.println("No hay nada en " + nombreFichero);
		}
		return suma;
	}

	public static long getSumaTotal(long numFicheros) {
		long sumaTotal = 0;
		for (long i = 1; i <= NUM_PROCESOS; i++) {
			sumaTotal = sumaTotal + getResultadoFichero(PREFIJO_FICHEROS + String.valueOf(i));
		}
		return sumaTotal;
	}

	/*
	 * Recibe dos parámetros y hará la suma de los valores comprendidos entre ambos
	 * parametros
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Número de nucleos " + Runtime.getRuntime().availableProcessors());
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd mm:ss:SSS");
		long inicio = System.currentTimeMillis();
		System.out.println("INICIO: " + formateador.format(new Date(inicio)));
		// int n1 = Integer.parseInt(args[0]);
		// int n2 = Integer.parseInt(args[1]);

		long salto = (N2 / NUM_PROCESOS) - 1;
		for (long i = 1; i <= NUM_PROCESOS; i++) {
			System.out.println("n1:" + N1);
			long resultadoSumaConSalto = N1 + salto;
			System.out.println("n2:" + resultadoSumaConSalto);
			lanzarSumador(N1, N1 + salto, PREFIJO_FICHEROS + String.valueOf(i));
			N1 = N1 + salto + 1;
			System.out.println("Suma lanzada...");
		}
		Thread.sleep(10000);
		long sumaTotal = getSumaTotal(NUM_PROCESOS);
		System.out.println("La suma total es:" + sumaTotal);
		long fin = System.currentTimeMillis();

		System.out.println("FIN: " + formateador.format(new Date(fin)));
		System.out.println("Ha tardado " + (fin - inicio) + " milisegundos");
	}
}
