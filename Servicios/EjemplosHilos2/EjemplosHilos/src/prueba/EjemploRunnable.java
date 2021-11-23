package prueba;

public class EjemploRunnable implements Runnable {
	private String name;

	public EjemploRunnable(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el hilo " + getName() + " con la iteracion " + i);
		}

	}

}
