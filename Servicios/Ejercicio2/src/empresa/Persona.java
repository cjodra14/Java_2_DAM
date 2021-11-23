package empresa;

public abstract class Persona {
	String nombre;
	String apellido;
	int edad;
	Dni dni;
	
	
	
	
	public Persona() {
		
	}
	public Persona(String nombre, String apellido, int edad, Dni dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public String toString() {
		return nombre+" "+apellido+ " con "+edad+" años de edad  y con el DNI "+dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	
	
	

}
