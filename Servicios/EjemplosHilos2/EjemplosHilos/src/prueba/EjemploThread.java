package prueba;

public class EjemploThread extends Thread {

	public EjemploThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el hilo " + getName() + " con la iteracion " + i);
		}
	}

}
