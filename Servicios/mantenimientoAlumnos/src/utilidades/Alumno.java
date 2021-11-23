package utilidades;

import java.io.Serializable;

public class Alumno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private Dni dni;

	public Alumno() {
		super();
	}

	public Alumno(int id, String nombre, String apellido, int edad, Dni dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni
				+ "]";
	}

}
