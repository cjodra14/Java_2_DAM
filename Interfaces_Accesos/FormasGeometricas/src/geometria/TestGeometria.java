package geometria;

public class TestGeometria {

	public static void main(String[] args) {
		FormaGeometrica f1 = new Cuadrado("Rojo",2.5);
		FormaGeometrica f2 = new Triangulo("Azul",2.0,3.0);
		FormaGeometrica f3 = new Circulo("Verde ",1.5);
		FormaGeometrica f4 = new Circulo("Verde Oscuro",3.0);
		
		FormaGeometrica [] formas = new FormaGeometrica[4];
		formas[0]= f1;
		formas[1]= f2;
		formas[2]= f3;
		formas[3]= f4;
		
		VisorFormasGeometricas.visorArea(formas);
		VisorFormasGeometricas.visorPerimetro(formas);

	}

}
