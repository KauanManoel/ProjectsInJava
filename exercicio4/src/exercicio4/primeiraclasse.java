package exercicio4;

import java.util.Scanner;

public class primeiraclasse {

	public static void main (String args[])
	{
		double a, b, c, r, s, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println ("Entre com o valor de a: ");
		a= ler.nextDouble();
		System.out.println ("Entre com o valor de b: ");
		b= ler.nextDouble();
		System.out.println ("Entre com o valor de c: ");
		c= ler.nextDouble();
		
		r= a + b;
		r= r*r;
		s= b + c;
		s= s*s;
		d= (r + s)/2;
		
		System.out.println ("O valor de D é: " +d);
				
		
		
	}
	
}
