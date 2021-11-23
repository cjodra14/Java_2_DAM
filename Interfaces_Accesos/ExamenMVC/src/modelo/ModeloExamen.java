package modelo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import dao.DAONumeros;
import sad.ServicioAccesoDatos;

public class ModeloExamen {
	RandomAccessFile fichero; 
	ServicioAccesoDatos servicio = new ServicioAccesoDatos();

	public ModeloExamen() {
		fichero=servicio.accesoFichero();
		DAONumeros.darFichero(fichero);
	}
	
	public ArrayList<Integer> obtenerTodosNumeros(){		
		//ArrayList<Integer> numeros = DAONumeros.todosNumeros();
		
		
		return ordenar(DAONumeros.todosNumeros());
		
	}
	
	public ArrayList<Integer> obtenerParesNumeros(){		
		ArrayList<Integer> numeros = DAONumeros.paresNumeros();
		ArrayList<Integer> numerosDivididos = new ArrayList<Integer>();
		Iterator<Integer> it = numeros.iterator();
		 while(it.hasNext()) {
		numerosDivididos.add((it.next()/2));}
		
		
		return ordenar(numerosDivididos);
		
	}
	public ArrayList<Integer> obtenerImparesNumeros(){	
		int numero=0;
		ArrayList<Integer> numeros = DAONumeros.imparesNumeros();
		ArrayList<Integer> numerosDecenaSuperior = new ArrayList<Integer>();
		Iterator<Integer> it = numeros.iterator();
		 while(it.hasNext()) {
			 numero=it.next();
			 while(numero % 10 != 0) {
				 numero++;
				 }
			 numerosDecenaSuperior.add(numero);}
		
		return ordenar(numerosDecenaSuperior);
		
	}
	
	public ArrayList<Integer> ordenar(ArrayList<Integer> listaSinOrdenar) {
		int [] arraySinOrdenar = new int [listaSinOrdenar.size()];
		ArrayList<Integer> numerosOrdenados = new ArrayList<Integer>();
		
		Iterator<Integer> it= listaSinOrdenar.iterator();
		for (int i = 0; i < arraySinOrdenar.length; i++) {
			
			arraySinOrdenar[i]=it.next();
		}
		
		int menor;

	    for(int i = 0; i < arraySinOrdenar.length; i++){
	        menor = arraySinOrdenar[0];

	        if (arraySinOrdenar[i] < menor){
	            menor = arraySinOrdenar[i];
	        }
	        else{
	            if (arraySinOrdenar[i] > menor){
	              menor = menor;
	            }      
	        }
	    }
	    
	    for (int i = 0; i < arraySinOrdenar.length; i++) {
			numerosOrdenados.add(arraySinOrdenar[i]);
		}
	    return numerosOrdenados;
	}

	public void terminar() {
		try {
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	

}
