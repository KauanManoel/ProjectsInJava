package exercicio2;

import java.util.Scanner;

public class exercicio1 {

	public static void main (String args[])
	{
		int a, b, c;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Escreva o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Escreva o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Escreva o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("O maior n�mero digitado foi o:"+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("O maior n�mero digitado foi o:"+b);
		}
		else if (c>a && c>b)
		{
			System.out.println("O maior n�mero digitado foi o:"+c);
		}
	}
	
}
