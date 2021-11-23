package empresa;

public abstract class Empleado extends Persona implements Comparable<Empleado> {
	//
	private static final int NUM_EMPLEADOS_INICIALIZACION = 0;
	//
	private static int numEmpleados = NUM_EMPLEADOS_INICIALIZACION;
	//
	private final int codEmpleado;
	private double sueldo;

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);
		numEmpleados++;
		this.codEmpleado = numEmpleados;
		this.sueldo = sueldo;
	}

	public Empleado() {
		super();
		numEmpleados++;
		this.codEmpleado = numEmpleados;
	}

	@Override
	public String toString() {
		return "Empleado [" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad() + ", dni="
				+ getDni() + ", codEmpleado=" + codEmpleado + ", sueldo=" + sueldo + "]";
	}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public abstract void trabajar();

	public double obtenerSueldo() {
		return sueldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codEmpleado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (codEmpleado != other.codEmpleado)
			return false;
		return true;
	}

	@Override
	public int compareTo(Empleado empleado) {
		// return ((Integer) this.codEmpleado).compareTo(empleado.getCodEmpleado());
		int diferencia = this.codEmpleado - empleado.getCodEmpleado();
		return diferencia;

	}

}
