package geometria;

public class Cuadrado extends FormaGeometrica{
	
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super("CUADRADO "+nombre);
		this.lado=lado;
	}
	public Cuadrado() {
		super("CUADRADO ANONIMO");
		this.lado=0.0d;
	}

	public double getLado() {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	protected double calcularArea() {
		
		return lado*lado;
	}

	@Override
	protected double calcularPerimetro() {
		return 4*this.lado;
	}

	
}
