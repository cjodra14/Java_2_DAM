package examen;

import java.util.ArrayList;

import java.util.Iterator;


//Christian Jodra Lopez 28/20/2021


public class Resultados {

	public Resultados() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) {
		ArrayList<Integer> numerosReproductores = new ArrayList<Integer>();
		
		Operativa oper1= new Operativa();
		numerosReproductores=oper1.listarNumerosReproductores();	
		
		 Iterator<Integer> iter = numerosReproductores.iterator();
	        System.out.println("Los numeros reproductores son: ");
	        while (iter.hasNext()) {
	            System.out.print(iter.next() + " ");
	            
	        }
	}

}
