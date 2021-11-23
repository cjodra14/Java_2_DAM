package dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;

import utilidades.Alumno;

public class DAOAlumnos {
	
	
	
	
	
	public static ArrayList<Alumno> obtenerAlumnos() throws ClassNotFoundException, IOException{
		 ArrayList<Alumno> alumnos = null;
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumno.dat"));
		try {		
			alumnos= (ArrayList<Alumno>)ois.readObject();
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		}
		
		
		
		return alumnos;
		
	}
	
	public static void addAlumno(ArrayList<Alumno> alumnos) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumno.dat"));
		oos.writeObject(alumnos);
		
	}
	

}
