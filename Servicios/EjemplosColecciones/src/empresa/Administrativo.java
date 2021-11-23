package empresa;

public class Administrativo extends Empleado implements ManejadorOrdenador {

	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
	}

	@Override
	public void teclear() {
		System.out.println("teclear");

	}

	@Override
	public void trabajar() {
		teclear();
	}

	@Override
	public String toString() {
		return "Administrativo [" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad()
				+ ", dni=" + getDni() + ", codEmpleado=" + getCodEmpleado() + ", sueldo=" + obtenerSueldo() + "]";
	}

}
