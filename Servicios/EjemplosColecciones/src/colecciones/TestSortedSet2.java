package colecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import geometria.Punto;

public class TestSortedSet2 {

	public static void main(String[] args) {
		//
		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(1, 2);
		Punto punto3 = new Punto(5, 6);
		Punto punto4 = new Punto(-5, 6);
		Punto punto5 = new Punto(-15, -166);
		Punto punto6 = new Punto(3, -6);
		Punto punto7 = new Punto(25, 6);
		Punto punto8 = new Punto(4, -3);
		// cargar el set
		SortedSet<Punto> sortedSetPuntos = new TreeSet<Punto>();
		sortedSetPuntos.add(punto1);
		sortedSetPuntos.add(punto2);
		sortedSetPuntos.add(punto3);
		sortedSetPuntos.add(punto4);
		sortedSetPuntos.add(punto5);
		sortedSetPuntos.add(punto6);
		sortedSetPuntos.add(punto7);
		sortedSetPuntos.add(punto8);
		// recorrer el set
		Iterator<Punto> iterator = sortedSetPuntos.iterator();
		boolean hayMas = iterator.hasNext();
		while (hayMas) {
			Punto punto = iterator.next();
			System.out.println(punto);
			hayMas = iterator.hasNext();
		}

	}

}
