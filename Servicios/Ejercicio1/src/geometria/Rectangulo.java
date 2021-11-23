package geometria;

public class Rectangulo {
	Punto esquinaSuperiorIzquierda, esquinaSuperiorDerecha,esquinaInferiorIzquierda, esquinaInferiorDerecha;
	
	//- Constructor con 4 par�metros correspondientes a los 4 v�rtices.
	Rectangulo(Punto esSupIzq,Punto esSupDrch, Punto esInfIzq, Punto esInfDrch){		
		esquinaSuperiorIzquierda=esSupIzq;
		esquinaSuperiorDerecha=esSupDrch;
		esquinaInferiorIzquierda=esInfIzq;
		esquinaInferiorDerecha=esInfIzq;
	}
	
	//- Constructor por defecto: sin par�metros, por defecto inicializa a un rect�ngulo de v�rtices (0,0), (5,0), (5,5) y (0,5). Son constantes en el programa.
	public Rectangulo() {
		final Punto P1=new Punto(0,5);
		final Punto P2=new Punto(5,5);
		final Punto P3=new Punto(0,0);
		final Punto P4=new Punto(5,0);
		esquinaSuperiorIzquierda=P1;
		esquinaSuperiorDerecha=P2;
		esquinaInferiorIzquierda=P3;
		esquinaInferiorDerecha=P4;
	}
	
	//- Constructor que tiene como par�metro un rect�ngulo y crea un rect�ngulo que es una copia de ese rect�ngulo.
	Rectangulo(Rectangulo rectanguloCopiar){
		esquinaSuperiorIzquierda=rectanguloCopiar.getEsquinaSuperiorIzquierda();
		esquinaSuperiorDerecha=rectanguloCopiar.getEsquinaSuperiorDerecha();
		esquinaInferiorIzquierda=rectanguloCopiar.getEsquinaInferiorIzquierda();
		esquinaInferiorDerecha=rectanguloCopiar.getEsquinaInferiorDerecha();
	}
	
	//m�todo de instancia que se llama per�metro, que devuelve el per�metro del rect�ngulo.
	double perimetroRectangulo() {
		double calculoPerimetro=0;
		calculoPerimetro=2*(esquinaSuperiorDerecha.distancia(esquinaInferiorDerecha)+esquinaSuperiorDerecha.distancia(esquinaSuperiorIzquierda));
		return calculoPerimetro;
	}
	
	//m�todo de instancia que se llama �rea, que devuelve el �rea del rect�ngulo.
	double areaRectangulo(){
		double calculoArea=0;
		calculoArea=(esquinaSuperiorDerecha.distancia(esquinaInferiorDerecha))*esquinaSuperiorDerecha.distancia(esquinaSuperiorIzquierda);
		return calculoArea;
	}
	
	//m�todo de instancia trasladar, que tiene como par�metro un vector, y que traslada el rect�ngulo trasladando todos los v�rtices.
	void trasladarRectangulo(Vector vectorTraslado) {
		esquinaInferiorDerecha.trasladar(vectorTraslado);
		esquinaInferiorIzquierda.trasladar(vectorTraslado);
		esquinaSuperiorDerecha.trasladar(vectorTraslado);
		esquinaSuperiorIzquierda.trasladar(vectorTraslado);
	}
	
	//m�todo que imprime el valor del rect�ngulo. Por ejemplo: {(0,0),(5,0),(5,5),(0,5)}.
	void imprimirRectangulo() {
		
		System.out.println("{"+esquinaInferiorIzquierda.imprimirPunto()+","+esquinaInferiorDerecha.imprimirPunto()+","+esquinaSuperiorIzquierda.imprimirPunto()+","+esquinaSuperiorDerecha.imprimirPunto()+"}");
	}
	
	//Getters y Setters
	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}
	public void setEsquinaSuperiorIzquierda(Punto esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}
	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}
	public void setEsquinaSuperiorDerecha(Punto esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}
	public Punto getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}
	public void setEsquinaInferiorIzquierda(Punto esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}
	public Punto getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}
	public void setEsquinaInferiorDerecha(Punto esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}
	

}
