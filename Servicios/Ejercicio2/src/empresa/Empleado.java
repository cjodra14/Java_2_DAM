package empresa;

public abstract class Empleado extends Persona{
	final int codEmpleado=0;
	public static int numEmpleado=0;
	double sueldo;
	
	
	public Empleado(String nombre, String apellido, int edad, Dni dni,double sueldo) {
		super(nombre, apellido, edad, dni);
		nuevoEmpleado();
		this.sueldo = sueldo;
	}
	


	public Empleado() {
		super();
		nuevoEmpleado();
	}
	
	@Override
	public String toString() {
		return nombre+" "+apellido+ " con "+edad+" años de edad  y con el DNI "+dni+" su sueldo es de "+sueldo;
		
	}



	static void nuevoEmpleado() {
		numEmpleado++;
	}
	
	abstract void  trabajar();
	
	double obtenerSueldo() {
		return sueldo;
	}



	public int getCodEmpleado() {
		return codEmpleado;
	}
	

}
