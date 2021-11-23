package pruebas;

public class Productor extends Thread {
	private Contenedor contenedor; 

	public Productor(Contenedor c) {
		this.contenedor = c;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			contenedor.put(i); 
			System.out.println("Productor. put: " + i);			
		}
	}
}