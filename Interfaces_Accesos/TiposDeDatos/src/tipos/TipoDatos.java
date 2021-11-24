package tipos;

import java.util.Scanner;

public class TipoDatos {
	

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		int n1,n2,enteroMayor,resto;
		float valor,sumaTotal;
		String frase1, frase2;
		
		System.out.println("Introduce un numero entero distinto de 0:");
		n1=src.nextInt();
		System.out.println("Introduzca otro numero distinto de 0:");
		n2=src.nextInt();
		System.out.println("Introduce un numero real, utilizando el separador local ',' para decimales:");
		valor=src.nextFloat();
		System.out.println("Teclea una frase:");
		src.nextLine();
		frase1=src.nextLine();
		System.out.println("Introduce una segunda frase:");
		frase2=src.nextLine();
		src.close();
		if(n1>n2) {
			enteroMayor=n1;
		}else {
			enteroMayor=n2;
		}
		System.out.println("El numero mayor es "+enteroMayor);
		System.out.println(frase1+" "+frase2);
		
		

	}

	
}
