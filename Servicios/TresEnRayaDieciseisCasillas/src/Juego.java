import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class Juego {
	Scanner src = new Scanner(System.in);
	
	char tablero[][]= new char [4][4];
	 public static int numJugada=0;
	
	char fichaElegida, fichaMaquina;
	
	public static void main(String[] args) {
		char tablero[][];
		boolean esFin=false;
		Juego j1 = new Juego();
		tablero=j1.crearTablero();
		Juego.pintarTablero(tablero);
		do {
			if(!esFin) {
			esFin=j1.turnoJugador(tablero);}
			if(!esFin) {
			esFin=j1.turnoMaquina(tablero);}
			
		}while(Juego.finPartida(tablero)||esFin);
		System.exit(0);
		
		
		

	}
	
	
	public char[][] crearTablero() {
		int opcionElegida=2;
		boolean check=false;
		for (int fila1 = 0; fila1 < 4; fila1++) {
			 
			for (int fila2 = 0; fila2 < 4; fila2++) {
				
						tablero[fila1][fila2]='*';
					
			}
		}
		System.out.println("Elige que ficha quieres utilizar ");
		System.out.println("0 - 0");
		System.out.println("1 - X");
		System.out.println("Pulsa el 0 o el 1:");
		do {
			opcionElegida=src.nextInt();
			if (opcionElegida==0) {
				fichaElegida='O';
				fichaMaquina='X';
				check=true;
			}else if (opcionElegida==1) {
				fichaElegida='X';
				fichaMaquina='O';
				check=true;
			}else{
				System.out.println("La opción introducida no es valida, introduce 1 o 0");
			}
		}while(!check);
		
		System.out.println("Has elegido como ficha: "+fichaElegida);
		
		return tablero;
		
	}
	
	
	
 public static boolean finPartida(char tablero[][]) {
	 boolean sinFinalizar=false;
	 for (int fila1 = 0; fila1 < 4; fila1++) {
		 
			for (int fila2 = 0; fila2 < 4; fila2++) {				
						if (tablero[fila1][fila2]=='*') sinFinalizar= true;
			}
		}
	 	
	 return sinFinalizar;
 }
	
	
	
	
	public boolean turnoJugador(char tablero[][] ) {
		int posicionX=-1, posicionY=-1;
		boolean finJugada=false;
		numJugada++;
		
		do{
			
		do {
			try {
				System.out.println("Elige en que fila quieres poner tu ficha:");
		posicionY=src.nextInt();
			} catch (Exception e) {
				posicionY=-1;
			}			
		}while(posicionY>3&&posicionY>=0);
		
		do {
			try {
			System.out.println("Elige en que columna quieres introducir tu ficha:");
			posicionX=src.nextInt();}catch (Exception e) {
				posicionX=-1;
			}
		} while (posicionX>3&&posicionX>=0);
			
		
		
	}while(!comprobarPosicion(tablero,posicionY,posicionX));
		tablero[posicionY][posicionX]=fichaElegida;
		if(numJugada>=5) {
			finJugada=compruebaGanador(posicionY, posicionX, fichaElegida);
			}
		System.out.println("Jugador");
		Juego.pintarTablero(tablero);
		
	return finJugada;
	}
	
	public boolean turnoMaquina(char tablero[][] ) {
		int posicionX, posicionY;
		boolean finJugada=false;
		numJugada++;
		do {
		do{
		posicionY=(int) (Math.random()*3);
		}while(posicionY>3);
		
		do {
			posicionX=(int) (Math.random()*3);
		} while (posicionX>3);
		
	}while(!comprobarPosicion(tablero,posicionY,posicionX));
		tablero[posicionY][posicionX]=fichaMaquina;
		if(numJugada>=5) {
			finJugada=compruebaGanador(posicionY, posicionX, fichaMaquina);
			}
		System.out.println("Maquina");
		Juego.pintarTablero(tablero);
		return finJugada;}
	
	
	public static void pintarTablero(char tablero[][]) {
		for (int fila1 = 0; fila1 < tablero.length; fila1++) {
			 
			for (int fila2 = 0; fila2 < tablero[fila1].length; fila2++) {				
						System.out.print(tablero[fila1][fila2]);					
				}
			System.out.println();
			}
			
		}
	
	public static boolean comprobarPosicion( char tablero[][], int posicionY, int posicionX) {
		boolean huecoLibre = false;
		if (tablero[posicionY][posicionX]=='*') huecoLibre=true;	
		
		return huecoLibre;
	}
	
	
	public boolean compruebaGanador(int y, int x, char simbolo) {

	    boolean ganador = false;
	    
	    

	    for (int j = 0; j < 2; j++) {
			if(tablero[y][j]==simbolo && tablero[y][j+1]==simbolo && tablero[y][j+2]==simbolo){
	       ganador = true;
		}}
	    	
			for (int j = 0; j < 2; j++) {
				 if(tablero[j][x]==simbolo && tablero[j+1][x]==simbolo && tablero[j+2][x]==simbolo){
	       ganador = true;}
			}	    

	    	for (int i = 0; i < 2; i++) {
				if(tablero[i][i]==simbolo && tablero[i+1][i+1]==simbolo && tablero[i+2][i+2]==simbolo){
	        ganador = true;
			}       
	       
	    }
	    	for (int i = 0; i < 2; i++) {
				 if(tablero[i][i+2]==simbolo && tablero[i+1][i+1]==simbolo && tablero[i+2][i]==simbolo){
	        ganador = true;
	    }}
	    	if(tablero[0][1]==simbolo && tablero[1][2]==simbolo && tablero[2][3]==simbolo){
		        ganador = true;
		    }
	    	if(tablero[0][2]==simbolo && tablero[1][1]==simbolo && tablero[2][0]==simbolo){
		        ganador = true;
		    }
	    	if(tablero[1][0]==simbolo && tablero[2][1]==simbolo && tablero[3][2]==simbolo){
		        ganador = true;
		    }
	    	if(tablero[1][3]==simbolo && tablero[2][2]==simbolo && tablero[3][1]==simbolo){
		        ganador = true;
		    }
	    	if(ganador) {
	    		System.out.println("Ha ganado el simbolo "+simbolo);
	    	}
    
	return ganador;
	
	}
	}


