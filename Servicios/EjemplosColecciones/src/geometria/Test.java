package geometria;

public class Test {

	public static void main(String[] args) {

		// PUNTOS
		// 1
		Punto p1 = new Punto(8, 5);
		// 2
		Punto p2 = new Punto(0, 0);
		// 3
		//Punto p3 = p1;
		Punto p3 = new Punto(p1);
		// 4
		System.out.println("---------------------------------\n Imprimir valores p1, p2, p3 \n");
		System.out.println("p1 : ");
		System.out.println(p1);
		System.out.println("p2 : ");
		System.out.println(p2);
		System.out.println("p3 : ");
		System.out.println(p3);
		// 5
		p1.setX(10);
		// 6
		System.out.println("---------------------------------\n Imprimir valores p1, p2, p3 cambiado \n");
		System.out.println("p1 : ");
		System.out.println(p1);
		System.out.println("p2 : ");
		System.out.println(p2);
		System.out.println("p3 : ");
		System.out.println(p3);
		// 7
		System.out.println("---------------------------------\n Ejercicio 7\n------------------------------\"");
		System.out.println("Distancia entre p1 y p2 es : " + Punto.distancia(p1, p2) + "\n");
		// 8
		Punto p11 = new Punto(4, 5);
		Punto p12 = new Punto(-2, 7);
		Punto p13 = new Punto(-12, 12);
		Punto p14 = new Punto(2, 1);
		Punto[] nuevoArray = new Punto[] { p11, p12, p13, p14 };
		Punto masCercano = p1.puntoMasCercano(nuevoArray);
		System.out.println("---------------------------------\n Ejercicio 8\n------------------------------\"");
		System.out.println("El punto más cercano a p1 es : " + masCercano + "\n");
		// 9
		System.out.println("---------------------------------\n Ejercicio 9\n------------------------------\"");
		Vector vector1 = new Vector(p2, p3);
		p1.trasladar(vector1);
		System.out.println(p1);
		// 10
		System.out.println("---------------------------------\n Ejercicio 10\n------------------------------\"");
		Circulo c1 = new Circulo(p1, 4);
		System.out.println(c1);
		// 11
		System.out.println("---------------------------------\n Ejercicio 11\n------------------------------\"");
		p1.setX(8);
		System.out.println(p1);
		//
		System.out.println(c1);
		// 12
		System.out.println("---------------------------------\n Ejercicio 12\n------------------------------\"");
		Circulo c2 = new Circulo(c1);
		System.out.println(c2);
		//
		c2.setRadio(18);
		c2.getCentro().setX(122);
		c2.setCentro(p14);
		// 13
		System.out.println("---------------------------------\n Ejercicio 13\n------------------------------\"");
		Punto centroC2 = new Punto();
		c2.setCentro(centroC2);
		System.out.println("\n c1");
		System.out.println(c1);
		System.out.println("\n c2");
		System.out.println(c2);
		// 14
		System.out.println("---------------------------------\n Ejercicio 14\n------------------------------\"");
		Punto centroC1 = new Punto();
		centroC1.setX(9);
		c1.setCentro(centroC1);
		System.out.println("\n c1");
		System.out.println(c1);
		System.out.println("\n c2");
		System.out.println(c2);
		// 15
		System.out.println("---------------------------------\n Ejercicio 15\n------------------------------\"");
		double periC1 = c1.perimetro();
		System.out.println("El perimetro de c1 es " + periC1);
		double areaC1 = c1.area();
		System.out.println("El área de c1 es " + areaC1);
		// 16
		System.out.println("---------------------------------\n Ejercicio 16\n------------------------------\"");
		Vector vector16 = new Vector(9, 2);
		c2.trasladar(vector16);
		System.out.println(c2);
		// 17
		System.out.println("---------------------------------\n Ejercicio 17\n------------------------------\"");
		c2.escalar(4);
		System.out.println(c2);
		// 18
		System.out.println("---------------------------------\n Ejercicio 18\n------------------------------");
		Rectangulo r1 = new Rectangulo();
		System.out.println(r1);
		// 19
		System.out.println("---------------------------------\n Ejercicio 19\n------------------------------");
		double areaR1 = r1.area();
		double periR1 = r1.perimetro();
		System.out.println("El area de r1 es : " + areaR1);
		System.out.println("El perimetro de r1 es : " + periR1);
		// 20
		System.out.println("---------------------------------\n Ejercicio 20 \n------------------------------");
		Vector vector20 = new Vector(3, -2);
		r1.trasladar(vector20);
		System.out.println(r1);
	}

}
