package controlador;

import java.util.ArrayList;

import modelo.ModeloExamen;

public class ControladorNumeros {
	
	ModeloExamen modelo;

	public ControladorNumeros(ModeloExamen modelo) {
		this.modelo=modelo;
	}
	
	
	//retorna arraylist de numeros
	public ArrayList<Integer> obtenerTodosNumeros(){
		return modelo.obtenerTodosNumeros();
	}
	//retorna arraylist de numerosPares
	public ArrayList<Integer> obtenerParesNumeros(){
		return modelo.obtenerParesNumeros();
		}
		//retorna arraylist de numerosImpares
	public ArrayList<Integer> obtenerImparesNumeros(){
		return modelo.obtenerImparesNumeros();
		}
		
	public void terminar() {
		modelo.terminar();
	}

}
