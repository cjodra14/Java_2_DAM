package vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import controlador.ControladorAlumnos;
import utilidades.Alumno;
import utilidades.Dni;

public class VistaAlumnos {
	ControladorAlumnos controladorAlumnos;
	Scanner src = new Scanner(System.in);
	private int opcion;
	
	public VistaAlumnos(ControladorAlumnos controladorAlumnos) {
		this.controladorAlumnos= controladorAlumnos;
	}
	public void getAccion() throws ClassNotFoundException, IOException {
		getMenu();
		getOpcion();
		
		do {
			switch(opcion) {
			case 1:
				obtenerAlumnos();
					break;
			case 2:
				addAlumno();
				break;
			case 3:
				removeAlumno();
					break;
			case 4:
				modifyAlumno();
				break;
			
				default:
				System.out.println("La opcion no es correcta. \n");
					
			}
			if(opcion != 0) {
				getMenu();
				getOpcion();
			}
		}while(opcion != 0) ;
			System.out.println("ADIOS");
			System.out.println("-------");
			//terminarAplicacion();
			System.exit(0);
		}
	
	private void getMenu() {
		
		System.out.println("\n==============================");
		System.out.println("	MENÚ PRINCIPAL	");
		System.out.println("==============================");
		System.out.println("Menu");
		System.out.println("-----");
		System.out.println("1 - Listar");
		System.out.println("2 - Añadir");
		System.out.println("3 - Eliminar");
		System.out.println("4 - Modificar");
		System.out.println("0 - Terminar");
		
}

private void getOpcion() {
		System.out.println("Introduzca una opcion: ");
	try {
		opcion = src.nextInt();
		src.nextLine();
	}catch(InputMismatchException exc) {
		opcion = -1;
	}
}
	public  void obtenerAlumnos() throws ClassNotFoundException, IOException{
		Iterator<Alumno> it = controladorAlumnos.obtenerAlumnos().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void removeAlumno() throws ClassNotFoundException, IOException {
		int id;
		System.out.println("Introduce la id del alumno a eliminar: ");
		id=src.nextInt();		
			controladorAlumnos.removeAlumno(id);		
	}
	public void modifyAlumno() throws ClassNotFoundException, IOException {
		int id;
		String nombre;
		String apellido;
		int edad;
		String dni;
		int numero;
		char letra;
		System.out.println("Introduce la id del alumno a modificar:");
		id=src.nextInt();
		ArrayList<Alumno> alumnos =controladorAlumnos.obtenerAlumnos();
		for (Alumno alumno : alumnos) {
			if (alumno.getId()==id) {
				System.out.println(alumno);
			}
		}
		System.out.println("Introduce el nombre del/la alumno/a:");
		src.nextLine();
		 nombre=src.nextLine();
		 System.out.println("Introduce su apellido:");
		 apellido=src.nextLine();
		 System.out.println("Introduce su edad:");
		 edad=src.nextInt();
		 src.nextLine();
		 System.out.println("Introduce el dni(numeros y letra):");
		 dni=src.nextLine();
		 
		 numero=Integer.parseInt(dni.substring(0,8));
		 letra=dni.charAt(8);
		 
		 Alumno alumno = new Alumno(id, nombre, apellido, edad, new Dni(numero, letra));
		 controladorAlumnos.modifyAlumno(alumno);
		
	}
	
	 public void addAlumno() throws ClassNotFoundException, IOException {
		 	 int id;
			String nombre;
			String apellido;
			int edad;
			String dni;
			int numero;
			char letra;
		 ArrayList<Alumno> alumnosadd = new ArrayList<Alumno>();
		 alumnosadd=controladorAlumnos.obtenerAlumnos();
		 System.out.println("Introduce la id del alumno:");
		 id=src.nextInt();		
		 src.nextLine();
		 System.out.println("Introduce el nombre del/la alumno/a:");
		 nombre=src.nextLine();
		 System.out.println("Introduce su apellido:");
		 apellido=src.nextLine();
		 System.out.println("Introduce su edad:");
		 edad=src.nextInt();
		 src.nextLine();
		 System.out.println("Introduce el dni(numeros y letra):");
		 dni=src.nextLine();
		 
		 numero=Integer.parseInt(dni.substring(0,8));
		 letra=dni.charAt(8);
		 
		 Alumno alumno = new Alumno(id, nombre, apellido, edad, new Dni(numero, letra));
		 
		 System.out.println(alumno);
		 alumnosadd.add(alumno);
		 controladorAlumnos.addAlumno(alumnosadd);
		 
	 }

}
