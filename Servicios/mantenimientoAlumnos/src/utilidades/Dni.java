package utilidades;

import java.io.Serializable;

public class Dni implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	private int numero;
	private char letra;

	public Dni(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}

	@Override
	public String toString() {
		// return Integer.toString(numero) + "-" + Character.toString(letra);
		return numero + "-" + letra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + letra;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni other = (Dni) obj;
		if (letra != other.letra)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}
