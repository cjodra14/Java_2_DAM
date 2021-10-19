package procesos;

import java.io.BufferedReader;
import java.io.File;

public class SumaLetra {
	public static int sumaLetra;
	
	

	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char letraComprobar;
		String nombreFichero;
		letraComprobar = args[0].charAt(0);
		nombreFichero = args[1];
		try {
			BufferedReader objReader;
			objReader=UtilidadesTareas.getBufferedReader(nombreFichero);
			String strCurrentLine;
			while ((strCurrentLine = objReader.readLine ())!= null) {    
			for (int i = 0; i < strCurrentLine.length(); i++) {
				if (letraComprobar==Character.toUpperCase(strCurrentLine.charAt(i))) {
					sumaLetra++;
				}
			}
			}
			System.out.println(sumaLetra);
			System.out.flush();}catch (Exception e) {}		

	}

}
