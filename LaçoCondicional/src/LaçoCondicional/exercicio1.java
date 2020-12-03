package LaçoCondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main (String args[])
	{
		int a, b, c;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Escreva o segundo número: ");
		b = ler.nextInt();
		System.out.println("Escreva o terceiro número: ");
		c = ler.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("O maior número digitado foi o:"+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("O maior número digitado foi o:"+b);
		}
		else if (c>a && c>b)
		{
			System.out.println("O maior número digitado foi o:"+c);
		}
	}
	
}
