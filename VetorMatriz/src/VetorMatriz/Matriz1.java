package VetorMatriz;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String args[]) {
		int [] [] matriz= new int [3] [3];
		int cont1=0;
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Matriz [3] [3]\n");
		
		for(int linha=0; linha< 3; linha++) 
		{
			for(int coluna=0; coluna< 3; coluna++) 
			{
				System.out.printf("\nInsira o elemento M[%d] [%d]: ",linha+1, coluna+1 );
				matriz[linha] [coluna]= entrada.nextInt();
				
				if (matriz[linha][coluna] > 10)
				{
					cont1++;
				}
			}  
		}
		System.out.println("\n Matriz finalizada: ");
		for(int linha=0; linha< 3; linha++) 
		{
			for(int coluna=0; coluna< 3; coluna++)
			{
				System.out.println(matriz [linha][coluna]);
				
			}
				
	}
	
			System.out.println("\nForam "+cont1+ " números maior que 10");
		
}

}
