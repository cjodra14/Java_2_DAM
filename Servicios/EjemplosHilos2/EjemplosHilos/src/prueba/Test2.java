package prueba;

public class Test2 {

	public static void main(String[] args) throws Exception {
		for (int k = 0; k < 10; k++) {
			EjemploRunnable ejemploRunnable = new EjemploRunnable("Hilo " + k);
			Thread ejemploThread = new Thread(ejemploRunnable);
			// ejemploThread.setPriority(k + 1);
			ejemploThread.start();
			// Thread.sleep(1000);
		}
	}

}
