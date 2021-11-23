package procesos;

import java.io.BufferedReader;
import java.io.File;

public class SumaLetra {
	
	public static int sumaLetra;
	
	public static void contarLetras(char letraComprobar,String nombreFichero){
		try {
			BufferedReader objReader;
			objReader=UtilidadesTareas.getBufferedReader(nombreFichero);
			String strCurrentLine;
			while ((strCurrentLine = objReader.readLine ())!= null) {    
			for (int i = 0; i < strCurrentLine.length(); i++) {
				if (Character.toUpperCase(letraComprobar)==Character.toUpperCase(strCurrentLine.charAt(i))) {
					sumaLetra++;
				}
			}
			}
			System.out.println(sumaLetra);
			}catch (Exception e) {}	
	}
	

	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char letraComprobar;
		String nombreFichero;
		letraComprobar = args[0].charAt(0);
		nombreFichero = args[1];
		contarLetras(letraComprobar,nombreFichero);

	}

}
