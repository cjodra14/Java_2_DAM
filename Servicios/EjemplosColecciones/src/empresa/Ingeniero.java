package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejadorOrdenador, Arreglador {

	public static final int PORCENTAJE_MAXIMO_SUBIDA_SUELDO = 20;

	public Ingeniero() {
		super();
	}

	public Ingeniero(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
	}

	@Override
	public void arreglar() {
		System.out.println("arreglar");

	}

	@Override
	public void teclear() {
		System.out.println("teclear");

	}

	@Override
	public void trabajar() {
		arreglar();
		teclear();

	}

	public double obtenerSueldo() {
		Random random = new Random();
		int porcentajeSubida = random.nextInt(PORCENTAJE_MAXIMO_SUBIDA_SUELDO + 1);
		return super.obtenerSueldo() * (1 + (double) porcentajeSubida / (double) 100);

	}

	public void disenyar() {
		System.out.println("disenyar");
	}
	
	@Override
	public String toString() {
		return "Ingeniero [" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad()
		+ ", dni=" + getDni() + ", codEmpleado=" + getCodEmpleado() + ", sueldo=" + obtenerSueldo() + "]";
	}

	
}
