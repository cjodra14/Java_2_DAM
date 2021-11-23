package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;

import dao.DAOAlumnos;
import servicioaccesodatos.ServAccDatos;
import utilidades.Alumno;

public class ModeloAlumnos {
	
	
	
	public ArrayList<Alumno> obtenerAlumnos() throws ClassNotFoundException, IOException{
		return DAOAlumnos.obtenerAlumnos();
	}
	
	 public void addAlumno(ArrayList<Alumno> alumnos) throws ClassNotFoundException, IOException {
		 DAOAlumnos.addAlumno(alumnos);
		 
	 }
	 
	 public void removeAlumno(int id) throws ClassNotFoundException, IOException {
		 Alumno alumnoaux=null;
		 ArrayList<Alumno> alumnos=DAOAlumnos.obtenerAlumnos();
		 Iterator<Alumno> it = alumnos.iterator();
			while(it.hasNext()) {
				Alumno alumno=it.next();
				if (alumno.getId()==id) {
					alumnoaux=alumno;
					System.out.println("alumno eliminado");
				}				
			}
			alumnos.remove(alumnoaux);
			DAOAlumnos.addAlumno(alumnos);
	 }
	 
	 public void modifyAlumno(Alumno alumno) throws ClassNotFoundException, IOException {
		 Alumno alumnoaux=null;
		 ArrayList<Alumno> alumnos=DAOAlumnos.obtenerAlumnos();
		 Iterator<Alumno> it = alumnos.iterator();
			while(it.hasNext()) {
				Alumno alumnoiter=it.next();
				if (alumno.getId()==alumnoiter.getId()) {
					alumnoaux=alumnoiter;
					System.out.println("alumno modificado");
				}				
			}
			alumnos.remove(alumnoaux);
			alumnos.add(alumno);
			DAOAlumnos.addAlumno(alumnos);
		 
	 }
}
