package geometria;

public class Vector {
	private int ox;
	private int oy;
	
	//- Constructor con dos parámetros correspondientes a las componentes a y b.
	Vector (int ox,int oy ){
		this.ox=ox;
		this.oy=oy;
	}

	//- Constructor con dos parámetros correspondientes a dos puntos.
	Vector(Punto p1, Punto p2){
		ox=p2.getX()-p1.getX();
		oy=p2.getY()-p2.getY();
	}

	//- Constructor por defecto: sin parámetros, por defecto inicializa al vector nulo.
	Vector(){
		ox=0;
		oy=0;
	}

	//- Constructor que tiene como parámetro un vector y crea un vector que es una copia de ese vector.
	Vector(Vector vectorCopiar){
		this.ox=vectorCopiar.getOx();
		this.oy=vectorCopiar.getOy();
	}
	
	//método que imprime el valor del vector. Por ejemplo: [14,2].
	void imprimirVector() {
		System.out.println("["+ox+","+oy+"]");
	}
	
	//Getters y Setters
	public int getOx() {
		return ox;
	}
	public void setOx(int ox) {
		this.ox = ox;
	}
	public int getOy() {
		return oy;
	}
	public void setOy(int oy) {
		this.oy = oy;
	}
	
	

}
