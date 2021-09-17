package geometria;

public class Circulo {
	private Punto centro;
	private int radio;

	//- Constructor con dos parámetros correspondientes al centro y al radio.
	Circulo(Punto centro, int radio){
		this.centro=centro;
		this.radio=radio;
	}

	//- Constructor por defecto: sin parámetros, por defecto inicializa a un círculo de centro origen de coordenadas y radio 10 (es una constante del programa).
	Circulo(){
		final int DIEZ = 10;
		centro.setX(0);
		centro.setY(0);
		radio= DIEZ;
	}

	//- Constructor que tiene como parámetro un círculo y crea un círculo que es una copia de ese círculo.
	Circulo (Circulo circuloCopia){
		centro=circuloCopia.getCentro();
		radio=circuloCopia.getRadio();
	}
	
	//método de instancia que se llama perímetro, que devuelve el perímetro del círculo.
	double perimetroCirculo() {
		double calculoPerimetro=0;
		calculoPerimetro=2*Math.PI*radio;		
		return calculoPerimetro;
	}
	
	//método de instancia que se llama área, que devuelve el área del círculo.
	double areaCirculo() {
		double calculoArea=0;
		calculoArea=Math.PI*(radio*radio);
		return calculoArea;
	}
	
	//método de instancia trasladar, que tiene como parámetro un vector, y que traslada el círculo trasladando el centro.
	void trasladarCentro(Vector vectorTraslado) {
		centro.setX(centro.getX()+vectorTraslado.getOx());
		centro.setY(centro.getY()+vectorTraslado.getOy());
	}
	
	//método de instancia escalar, que tiene como parámetro un número real y cuyo efecto es multiplicar por el radio, escalando el círculo.
	void escalarRadio(int escalado) {
		radio=radio*escalado;
	}
	
	//método que imprime el valor del círculo. Por ejemplo: {(2,4),4}.
	void imprimirCirculo() {
		System.out.println("{"+centro.imprimirPunto()+","+radio+"}");
	}
	
	//Getters y Setters
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

}
