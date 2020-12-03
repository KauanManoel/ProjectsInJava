package LaçoCondicional;

import java.util.Scanner;

public class exercicio4 {

		public static void main (String args[])
	{
		int num;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Entre com algum valor: ");
		num = ler.nextInt();
		
		if (num%2==0)
		{
			num = (int) Math.sqrt(num);
		}
		else
		{
			num = (int) Math.pow(num, 2);
		}
		System.out.println("O valor de num foi de: "+num);
	}
	
	
}