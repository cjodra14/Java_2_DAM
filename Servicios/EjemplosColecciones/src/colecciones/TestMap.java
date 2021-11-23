package colecciones;

import java.util.HashMap;
import java.util.Map;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;
import empresa.Tecnico;

public class TestMap {

	public static void main(String[] args) {
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		// cargar el mapa
		// new HashMap<String, Persona>();
		//Map<String, Persona> mapPersonas = Utilidades.obtenerMapPersonasPorDni();
		Map<String, Persona> mapPersonas = new HashMap<String, Persona>();
		
		
		
		mapPersonas.put(administrativo.getDni().toString(), administrativo);
		mapPersonas.put(tecnico.getDni().toString(), tecnico);
		mapPersonas.put(ingeniero.getDni().toString(), ingeniero);
		//

		//
		mapPersonas.put("78878775-E", new Administrativo());
		// Buscar persona
		Persona personaBuscar = mapPersonas.get("12345678-J");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(personaBuscar);
		
		
		
		
		
		
		
		

	}

}
