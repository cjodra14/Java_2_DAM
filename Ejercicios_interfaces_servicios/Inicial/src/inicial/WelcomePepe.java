package inicial;

public class WelcomePepe {
	
	public static void main(String[]args){
		try {
			System.out.println("Welcome, "+args[3]);
			System.out.println("Welcome, "+args[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No se han encontrado argumentos. No existe el  elemento numero: "+e.getMessage());
			
		}
	}
}
