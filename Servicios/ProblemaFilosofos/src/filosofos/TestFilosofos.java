package filosofos;

public class TestFilosofos {
	
	public static void main(String[] args) {
		Cena cena = new Cena();
		for (int i = 0; i < 5; i++) {
			Filosofo filosofo = new Filosofo(i,cena);
			Filosofo.comenzar(filosofo);
		}

	}

}
