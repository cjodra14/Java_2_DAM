package controlador;

import java.io.IOException;
import java.util.ArrayList;

import modelo.ModeloAlumnos;
import utilidades.Alumno;

public class ControladorAlumnos {
	ModeloAlumnos modelo;
	
	public ControladorAlumnos(ModeloAlumnos modelo) {
		this.modelo=modelo;
	}
	 public void removeAlumno(int id) throws ClassNotFoundException, IOException {
		modelo.removeAlumno(id);
	}
	public void modifyAlumno(Alumno alumno) throws ClassNotFoundException, IOException {
		modelo.modifyAlumno(alumno);
	}
	
	public ArrayList<Alumno> obtenerAlumnos() throws ClassNotFoundException, IOException{
		return modelo.obtenerAlumnos();
	}
	
	public  void addAlumno(ArrayList<Alumno> alumnos) throws ClassNotFoundException, IOException {
		modelo.addAlumno(alumnos);
	}
	
	

}
