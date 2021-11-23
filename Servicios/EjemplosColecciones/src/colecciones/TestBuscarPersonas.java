package colecciones;

import java.util.ArrayList;
import java.util.List;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;
import empresa.Tecnico;

public class TestBuscarPersonas {

	public static void main(String[] args) {
		List<Persona> listaPersonas = crearListaPersonas();
		recorrerListaPersonas(listaPersonas);
		Persona personaBuscar = buscarPersonaPorDni(listaPersonas, "12345678-J");
		System.out.println(personaBuscar);
	}

	public static List<Persona> crearListaPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		//
		Dni dni1 = new Dni(78878775, 'E');
		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		System.out.println(administrativo);
		Dni dni2 = new Dni(12345678, 'J');
		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		Dni dni3 = new Dni(45671234, 'F');
		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		//
		listaPersonas.add(administrativo);
		listaPersonas.add(tecnico);
		listaPersonas.add(ingeniero);
		//
		return listaPersonas;
	}

	public static void recorrerListaPersonas(List<Persona> listaPersonas) {
		for (int i = 0; i < listaPersonas.size(); i++) {
			Persona persona = listaPersonas.get(i);
			System.out.println(persona);
		}
	}

	public static Persona buscarPersonaPorDni(List<Persona> listaPersonas, String dni) {
		Persona persona = null;		
		return persona;
	}

}
