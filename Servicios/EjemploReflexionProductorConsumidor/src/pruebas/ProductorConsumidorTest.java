package pruebas;


public class ProductorConsumidorTest {
	public static void main(String args[]) {
		Contenedor c = new Contenedor();
		Productor prod = new Productor(c);
		Consumidor cons = new Consumidor(c);

		prod.start();
		cons.start();
	}
}