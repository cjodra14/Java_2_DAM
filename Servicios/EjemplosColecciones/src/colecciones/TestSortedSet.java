package colecciones;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import geometria.Punto;

public class TestSortedSet {

	public static void main(String[] args) {
		// cargar
		SortedSet<Integer> sortedSetNumeros = new TreeSet<Integer>();
		sortedSetNumeros.add(2);
		sortedSetNumeros.add(-7);
		sortedSetNumeros.add(12);
		sortedSetNumeros.add(4);
		// recorrer
		Iterator<Integer> iterator = sortedSetNumeros.iterator();
		boolean hayMas = iterator.hasNext();
		while (hayMas) {
			Integer entero = iterator.next();
			System.out.println(entero);
			hayMas = iterator.hasNext();
		}

	}

}
