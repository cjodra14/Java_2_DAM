package pruebas;

/**
 * @(#)Productor.java
 * 
 *                    El productor no se preocupa si el dato ya ha sido
 *                    consumido o no. Simplemente lo coloca en el contenedor.
 **/

public class Productor implements Runnable {
	private Contenedor contenedor; // Almacena los datos que se van produciendo.

	public Productor(Contenedor c) {
		this.contenedor = c;
		// setPriority(MAX_PRIORITY);
	}

	public void run() {
		for (int i = 0; i < ProductorConsumidorTest.NUM_ITERACIONES; i++) {
			contenedor.put(i); // Se almacena el dato en el contenedor.
			// System.out.println("Productor. put: " + i);

		}
	}
}