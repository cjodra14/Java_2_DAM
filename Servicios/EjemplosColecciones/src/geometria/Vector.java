package geometria;

public class Vector {
	private static final int A_DEFECTO = 0;
	private static final int B_DEFECTO = 0;

	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Vector(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Vector(Punto punto1, Punto punto2) {
		this(punto2.getX() - punto1.getX(), punto2.getY() - punto1.getY());
	}

	public Vector() {
		this(A_DEFECTO, B_DEFECTO);
	}

	public Vector(Vector vector) {
		this(vector.a, vector.b);
	}

	public String toString() {
		String vectorCadena = "[" + Double.toString(this.a) + "," + Double.toString(this.b) + "]";
		return vectorCadena;
	}

}
