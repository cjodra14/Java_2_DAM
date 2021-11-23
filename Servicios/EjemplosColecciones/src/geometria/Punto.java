package geometria;

public class Punto implements Comparable<Punto> {
	private static final int X_DEFECTO = 0;
	private static final int Y_DEFECTO = 0;

	// Variables (coordenadas del punto)
	private double x;
	private double y;

	// Constructor por parámetros dados
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Constructor por defecto, coordenadas en el origen
	public Punto() {
		this(X_DEFECTO, Y_DEFECTO);
	}

	// Constructor que copia un punto dado
	public Punto(Punto otroPunto) {
		this(otroPunto.x, otroPunto.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Método distancia 1
	public double distancia(Punto punto) {
		return distancia(punto.x, punto.y);
	}

	// Método distancia 2
	public double distancia(double x, double y) {
		double distancia = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		return distancia;
	}

	// Distancia entre dos puntos
	public static double distancia(Punto p, Punto q) {
		double distancia = p.distancia(q);
		return distancia;
	}

	// Punto más cercano desde un array de puntos
	public Punto puntoMasCercano(Punto[] arrayPuntos) {
		Punto puntoMasCercano = null;
		if (arrayPuntos != null) {
			double distanciaMinima = Double.MAX_VALUE;
			double distancia = 0;
			Punto punto = null;
			for (int i = 0; i < arrayPuntos.length; i++) {
				punto = arrayPuntos[i];
				distancia = distancia(punto);
				if (distancia < distanciaMinima) {
					distanciaMinima = distancia;
					puntoMasCercano = punto;
				}
			}
		}
		return puntoMasCercano;
	}

	// Formato de impresión del punto
	public String toString() {
		String puntoCadena = "(" + Double.toString(this.x) + "," + Double.toString(this.y) + ")";
		return puntoCadena;
	}

	// Traslación a través de un vector dado
	public void trasladar(Vector vector) {
		this.x = this.x + vector.getA();
		this.y = this.y + vector.getB();
	}

	

	@Override
	public int compareTo(Punto punto) {
		int comparacionX = (new Double(this.getX())).compareTo(punto.getX());
		if (comparacionX == 0) {
			int comparacionY = (new Double(this.getY())).compareTo(punto.getY());
			return comparacionY;
		} else {
			return comparacionX;
		}
	}

	
	

}
