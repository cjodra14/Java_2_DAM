package Mascota;

public class Mascota {
	String especie;
	String onomatopeya;
	
	public Mascota(String especie, String onomatopeya) {
		super();
		this.especie = especie;
		this.onomatopeya = onomatopeya;
	}
	void presentarse() {
		System.out.println("Hola soy un "+especie+" y hago "+onomatopeya);
	}

}
