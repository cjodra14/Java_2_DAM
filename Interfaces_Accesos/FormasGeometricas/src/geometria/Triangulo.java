package geometria;

public class Triangulo extends FormaGeometrica {
	private double base;
	private double altura;
	

	public Triangulo(String nombre, double base,double altura) {
		super("CUADRADO "+nombre);
		this.base=base;
		this.altura=altura;
	}
	public Triangulo() {
		super("TRIANGULO ANONIMO");
		base=0.0d;
		altura=0.0d;
	}
	
	

	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	protected double calcularArea() {
		return (this.base*this.altura)/2;
	}

	@Override
	protected double calcularPerimetro() {
		return (2*Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2))+base);
	}

}
