package empresa;

public class Dni {
	int numero;
	char letra;
	
	
	public Dni(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}

	public String toString(){
		return Integer.toString(numero)+letra;
		
	}

}
