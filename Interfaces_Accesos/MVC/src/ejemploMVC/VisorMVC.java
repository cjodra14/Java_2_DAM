package ejemploMVC;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VisorMVC {
	
	private int opcion;
	private ControladorMVC controlador;
	private ResultSet resultado;
	private Scanner src;
	
	public VisorMVC(ControladorMVC controlador) {
		
		this.controlador=controlador;
		
	}
	
	public void getAccion() {
		getMenu();
		getOpcion();
		do {
			switch (opcion) {
				case 1:
					listarAutores();
				break;
				default:
					System.out.println("La opción tecleada no es correcta. \n");
				break;
			}
			if (opcion !=0 ) {
				getMenu();
				getOpcion();
			}
		} while (opcion != 0);
		System.out.println("ADIÓS. PROGRAMA FINALIZADO");
		System.out.println("---------------------------");
		terminarAplicacion();
		System.exit(0);
	}
	private void getMenu() {
		
		System.out.println("APLICACIÓN EJEMPLO DE MVC");
		System.out.println("=========================");
		System.out.println("Menu:");
		System.out.println("------");
		System.out.println("1.- Listado de Autores");
		System.out.println("0. - Salir");
		
	}
	private void getOpcion() {
		src = new Scanner(System.in);
		System.out.println("Introduzca una opción:");
		try {
			opcion = src.nextInt();
		} catch (InputMismatchException e) {
			opcion=-1;
		}
	}
	
	//Metodos para solicitar los servicios de Aplicacion
	
	private void terminarAplicacion() {
		src.close();
		controlador.terminar();
	}
	
	private void listarAutores() {
		resultado = controlador.obtenerAutores();
		System.out.println("\nLISTADO DE AUTORES");
		System.out.println("======================");
		try {
			while(resultado.next()) {
				String codAutor = resultado.getString(1);
				String nombreAutor = resultado.getString(2);
				System.out.println("Código de autor "+codAutor+" - "+nombreAutor);
			}
			System.out.println("**************************** FIN DEL LISTADO **************************");
		} catch (SQLException e) {
			System.err.println("Vista: FALLO A OBTENER  AUTORES");
			e.printStackTrace();
		}
	}

}
