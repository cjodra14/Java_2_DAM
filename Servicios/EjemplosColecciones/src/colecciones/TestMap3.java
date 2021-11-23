package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Empleado;
import empresa.Ingeniero;
import empresa.Persona;
import empresa.Tecnico;
import geometria.Punto;

public class TestMap3 {

	public static void main(String[] args) {
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		// cargar el mapa
		Map<Integer, Empleado> mapPersonas2 = new HashMap<Integer, Empleado>();
		mapPersonas2.put(administrativo.getCodEmpleado(), administrativo);
		mapPersonas2.put(tecnico.getCodEmpleado(), tecnico);
		mapPersonas2.put(tecnico.getCodEmpleado(), tecnico);
		mapPersonas2.put(ingeniero.getCodEmpleado(), ingeniero);
		//
		// buscar
		
		Empleado empleadoBuscar = mapPersonas2.get(1);
		System.out.println(empleadoBuscar);
		empleadoBuscar = mapPersonas2.get(3);
		System.out.println(empleadoBuscar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
