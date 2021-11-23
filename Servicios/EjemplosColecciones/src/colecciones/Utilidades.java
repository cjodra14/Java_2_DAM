package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import empresa.Persona;
import geometria.Punto;

public class Utilidades {
	public static Set<Punto> obtenerSetPuntos() {
		return new HashSet<Punto>();
	}
	
	public static List<Punto> obtenerListPuntos() {
		return new ArrayList<Punto>();
	}
	
	public static Map<String, Persona> obtenerMapPersonasPorDni() {
		return new HashMap<String, Persona>();
	}

}
