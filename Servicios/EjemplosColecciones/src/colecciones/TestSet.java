package colecciones;

import java.util.Iterator;
import java.util.Set;

import geometria.Punto;

public class TestSet {

	public static void main(String[] args) {
		//
		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(1, 2);
		// Punto punto2 = punto1;
		Punto punto3 = new Punto(5, 6);
		// cargar el set
		Set<Punto> setPuntos = Utilidades.obtenerSetPuntos();
		setPuntos.add(punto1);
		setPuntos.add(punto2);
		setPuntos.add(punto3);
		// recorrer el set
		Iterator<Punto> iterator = setPuntos.iterator();
		// System.out.println(iterator.getClass());
		boolean hayMas = iterator.hasNext();
		while (hayMas) {
			Punto punto = iterator.next();
			System.out.println(punto);
			hayMas = iterator.hasNext();
		}

	}

}
