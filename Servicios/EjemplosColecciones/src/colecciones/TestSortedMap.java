package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;
import empresa.Tecnico;

public class TestSortedMap {
	public static void main(String[] args) {
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		// cargar el mapa
		SortedMap<Dni, Persona> sortedMapPersonas = new TreeMap<Dni, Persona>();
		sortedMapPersonas.put(dni1, administrativo);
		sortedMapPersonas.put(dni2, tecnico);
		sortedMapPersonas.put(dni3, ingeniero);
		// recorrer
		Set<Dni> setClaves = sortedMapPersonas.keySet();
		Iterator<Dni> iteratorClaves = setClaves.iterator();
		boolean hayMas = iteratorClaves.hasNext();
		Dni dni = null;
		Persona persona = null;
		while (hayMas) {
			dni = iteratorClaves.next();
			persona = sortedMapPersonas.get(dni);
			System.out.println(persona);
			hayMas = iteratorClaves.hasNext();
		}

	}

}
