package geometria;

public class Rectangulo {
	private static final Punto VERTICE_A_DEFECTO = new Punto(0, 0);
	private static final Punto VERTICE_B_DEFECTO = new Punto(5, 0);
	private static final Punto VERTICE_C_DEFECTO = new Punto(5, 5);
	private static final Punto VERTICE_D_DEFECTO = new Punto(0, 5);

	private Punto verticeA;
	private Punto verticeB;
	private Punto verticeC;
	private Punto verticeD;

	public Punto getVerticeA() {
		return verticeA;
	}

	public void setVerticeA(Punto verticeA) {
		this.verticeA = verticeA;
	}

	public Punto getVerticeB() {
		return verticeB;
	}

	public void setVerticeB(Punto verticeB) {
		this.verticeB = verticeB;
	}

	public Punto getVerticeC() {
		return verticeC;
	}

	public void setVerticeC(Punto verticeC) {
		this.verticeC = verticeC;
	}

	public Punto getVerticeD() {
		return verticeD;
	}

	public void setVerticeD(Punto verticeD) {
		this.verticeD = verticeD;
	}

	public Rectangulo(Punto verticeA, Punto verticeB, Punto verticeC, Punto verticeD) {
		super();
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
		this.verticeD = verticeD;
	}

	public Rectangulo() {
		this(VERTICE_A_DEFECTO, VERTICE_B_DEFECTO, VERTICE_C_DEFECTO, VERTICE_D_DEFECTO);
	}

	public Rectangulo(Rectangulo rectangulo) {
		this(rectangulo.verticeA, rectangulo.verticeB, rectangulo.verticeC, rectangulo.verticeD);
	}

	public double perimetro() {
		double altura = Punto.distancia(verticeA, verticeB);
		double anchura = Punto.distancia(verticeB, verticeC);
		double perimetro = anchura * 2 + altura * 2;
		return perimetro;
	}

	public double area() {
		double altura = Punto.distancia(verticeA, verticeB);
		double anchura = Punto.distancia(verticeB, verticeC);
		double area = altura * anchura;
		return area;
	}

	public void trasladar(Vector vector) {
		this.verticeA.trasladar(vector);
		this.verticeB.trasladar(vector);
		this.verticeC.trasladar(vector);
		this.verticeC.trasladar(vector);
	}

	@Override
	public String toString() {
		return "{" + verticeA + "," + verticeB + "," + verticeC + "," + verticeD + "}";
	}
}
