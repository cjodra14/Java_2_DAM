package filosofos;

import java.util.Random;

public class Filosofo implements Runnable{
	protected Cena cena;
	protected int tizq,tder;
	protected int numero;
	
	public Filosofo( int numero,Cena cena) {
		
		this.cena = cena;
		this.numero = numero;
		tizq= cena.getTenedorIzq(numero);
		tder= cena.getTenedorDer(numero);
		
		
	}
	public void pensar(){
		try{
		System.out.println ("Filosofo "+numero+" pensando");
		Random random = new Random();
		int espera = (random.nextInt(4)+1)*1000;
		Thread.sleep(espera);
		System.out.println ("Filosofo "+numero+" tiene hambre");
		}catch(InterruptedException e){
		e.printStackTrace();
		}
		}

		public void tomarTenedores(){
		System.out.println ("Tomando tenedores");
		Tenedor t1= cena.getTenedor(tizq);
		Tenedor t2= cena.getTenedor(tder);
		t1.usar();
		t2.usar();
		}

		public void comer(){
		try{
		System.out.println("Filosofo "+numero+" esta comiendo");
		int espera= (int)(Math.random()*200);
		Thread.sleep(espera);
		System.out.println("Filosofo "+numero+" esta satisfecho");
		}catch(InterruptedException e){
		e.printStackTrace();
		}
		}

		protected void dejarTenedores(){
		System.out.println("Soltando los tenedores.");
		Tenedor t1= cena.getTenedor(tizq);
		Tenedor t2= cena.getTenedor(tder);
		t1.dejar();
		t2.dejar();
		}

	@Override
	public void run() {
		while(true) {
			pensar();
			tomarTenedores();
			comer();
			dejarTenedores();
		}
		
	}
	
	public static void comenzar(Filosofo filosofo) {
		Thread hilo= new Thread(filosofo);
		hilo.start();	
	}
	
	
	
}
