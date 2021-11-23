package ejercicio;

public class Test {
	final public static int NUM_MAX=10;
	final public static int NUM_CARACTERES_METER=50;
	public static void main(String[] args) {
		
		Tuberia t = new Tuberia();
        Productor p = new Productor( t );
        Consumidor c = new Consumidor( t );

        p.start();
        c.start();

	}

}
