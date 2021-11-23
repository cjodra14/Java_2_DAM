package dao;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class DAONumeros {
	public static RandomAccessFile fichero;
	

	public DAONumeros() {
	}
	
	public static void darFichero(RandomAccessFile fichero) {
		//Nos da el fichero
		DAONumeros.fichero=fichero;
	}
	
	
	public static ArrayList<Integer> todosNumeros(){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		final int VALOR_INICIO=0;
		try {
			//Situamos el puntero al principio del fichero, porque lo vamos a listar de forma secuencial
			fichero.seek(VALOR_INICIO);
			while (true) {
				//Sale del bucle al encontrar el EOF(produce una excepcion)
				numero= fichero.readInt();
				numeros.add(numero);
				;
			}
		} catch (EOFException e) {	
		}catch (IOException e) {
		System.out.println(e.getMessage());}		
		return numeros;
		
	}
	public static ArrayList<Integer> paresNumeros(){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		final int VALOR_INICIO=0;
		try {
			//Situamos el puntero al principio del fichero, porque lo vamos a listar de forma secuencial
			fichero.seek(VALOR_INICIO);
			while (true) {
				//Sale del bucle al encontrar el EOF(produce una excepcion)
				numero= fichero.readInt();
				if(numero%2==0) {
				numeros.add(numero);}
			}
		} catch (EOFException e) {	
		}catch (IOException e) {
		System.out.println(e.getMessage());}		
		return numeros;
		
	}
	
	public static ArrayList<Integer> imparesNumeros(){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		final int VALOR_INICIO=0;
		try {
			//Situamos el puntero al principio del fichero, porque lo vamos a listar de forma secuencial
			fichero.seek(VALOR_INICIO);
			while (true) {
				//Sale del bucle al encontrar el EOF(produce una excepcion)
				numero= fichero.readInt();
				if(numero%2!=0) {
				numeros.add(numero);
				}
			}
		} catch (EOFException e) {	
		}catch (IOException e) {
		System.out.println(e.getMessage());}		
		return numeros;
		
	}
	
	
	
	
	

}
