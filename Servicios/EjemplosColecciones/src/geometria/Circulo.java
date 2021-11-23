package geometria;

public class Circulo {

	private static final double RADIO_DEFECTO = 10;
	private static final Punto CENTRO_DEFECTO = new Punto();

	private double radio;
	private Punto centro;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public Circulo(Punto centro, double radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo() {
		this(CENTRO_DEFECTO, RADIO_DEFECTO);
	}

	public Circulo(Circulo circulo) {
		this(circulo.getCentro(), circulo.getRadio());
	}

	public double perimetro() {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

	public double area() {
		double area = Math.PI * radio * radio;
		return area;
	}

	public void escalar(double escalar) {
		radio = escalar * radio;
	}

	public void trasladar(Vector vector) {
		this.centro.trasladar(vector);
	}

	@Override
	public String toString() {
		return "{" + centro + "," + radio + "}";
	}
}
