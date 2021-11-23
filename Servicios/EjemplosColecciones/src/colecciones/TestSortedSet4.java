package colecciones;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Empleado;
import empresa.Ingeniero;
import empresa.Tecnico;

public class TestSortedSet4 {

	public static void main(String[] args) {
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
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
		System.out.println("-----------------------------------");
		Iterator<Empleado> iterator = sortedSetEmpleados.iterator();
		boolean hayMas = iterator.hasNext();
		while (hayMas) {
			Empleado empleado = iterator.next();
			System.out.println(empleado);
			hayMas = iterator.hasNext();
		}
		// CREAR OTRO SORTED SET POR ORDEN ALFABÉTICO
		SortedSet<Empleado> sortedSetEmpleadosPorOrdenAlfabetico = new TreeSet<Empleado>(
				new ComparadorEmpleadosOrdenAlfabetico());
		sortedSetEmpleadosPorOrdenAlfabetico.add(administrativo);
		sortedSetEmpleadosPorOrdenAlfabetico.add(tecnico);
		sortedSetEmpleadosPorOrdenAlfabetico.add(ingeniero);
		// recorrer el set
		System.out.println("-----------------------------------");
		Iterator<Empleado> iterator2 = sortedSetEmpleadosPorOrdenAlfabetico.iterator();
		boolean hayMas2 = iterator2.hasNext();
		while (hayMas2) {
			Empleado empleado = iterator2.next();
			System.out.println(empleado);
			hayMas2 = iterator2.hasNext();
		}
		System.out.println("-----------------------------------");

	}

}
