package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import geometria.Punto;

public class TestList {

	public static void main(String[] args) {
		//
		Punto punto1 = new Punto(1, 2);
		Punto punto2 = new Punto(1, 2);
		Punto punto3 = new Punto(5, 6);
		// cargar la lista
		// List<Punto> listaPuntos = Utilidades.obtenerListPuntos();
		List<Punto> listaPuntos = new ArrayList<Punto>();
		listaPuntos.add(punto1);
		listaPuntos.add(punto2);
		listaPuntos.add(punto3);
		// recorrer la lista
		for (int i = 0; i < listaPuntos.size(); i++) {
			Punto punto = listaPuntos.get(i);
			System.out.println(punto);
		}
		// obsoleto
		Vector<Punto> vectorPuntos = new Vector<Punto>();
		vectorPuntos.add(punto1);

	}

}
