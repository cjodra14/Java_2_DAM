package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;
import empresa.Tecnico;
import geometria.Punto;

public class TestMap2 {

	public static void main(String[] args) {
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		// cargar el mapa
		Map<Dni, Persona> mapPersonas2 = new HashMap<Dni, Persona>();
		mapPersonas2.put(dni1, administrativo);
		mapPersonas2.put(dni2, tecnico);
		mapPersonas2.put(new Dni(12345678, 'J'), new Tecnico("pablo", "gorrochategui", 34, dni2, 750));
		mapPersonas2.put(dni3, ingeniero);
		//
		Dni dni4 = new Dni(78878775, 'E');
		mapPersonas2.put(dni4, administrativo);
		//
		// buscar
		Dni dniPersonaBuscar = new Dni(78878775, 'E');
		System.out.println(dniPersonaBuscar.hashCode());
		Persona personaBuscar = mapPersonas2.get(dniPersonaBuscar);
		System.out.println(personaBuscar);
		// recorrer
		Set<Dni> setClaves = mapPersonas2.keySet();
		Iterator<Dni> iteratorClaves = setClaves.iterator();
		boolean hayMas = iteratorClaves.hasNext();
		Dni dni = null;
		Persona persona = null;
		while (hayMas) {
			dni = iteratorClaves.next();
			persona = mapPersonas2.get(dni);
			System.out.println(persona);
			hayMas = iteratorClaves.hasNext();
		}
		setClaves.remove(new Dni(12345678, 'J'));
		//
		Collection<Persona> colleccionPersonas = mapPersonas2.values();
		Iterator<Persona> iteratorPersonas = colleccionPersonas.iterator();
		hayMas = iteratorPersonas.hasNext();
		persona = null;
		while (hayMas) {
			persona = iteratorPersonas.next();
			System.out.println(persona);
			hayMas = iteratorPersonas.hasNext();
		}

	}

}
