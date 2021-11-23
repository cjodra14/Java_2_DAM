package utilidades;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import controlador.ControladorAlumnos;
import modelo.ModeloAlumnos;
import vista.VistaAlumnos;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		
		ModeloAlumnos modelo = new ModeloAlumnos();
		ControladorAlumnos controlador = new ControladorAlumnos(modelo);
		VistaAlumnos vista = new VistaAlumnos(controlador);
		vista.getAccion();	}
	
	public static void mainIni(String[] args) {

		Alumno alumno = new Alumno(23, "Marta", "Sanchez", 34, new Dni(12345678, 'I'));
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(alumno);
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumno.dat"));
			oos.writeObject(alumnos);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
