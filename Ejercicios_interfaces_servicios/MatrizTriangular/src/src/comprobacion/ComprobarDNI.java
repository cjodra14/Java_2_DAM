package comprobacion;

import java.util.Scanner;

public class ComprobarDNI {

	public static void main(String[] args) {
		String dniParaComprobar;
		try {
			do {
		dniParaComprobar=retornarDNI();}
		while(!comprobarDni(dniParaComprobar));
		verificarLetra((dniLetra(dniParaComprobar).charAt(0)),modulo23(dniNumero(dniParaComprobar)) );
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	//Un metodo que sea retornar números y otro retornar letras --> Recibe dni
    //Retorna los números del dni
    public static int dniNumero(String dni) {
        return Integer.parseInt(dni.substring(0,8));
    }

    //Retorna la letra (en mayúscula) del dni
    public static String dniLetra(String dni) {        
        return dni.substring(8,9).toUpperCase();
    }
	
    //Metodo para teclear el DNI
	public static String retornarDNI() {
		String dni;
        Scanner src = new Scanner(System.in);			
			System.out.println("Teclea dni");
			dni=src.nextLine();
			return dni;
    }
	
	//Comprueba si los primeros 8 del String del  DNI carácteres son números
	public static boolean sonNumeros(String dni) {
        try {
          Integer.parseInt(dni.substring(0, 8));
            return true; //Los 8 primeros carácteres son números
      } catch (NumberFormatException e) {
          return false; //Los 8 primeros carácteres no son números
      }
  }

//Comprueba que los 8 primeros carácteres sean números, el noveno sea una letra y la longitud del dni sea de 9 carácteres
  public static boolean comprobarDni(String dni) {
      if(dni.length()==9&&sonNumeros(dni)==true && Character.isLetter(dni.charAt(8))==true){
          return true;
      }else {
    	  System.out.println("Formato de DNI erroneo.");
    	  System.out.println("Introduzca el DNI de nuevo");
      return false;      
      }
  }
	
	// Recibe los numeros del DNI y haciendo el resto de 23 nos indica que letra le corresponde 
	public static char modulo23(int numdni) {	
		char[] letrasNIF= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};	
		return letrasNIF[numdni%23];
	}
	 //Comprueba que la letra del dni que hemos introducido corresponda a la letra asignada a  esos números
	public static void verificarLetra(char letraComprobar, char letraCorrespondiente){
		if (letraComprobar==letraCorrespondiente) {
			System.out.println("El número de DNI introducido corresponde con la letra "+letraComprobar);
		}else {
			System.out.println("El número de DNI introducido NO corresponde con la letra "+letraComprobar);
		}
	}
	
	
	
	

}
