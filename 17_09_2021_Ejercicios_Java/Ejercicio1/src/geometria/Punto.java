package geometria;

public class Punto {
	private int x, y;
	
	Punto(int x,int y){
		this.x=x;
		this.y=y;
	}
	Punto(){
		x=3;
		y=3;
	}
	Punto(Punto puntoRef){
		x=puntoRef.getX();
		y=puntoRef.getY();
	}
	

	
	
	double distancia(Punto puntoReferencia) {
		//Este metodo calcula la distancia desdes un punto de refencia a si mismo
		int base,altura;
		double distancia;
		base= Math.abs(puntoReferencia.getX()-x);
		altura= Math.abs(puntoReferencia.getY()-y);
		distancia=Math.sqrt((base*base)+(altura*altura));
		return distancia;
	}
	double distancia(int xRef, int yRef) {
		//Este metodo recibe las coordenadas de un punto de referencia y calcula la distanciahasta si mismo
		int base,altura;
		double distancia;
		base= Math.abs(xRef-x);
		altura= Math.abs(yRef-y);
		distancia=Math.sqrt((base*base)+(altura*altura));
		return distancia;
	}
	
	public static double distanciaEntrePuntos(Punto puntoInicio,Punto puntoFinal) {
		//Este metodo calcula la distancia desdes un punto de refencia a si mismo
		int base,altura;
		double distancia;
		base= Math.abs(puntoInicio.getX()-puntoFinal.getX());
		altura= Math.abs(puntoInicio.getY()-puntoFinal.getY());
		distancia=Math.sqrt((base*base)+(altura*altura));
		return distancia;}
	
	 Punto puntoMasCercano(Punto[] punto){
		 Punto puntoCercano=new Punto(0,0);
		 double distAux=Double.MAX_VALUE;
		 double distanciaEntrePuntos;
		for (int i = 0; i < punto.length; i++) {
			distanciaEntrePuntos= distancia(punto[i]);
			//System.out.println(punto[i].getX()+","+punto[i].getY()+"-"+distanciaEntrePuntos);
			if(distanciaEntrePuntos<distAux) {
				distAux=distanciaEntrePuntos;
				puntoCercano.setX(punto[i].getX());
				puntoCercano.setY(punto[i].getY());
			}
		}
		return puntoCercano;
	}
	//Traslada el punto en la dirección que le indica el vector
	void trasladar(Vector vector) {
		
		x=x+vector.getOx();
		y=y+vector.getOy();
	}
	//método que imprime el valor del punto. Por ejemplo: (4,9).
	String imprimirPunto() {
		String puntoImpreso="("+x+","+y+")";
		System.out.println(puntoImpreso);
		return puntoImpreso;
	}
	
	//Getters y Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
