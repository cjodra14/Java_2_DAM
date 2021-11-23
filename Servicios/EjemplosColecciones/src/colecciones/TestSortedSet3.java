package colecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Empleado;
import empresa.Ingeniero;
import empresa.Tecnico;
import geometria.Punto;

public class TestSortedSet3 {

	public static void main(String[] args) {
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		//System.out.println(administrativo);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		// cargar el set
		SortedSet<Empleado> sortedSetEmpleados = new TreeSet<Empleado>();
		sortedSetEmpleados.add(administrativo);
		sortedSetEmpleados.add(tecnico);
		sortedSetEmpleados.add(ingeniero);
		// recorrer el set
		Iterator<Empleado> iterator = sortedSetEmpleados.iterator();
		boolean hayMas = iterator.hasNext();
		while (hayMas) {
			Empleado empleado = iterator.next();
			System.out.println(empleado);
			hayMas = iterator.hasNext();
		}

	}

}
