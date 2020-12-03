package pacote6;

import java.util.Scanner;

public class primeiraclasse {

	public static void main(String args[])
	{
		double x1, x2, y1, y2, c, c1, d1, d;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Entre com o valor de x1");
		x1 = ler.nextInt();
		System.out.println("Entre com o valor de x2");
		x2 = ler.nextInt();
		System.out.println("Entre com o valor de y1");
		y1 = ler.nextInt();
		System.out.println("Entre com o valor de y2");
		y2 = ler.nextInt();
		
		c = x2-x1;
		c= c*c;	
		c1= y2-y1;
		c1= c1*c1;
		
		d1= c+c1;
		
		d = d1*d1;
		
		System.out.println("O valor de d é: "+ d);
	}
	
}
