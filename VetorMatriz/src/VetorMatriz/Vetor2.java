package VetorMatriz;

import java.util.Scanner;

public class Vetor2 {

	int arrayNum[]= new int[6];
	int somapar= 0, contimpar=0, x;
	
	Scanner ler = new Scanner (System.in);
	
	for(x=0;x<6;x++)
	{
		System.out.println("Entre com um número: ");
		arrayNum[x]= ler.nextInt();
		
		if (arrayNum[x]%2 ==0)
		{
			somapar = somapar+arrayNum[x];	
		}
		else
		{
			contimpar++;
		}
	}
	System.out.println("A soma dos números pares é: "+somapar);
	System.out.println("A quantidade de números impares é: "+contimpar);
	
}
}
