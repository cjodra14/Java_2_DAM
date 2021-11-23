package examen;
// Christian Jodra Lopez 28/10/2021

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Operativa {
public Operativa() {	
		
	}
	final int TOTALSERIE= 1000;
	final int PRIMERNUMSERIE=10;
	int num1;
	int num2;
	int num3;
	int suma;
	ArrayList<Integer> numerosReproductores = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> listarNumerosReproductores(){
		for (int i = PRIMERNUMSERIE; i < TOTALSERIE; i++) {
			if((String.valueOf(i).length())<3){
				num1=Integer.parseInt((String.valueOf(i).substring(0,1)));
				num2=Integer.parseInt((String.valueOf(i).substring(1,2)));
				//System.out.print(num1);				
				do {					
					//System.out.print(","+num2);
					suma=num1+num2;					
					num1=num2;
					num2=suma;
					if(suma==i) {
						numerosReproductores.add(suma);
					}
				}while(suma<=i);
				//System.out.println();
			}
			else {
				num1=Integer.parseInt((String.valueOf(i).substring(0,1)));
				num2=Integer.parseInt((String.valueOf(i).substring(1,2)));
				num3=Integer.parseInt((String.valueOf(i).substring(2,3)));
				//System.out.print(num1+","+num2);				
				do {					
					//System.out.print(","+num3);
					suma=num1+num2+num3;					
					num1=num2;
					num2=num3;
					num3=suma;
					if(suma==i) {
						numerosReproductores.add(suma);
					}
				}while(suma<=i);
				//System.out.println();
			}		
			
		}
		return numerosReproductores;
	}
	
	
	
	
	
	

}
