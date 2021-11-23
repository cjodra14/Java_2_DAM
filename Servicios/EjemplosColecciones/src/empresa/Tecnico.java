package empresa;

public class Tecnico extends Empleado implements Arreglador {
	
	

	public Tecnico() {
		super();
	}

	public Tecnico(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
	}

	@Override
	public void trabajar() {
		arreglar();
		
	}

	@Override
	public void arreglar() {
		System.out.println("arreglar");
		
	}
	
	
	@Override
	public String toString() {
		return "Tecnico [" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad()
		+ ", dni=" + getDni() + ", codEmpleado=" + getCodEmpleado() + ", sueldo=" + obtenerSueldo() + "]";
	}
	
	
	
}
