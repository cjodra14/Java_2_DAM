package ejemplo1.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ejemplo1.alumnos.beans.Alumno;
import ejemplo1.alumnos.beans.Dni;

public class Test {

	public static void mainEscribir(String[] args) throws Exception {
		Alumno alumno = new Alumno(23, "Marta", "Sanchez", 34, new Dni(12345678, 'I'));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumno.dat"));
		oos.writeObject(alumno);
		oos.close();

	}

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumno.dat"));
		// Se lee el primer objeto
		Object alumno = ois.readObject();
		System.out.println(alumno);
		ois.close();
	}

}
