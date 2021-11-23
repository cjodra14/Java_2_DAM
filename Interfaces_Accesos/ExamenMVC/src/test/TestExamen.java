package test;

import controlador.ControladorNumeros;
import modelo.ModeloExamen;
import sad.ServicioAccesoDatos;
import vista.VistaNumeros;

public class TestExamen {

	public TestExamen() {
	}
	public static void main(String[] args) {
		
		ModeloExamen modelo = new ModeloExamen();
		ControladorNumeros controlador = new ControladorNumeros(modelo);
		VistaNumeros vista = new VistaNumeros(controlador);
		vista.getAccion();
		
	}

}
