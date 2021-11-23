package filosofos;
 	

public class Cena {
	Tenedor tenedor [];
	int numeroFilosofosTenedores= 5;
	
	Cena(){
		tenedor=new Tenedor[numeroFilosofosTenedores];
		for (int i = 0; i < tenedor.length; i++) {
			tenedor[i]=new Tenedor(i);
		}
	}
	
	public Tenedor getTenedor(int x) {
		return tenedor[x];
	}
	
	public int getTenedorDer(int x) {
		return(x+1)%numeroFilosofosTenedores;
	}
	
	public int getTenedorIzq(int x) {
		return x;
	}
}
