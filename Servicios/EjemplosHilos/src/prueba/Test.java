package prueba;

public class Test {

	public static void main(String[] args) {
		for (int k = 0; k < 10; k++) {
			EjemploThread ejemploThread = new EjemploThread("Hilo " + k);
			ejemploThread.start();
		}
	}

}
