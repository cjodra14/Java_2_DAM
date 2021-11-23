package geometria;

public class Test2 {

	public static void main(String[] args) {
		Punto punto1 = new Punto(2, 3);
		System.out.println(punto1);
		Punto punto2 = new Punto();
		System.out.println(punto2);
		Punto punto3 = new Punto(punto1);
		System.out.println(punto3);
		double distancia12 = Punto.distancia(punto1, punto2);
		System.out.println("La distancia entre 1 y 2 es: " + distancia12);
		double distancia13 = punto1.distancia(punto3);
		Punto punto4 = new Punto(-2, 3);
		System.out.println(punto4);
		Punto punto5 = new Punto(7, -3);
		System.out.println(punto5);
		Punto punto6 = new Punto(1, -3);
		System.out.println(punto6);
		Punto[] arrayPuntos = new Punto[] { punto1, punto2, punto3, punto4, punto5, punto6 };
		Punto punto7 = new Punto(5, -8);
		System.out.println(punto7);
		Punto puntoMasCercano = punto7.puntoMasCercano(arrayPuntos);
		System.out.println("El punto más cercano a " + punto7 + " es: " + puntoMasCercano + " y su distancia es: "
				+ punto7.distancia(puntoMasCercano));
		Vector vector1 = new Vector(2, 3);
		System.out.println(vector1);
		Vector vector2 = new Vector(punto1,punto2);
		System.out.println(vector2);
		Vector vector3 = new Vector();
		System.out.println(vector3);
		Vector vector4 = new Vector(vector1);
		System.out.println(vector4);
	}

}
