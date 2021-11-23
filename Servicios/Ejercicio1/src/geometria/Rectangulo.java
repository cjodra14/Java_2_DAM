package geometria;

public class Rectangulo {
	Punto esquinaSuperiorIzquierda, esquinaSuperiorDerecha,esquinaInferiorIzquierda, esquinaInferiorDerecha;
	
	//- Constructor con 4 parámetros correspondientes a los 4 vértices.
	Rectangulo(Punto esSupIzq,Punto esSupDrch, Punto esInfIzq, Punto esInfDrch){		
		esquinaSuperiorIzquierda=esSupIzq;
		esquinaSuperiorDerecha=esSupDrch;
		esquinaInferiorIzquierda=esInfIzq;
		esquinaInferiorDerecha=esInfIzq;
	}
	
	//- Constructor por defecto: sin parámetros, por defecto inicializa a un rectángulo de vértices (0,0), (5,0), (5,5) y (0,5). Son constantes en el programa.
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
	
	//- Constructor que tiene como parámetro un rectángulo y crea un rectángulo que es una copia de ese rectángulo.
	Rectangulo(Rectangulo rectanguloCopiar){
		esquinaSuperiorIzquierda=rectanguloCopiar.getEsquinaSuperiorIzquierda();
		esquinaSuperiorDerecha=rectanguloCopiar.getEsquinaSuperiorDerecha();
		esquinaInferiorIzquierda=rectanguloCopiar.getEsquinaInferiorIzquierda();
		esquinaInferiorDerecha=rectanguloCopiar.getEsquinaInferiorDerecha();
	}
	
	//método de instancia que se llama perímetro, que devuelve el perímetro del rectángulo.
	double perimetroRectangulo() {
		double calculoPerimetro=0;
		calculoPerimetro=2*(esquinaSuperiorDerecha.distancia(esquinaInferiorDerecha)+esquinaSuperiorDerecha.distancia(esquinaSuperiorIzquierda));
		return calculoPerimetro;
	}
	
	//método de instancia que se llama área, que devuelve el área del rectángulo.
	double areaRectangulo(){
		double calculoArea=0;
		calculoArea=(esquinaSuperiorDerecha.distancia(esquinaInferiorDerecha))*esquinaSuperiorDerecha.distancia(esquinaSuperiorIzquierda);
		return calculoArea;
	}
	
	//método de instancia trasladar, que tiene como parámetro un vector, y que traslada el rectángulo trasladando todos los vértices.
	void trasladarRectangulo(Vector vectorTraslado) {
		esquinaInferiorDerecha.trasladar(vectorTraslado);
		esquinaInferiorIzquierda.trasladar(vectorTraslado);
		esquinaSuperiorDerecha.trasladar(vectorTraslado);
		esquinaSuperiorIzquierda.trasladar(vectorTraslado);
	}
	
	//método que imprime el valor del rectángulo. Por ejemplo: {(0,0),(5,0),(5,5),(0,5)}.
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
