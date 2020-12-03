package LacoRepeticao;

import java.util.Scanner;

public class DoWhile2 {
	
	public static void main (String args[])
	{
		int num, cont=0, soma=0, media;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num= ler.nextInt();
		
		do
		{
			if (num%3 == 0)
			{
				soma= soma+num;
				cont++;
			}
			
			System.out.println("Digite um número: ");
			num= ler.nextInt();
		}
		while (num!=0);
		
		media = soma/cont;
		
		System.out.println("\nA media dos valores é: "+media);
	
	}
	
}
