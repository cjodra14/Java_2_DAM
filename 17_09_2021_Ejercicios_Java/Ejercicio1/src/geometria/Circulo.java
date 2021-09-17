package geometria;

public class Circulo {
	private Punto centro;
	private int radio;

	//- Constructor con dos par�metros correspondientes al centro y al radio.
	Circulo(Punto centro, int radio){
		this.centro=centro;
		this.radio=radio;
	}

	//- Constructor por defecto: sin par�metros, por defecto inicializa a un c�rculo de centro origen de coordenadas y radio 10 (es una constante del programa).
	Circulo(){
		final int DIEZ = 10;
		centro.setX(0);
		centro.setY(0);
		radio= DIEZ;
	}

	//- Constructor que tiene como par�metro un c�rculo y crea un c�rculo que es una copia de ese c�rculo.
	Circulo (Circulo circuloCopia){
		centro=circuloCopia.getCentro();
		radio=circuloCopia.getRadio();
	}
	
	//m�todo de instancia que se llama per�metro, que devuelve el per�metro del c�rculo.
	double perimetroCirculo() {
		double calculoPerimetro=0;
		calculoPerimetro=2*Math.PI*radio;		
		return calculoPerimetro;
	}
	
	//m�todo de instancia que se llama �rea, que devuelve el �rea del c�rculo.
	double areaCirculo() {
		double calculoArea=0;
		calculoArea=Math.PI*(radio*radio);
		return calculoArea;
	}
	
	//m�todo de instancia trasladar, que tiene como par�metro un vector, y que traslada el c�rculo trasladando el centro.
	void trasladarCentro(Vector vectorTraslado) {
		centro.setX(centro.getX()+vectorTraslado.getOx());
		centro.setY(centro.getY()+vectorTraslado.getOy());
	}
	
	//m�todo de instancia escalar, que tiene como par�metro un n�mero real y cuyo efecto es multiplicar por el radio, escalando el c�rculo.
	void escalarRadio(int escalado) {
		radio=radio*escalado;
	}
	
	//m�todo que imprime el valor del c�rculo. Por ejemplo: {(2,4),4}.
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
