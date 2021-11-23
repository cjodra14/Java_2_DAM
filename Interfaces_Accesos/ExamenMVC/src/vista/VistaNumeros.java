package vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import controlador.ControladorNumeros;

public class VistaNumeros {
	
	private Scanner entrada;
	private int opcion;
	
	ControladorNumeros controlador;

	public VistaNumeros(ControladorNumeros controlador) {
		this.controlador=controlador;
	}
	public void getAccion() {
		getMenu();
		getOpcion();
		
		do {
			switch(opcion) {
			case 1:
				verTodosNumeros();
					break;
			case 2:
				verImparesNumeros();
				break;
			case 3:
				verParesNumeros();
					break;
			
				default:
				System.out.println("La opcion no es correcta. \n");
					
			}
			if(opcion != 0) {
				getMenu();
				getOpcion();
			}
		}while(opcion != 0) ;
			System.out.println("ADIOS");
			System.out.println("-------");
			terminarAplicacion();
			System.exit(0);
		}
		
		

		private void getMenu() {
			
			System.out.println("\n==============================");
			System.out.println("	MENÚ PRINCIPAL	");
			System.out.println("==============================");
			System.out.println("Menu");
			System.out.println("-----");
			System.out.println("1 - Todos");
			System.out.println("2 - Impares");
			System.out.println("3 - Pares");
			System.out.println("0 - Terminar");
			
	}
	
	private void getOpcion() {
		entrada = new Scanner(System.in);
			System.out.println("Introduzca una opcion: ");
		try {
			opcion = entrada.nextInt();
			entrada.nextLine();
		}catch(InputMismatchException exc) {
			opcion = -1;
		}
	}
	private void terminarAplicacion() {
		entrada.close();
		controlador.terminar();
	}
	
	
	public void verTodosNumeros() {
		System.out.println("--------------------------------------");
		ArrayList<Integer> numeros= controlador.obtenerTodosNumeros();
		Collections.sort(numeros);
		
		 Iterator<Integer> it = numeros.iterator();
		 while(it.hasNext()) {
		 System.out.print(it.next()+"  ");}
		 System.out.println("\n-------------------------------------");
		
	}
	
	public void verParesNumeros() {
		System.out.println("--------------------------------------");
		ArrayList<Integer> numeros= controlador.obtenerParesNumeros();
		Collections.sort(numeros);
		
		 Iterator<Integer> it = numeros.iterator();
		 while(it.hasNext()) {
		 System.out.print(it.next()+"  ");}
		 System.out.println("\n-------------------------------------");
		
	}
	
	public void verImparesNumeros() {
		System.out.println("--------------------------------------");
		ArrayList<Integer> numeros= controlador.obtenerImparesNumeros();
		Collections.sort(numeros);
		
		 Iterator<Integer> it = numeros.iterator();
		 while(it.hasNext()) {
		 System.out.print(it.next()+"  ");}
		 System.out.println("\n-------------------------------------");
		
	}

}
