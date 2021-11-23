package procesos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UtilidadesTareas {
	
	public static BufferedReader getBufferedReader( String nombreFichero) throws FileNotFoundException{
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
	}
	

	public static void main(String[] args) {
		try {
		BufferedReader objReader;
		objReader=getBufferedReader("FicheroEjemplo");
		String strCurrentLine;
		while ((strCurrentLine = objReader.readLine ())!= null) {    
		System.out.println (strCurrentLine);
		System.out.println(strCurrentLine.length());
		}}catch (Exception e) {
		}
		

	}

}
