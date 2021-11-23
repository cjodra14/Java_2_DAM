package geometria;

public class Test {

	public static void main (String[]args) {
		    //1. Crear el punto p1(8,5).
			Punto p1 = new Punto(8,5);
			
			//2. Crear el punto p2 origen de coordenadas.
			Punto p2 = new Punto();

			//3. Crear un punto p3 como copia de p1.
			Punto p3 = new Punto(p1);			

			//8. Crear un array de 4 puntos: (4,5), (-2,7), (-12,12) y (2,1). Calcular el punto más cercano a p1. Imprimir el resultado.
			Punto arrayPuntos[]=new Punto[4];
			
			//9. Crear un vector a partir de p2 y p3. Trasladar el punto p1 con dicho vector. Imprimir el resultado.
			Vector v1=new Vector(p2,p3);
			Vector v2= new Vector(9,2);
			//20. Crear un vector [3,-2]. Trasladar el rectángulo r1 con dicho vector. Imprimir el resultado.
			Vector v3= new Vector(3,-2);
			
			//10. Crear un círculo c1 con centro p1 y radio 4. Imprimir el resultado de c1.
			Circulo c1 = new Circulo(p1,4);
			//12. Crear un círculo c2 como copia de c1. Imprimir el resultado de c2.
			Circulo c2 = new Circulo(c1);
			
			//18. Crear un rectángulo r1 por defecto. Imprimir el resultado.
			Rectangulo r1= new Rectangulo();
			
			//4. Imprimir valores de p1, p2 y p3.
			p1.imprimirPunto();
			p2.imprimirPunto();
			p3.imprimirPunto();
			
			//5. Cambiar el valor de la x de p1 a 10.
			p1.setX(10);
			System.out.println(p1.distancia(p2));
			

			//8. Crear un array de 4 puntos: (4,5), (-2,7), (-12,12) y (2,1). Calcular el punto más cercano a p1. Imprimir el resultado.
			arrayPuntos[0]=new Punto(4,5);
			arrayPuntos[1]= new Punto(-2,7);
			arrayPuntos[2]= new Punto(-12,12);
			arrayPuntos[3]= new Punto( 2,1);			
			System.out.println("punto mas cercano a "+p1.imprimirPunto()+": "+p1.puntoMasCercano(arrayPuntos).imprimirPunto());
			
			
			//9. Crear un vector a partir de p2 y p3. Trasladar el punto p1 con dicho vector. Imprimir el resultado.
			p1.trasladar(v1);
			p1.imprimirPunto();
			
			//10. Crear un círculo c1 con centro p1 y radio 4. Imprimir el resultado de c1.
			c1.imprimirCirculo();
			
			//11. Cambiar el valor de la x de p1 a 8. Imprimir el resultado de c1.
			p1.setX(8);
			c1.imprimirCirculo();
			

			//12. Crear un círculo c2 como copia de c1. Imprimir el resultado de c2.
			c2.imprimirCirculo();
			
			//13. Cambiar el centro de c1 a (6,4). Imprimir el resultado de c1 y c2.
			c1.trasladarCentro(new Vector(-2,-1));
			c1.imprimirCirculo();
			c2.imprimirCirculo();
			
			//14. Cambiar la x del centro de c1 a 9. Imprimir el resultado de c1 y c2.
			c1.trasladarCentro(new Vector(3,0));
			c1.imprimirCirculo();
			c2.imprimirCirculo();
			
			//15. Imprimir perímetro y área de c1.
			System.out.println("Perimetro de C1: "+c1.perimetroCirculo()+" Area de C1: "+c1.areaCirculo());
			

			//16. Crear un vector [9,2]. Trasladar el círculo c2 con dicho vector. Imprimir el resultado.
			c2.trasladarCentro(v2);
			c2.imprimirCirculo();
			
			//17. Escalar el círculo c2 con un valor 4. Imprimir el resultado.
			c2.escalarRadio(4);
			c2.imprimirCirculo();
			
			//18. Crear un rectángulo r1 por defecto. Imprimir el resultado.
			r1.imprimirRectangulo();
			
			//19. Imprimir perímetro y área de r1.
			System.out.println("Perimetro de R1: "+ r1.perimetroRectangulo()+ " Area de R1: "+r1.areaRectangulo());
			
			//20. Crear un vector [3,-2]. Trasladar el rectángulo r1 con dicho vector. Imprimir el resultado.
			r1.trasladarRectangulo(v3);
			r1.imprimirRectangulo();
	}
}
