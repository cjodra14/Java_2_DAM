package filosofos;

public class Tenedor {

		int numero;
		boolean enUso;
		
		public Tenedor(int numero) {
			super();
			this.numero = numero;
		}
		
		public synchronized void usar() { //no se puede usar este metodo simultaneamente
			if(enUso) {
				System.out.println("Tenedor "+numero+" est� en uso, espere");
			}else {
				enUso=true;
				System.out.println("Se est� usando el tenedor "+numero);
			}
			}
			
			public synchronized void dejar(){
				enUso=false;
				System.out.println("Tenedor "+numero+"est� disponible");
			}
			
		
		
		
}
