package LacoRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main (String args[])
	{
		int num, soma=0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num= ler.nextInt();
		
		do
		{
			soma= soma+num;
			
			System.out.println("Digite um número: ");
			num= ler.nextInt();
		}
		while (num!=0);
		
		System.out.println("\nA soma dos valores é: "+soma);
	
	}
	
}
