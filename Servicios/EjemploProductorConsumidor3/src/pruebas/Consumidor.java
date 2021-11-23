package pruebas;

/**
 * @(#)Consumidor.java
 * 
 *                     El consumidor no se preocupa si el dato ya est�
 *                     disponible en el contenedor o no.
 **/

public class Consumidor implements Runnable {
	private Contenedor contenedor;

	public Consumidor(Contenedor c) {
		this.contenedor = c;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < ProductorConsumidorTest.NUM_ITERACIONES; i++) {
			value = contenedor.get(); // Recupera el dato para mostrarlo en consola.
			// System.out.println("Consumidor. get: " + value);+

		}
	}
}