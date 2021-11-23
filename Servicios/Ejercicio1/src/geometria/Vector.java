package geometria;

public class Vector {
	public static final double OX_DEFECTO=0;
	public static final double OY_DEFECTO=0;
	private double ox;
	private double oy;
	
	//- Constructor con dos parámetros correspondientes a las componentes a y b.
	Vector (double ox,double oy ){
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
		this(OX_DEFECTO,OY_DEFECTO);
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
	public double getOx() {
		return ox;
	}
	public void setOx(double ox) {
		this.ox = ox;
	}
	public double getOy() {
		return oy;
	}
	public void setOy(double oy) {
		this.oy = oy;
	}
	
	

}
