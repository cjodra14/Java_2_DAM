package prueba;

public class Pizarra {

	private String nombre;

	public Pizarra() {
		super();
	}

	public Pizarra(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void pintar(String frase) {
		System.out.println(nombre + ": " + frase);
	}

}
