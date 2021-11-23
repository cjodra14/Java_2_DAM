package pruebas;

/**
 * @(#)ProductorConsumidorTest.java
 * 
 *                                  Hay ocasiones que distintos hilos en un
 *                                  programa s� necesitan establecer alguna
 *                                  relaci�n entre s�, o compartir objetos. Se
 *                                  necesita entonces alg�n mecanismo que
 *                                  permita sincronizar hilos, as� como,
 *                                  establecer unas 'reglas del juego' para
 *                                  acceder a recursos (objetos) compartidos.
 * 
 *                                  Un ejemplo t�pico en que dos procesos
 *                                  necesitan sincronizarse es el caso en que un
 *                                  hilo produzca alg�n tipo de informaci�n que
 *                                  es procesada por otro hilo.
 * 
 *                                  Al primer hilo le denominaremos productor y
 *                                  al segundo, consumidor.
 * 
 *                                  Los objetos Productor y Consumidor utilizan
 *                                  el recurso compartido Contenedor.
 **/

public class ProductorConsumidorTest {
	public static final int NUM_ITERACIONES = 1000;
	public static void main(String args[]) {
		
		Contenedor contenedor = new Contenedor();
		Productor productor = new Productor(contenedor);
		Thread hiloProductor = new Thread(productor,"productor");
		Consumidor consumidor = new Consumidor(contenedor);
		Thread hiloConsumidor = new Thread(consumidor,"consumidor");

		hiloProductor.start();
		hiloConsumidor.start();
	}
}