package prueba;

public class Sumador {
	/**
	 * Suma todos los valores incluidos entre dos valores
	 * 
	 * @param n1 Limite 1
	 * @param n2 Limite 2
	 * @return La suma de dichos valores
	 */
	public static long sumar(long n1, long n2) {
		long suma = 0;
		if (n1 > n2) {
			long aux = n1;
			n1 = n2;
			n2 = aux;
		}
		for (long i = n1; i <= n2; i++) {
			suma = suma + i;
		}
		return suma;
	}

	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long n1 = Long.parseLong(args[0]);
		long n2 = Long.parseLong(args[1]);
		long suma = sumar(n1, n2);
		System.out.println(suma);
		System.out.flush();
	}
}
