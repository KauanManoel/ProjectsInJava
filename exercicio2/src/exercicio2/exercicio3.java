package exercicio2;

import java.util.Scanner;

public class exercicio3 {

	public static void main (String args[])
	{
		int idade;
		
		Scanner ler= new Scanner (System.in);
		
		System.out.println("Ol� bom dia... Digite a sua idade por gentileza: ");
		idade= ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Voc� � da categoria INFANTIL!!!");
		}
		else if (idade>=15 && idade<=17)
		{   
			System.out.println("Voc� � da categoria JUVENIL!!!");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Voc� � da categoria ADULTO!!!");
		}
		else
		{
			System.out.println("Infelizmente voc� n�o tem idade v�lida!!!");
		}
	}
	
}
