package geometria;

public class Circulo extends FormaGeometrica {

	private double radio;

	public Circulo() {
		super("CIRCULO ANONIMO");
		this.radio=0.0d;
	}
	public Circulo(String nombre, double radio) {
		super("CIRCULO "+ nombre);
		this.radio=radio;
		
	}
	
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	protected double calcularArea() {
		return Math.PI*(Math.pow(radio, 2));
	}

	@Override
	protected double calcularPerimetro() {		
		return 2*Math.PI*radio;
	}

}
