package geometria;

public class VisorFormasGeometricas {

	public static void visorArea(FormaGeometrica[] formas) {
		for(FormaGeometrica forma: formas) {
			System.out.print("ÁREA" + " \t");
			System.out.print(forma.getNombre()+":"+ " \t");
			System.out.println(forma.calcularArea());
		}
	}
	
	public static void visorPerimetro(FormaGeometrica[] formas) {
		for(FormaGeometrica forma: formas) {
			System.out.print("ÁREA" + " \t");
			System.out.print(forma.getNombre()+":"+ " \t");
			System.out.println(forma.calcularPerimetro());
		}
	}

}
