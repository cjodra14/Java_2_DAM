package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EjemplosColecciones {
	//Instancia de una lista
	 public static List<Integer> lista_de_enteros = new ArrayList<Integer>();
	 public static Set<Integer> conjunto_de_enteros = new HashSet<Integer>();
	 public static Map<String, String> diccionario = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println("-------------- Ejemplos de velocidad de ejecución de las diferentes Interfaces -----------------------------------");
		hashSetTiempo();
		treeSetTiempo();
		linkedHashSetTiempo();
		System.out.println("\n--------Ejemplos con una lista-------------------");
		addElementosLista();
		lengthLista();
		obtenerValorLista(3);
		comprobarSiEsta(10);
		recorrerLista();
		eliminarNumero(15);
		addSetElements();
		estaEnElSet(3);
		

	}
	
	public static void addSetElements() {
		conjunto_de_enteros.add(new Integer(4));
		conjunto_de_enteros.add(new Integer(5));
		conjunto_de_enteros.add(new Integer(7));
		boolean repe = conjunto_de_enteros.add(new Integer(4));
		// no añade el 4 porque ya está en el conjunto y además devuelve 'false'
	}
	
	public static void estaEnElSet(int numero) {
		System.out.println("el numero "+numero+" esta? "+conjunto_de_enteros.contains(new Integer(numero))); 
	}
	
	public static void hashSetTiempo() {
		final Set hashSet = new HashSet(1_000_000);
	final Long startHashSetTime = System.currentTimeMillis();
	for (int i = 0; i < 1_000_000; i++) {
	    hashSet.add(i);
	}
	final Long endHashSetTime = System.currentTimeMillis();
	System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
	}
	
	public static void treeSetTiempo() {
			final Set treeSet = new TreeSet();
	final Long startTreeSetTime = System.currentTimeMillis();
	for (int i = 0; i < 1_000_000; i++) {
	    treeSet.add(i);
	}
	final Long endTreeSetTime = System.currentTimeMillis();
	System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
	}
	
	public static void linkedHashSetTiempo() {
		final Set linkedHashSet = new LinkedHashSet(1_000_000);
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
		    linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
	}
	 
	public static void addElementosLista() {
		lista_de_enteros.add(new Integer(4));
		lista_de_enteros.add(new Integer(5));
		lista_de_enteros.add(new Integer(7));
		lista_de_enteros.add(2,new Integer(6)); // lo añade en la posición 2, entre el 5 y el 7
	}
	public static void lengthLista() {
		System.out.println(lista_de_enteros.size());
	}
	
	public static void obtenerValorLista(int posicion) {
		if(posicion<lista_de_enteros.size()) {
			System.out.println("El valor en la posicion "+(posicion-1)+" es: "+lista_de_enteros.get(posicion));
		}
	}
	
	public static void comprobarSiEsta(int numero) {
		String comprobacion= lista_de_enteros.contains(new Integer(numero))?"Si está":"No está";
		System.out.println(comprobacion);
	}
	public static void recorrerLista() {
		System.out.println("Recorrer la lista");
		Iterator<Integer> iterador = lista_de_enteros.iterator(); 
		while (iterador.hasNext()) {
		  Integer entero = iterador.next();
		  System.out.println(entero); // imprime un elemento
		}
	}
	public static void eliminarNumero(int numero) {
		System.out.println(numero+" eliminado? "+lista_de_enteros.remove(new Integer(numero)));
	}
	
	

	 
	

}
