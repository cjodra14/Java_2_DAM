package matriz;

public class matrizTriangular {
	public static void main(String []args) {
		final int LONGITUD_ARRAY= 10;
		final int LAST_NUMBER = 1;
		final int START=1;
		
		int matriz[][]=new int [LONGITUD_ARRAY][LONGITUD_ARRAY];
		for(int i=0;i<matriz.length;i++) {
			System.out.print("Factorial de:"+(i+START)+"\t--> ");
			for (int j = i; j>=0; j--) {
					matriz[i][j]=j+START;
					if (matriz[i][j]==LAST_NUMBER) {
						System.out.print(matriz[i][j]);
					}else {
						System.out.print(matriz[i][j]+"*");
					}
				}
			System.out.println();
		}	
	}

}
