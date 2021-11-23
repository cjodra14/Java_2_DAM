package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejarOrdenador, Arreglador {
	Ingeniero(String nombre, String apellido, int edad, Dni dni,double sueldo){
		super(nombre,apellido,edad,dni,sueldo);	
	}
	Ingeniero(){
		super();
	}
	 @Override
	double obtenerSueldo(){
		Random r= new Random();
		sueldo=sueldo*(1+(Math.random()*21/100));
		return sueldo;
	}
	
	public void disenyar() {
		System.out.println(nombre+" diseña");
	}

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" arregla");
		
	}

	@Override
	public void teclear() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" teclea");
		
	}

	@Override
	void trabajar() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" trabaja");
		
	}

}
