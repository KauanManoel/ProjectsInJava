package LacoRepeticao;

import java.util.Scanner;

public class While {

	public static void main (String args[])
	{
		int idade, jovem=0, idoso=0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite sua idade por gentileza: ");
		idade= ler.nextInt();
		
		while (idade <= 98)
		{
		
			if (idade <= 21)
			{
				jovem++;
			}
			else if (idade >= 50 && idade <= 98)
			{
				idoso++;
			}
			System.out.println("Digite sua idade por gentileza: ");
			idade= ler.nextInt();
		}
	
		
		System.out.println("\nForam contabilizadas "+jovem+ " pessoas com mais de 21 anos... e "+idoso+ " pessoas com mais de 50 anos");
	}
	}

