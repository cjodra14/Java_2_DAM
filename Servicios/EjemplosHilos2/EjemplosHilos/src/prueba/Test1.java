package prueba;

public class Test1 {

	public static void main(String[] args) throws Exception {
		for (int k = 0; k < 10; k++) {
			EjemploThread ejemploThread = new EjemploThread("Hilo " + k);
			// ejemploThread.setPriority(k + 1);
			ejemploThread.start();
			// Thread.sleep(1000);
		}
	}

}
