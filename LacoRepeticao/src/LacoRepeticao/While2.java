package LacoRepeticao;

import java.util.Scanner;

public class While2 {

	public static void main (String args[])
	{
		int Npessoas=1, idade, sexo, temperamento, PC=0, MN=0, HA=0, OC=0, NQ=0, CD=0;
		
		Scanner ler = new Scanner (System.in);
		

		while (Npessoas <= 2)
		{
			
			System.out.println("Digite a idade: ");
			idade= ler.nextInt();
			
			while (idade<=0 || idade>=130)
			{
				System.out.println("Digite a idade novamente: ");
				idade= ler.nextInt();
			}
			
			System.out.println("sexo (1-feminino / 2-masculino / 3-Outros)");
			sexo= ler.nextInt();
			
			while (sexo<=0 || sexo>=3)
			{
				System.out.println("Digite uma opção válida... Sexo (1-feminino / 2-masculino / 3-Outros)");
				sexo= ler.nextInt();
			}
			
			System.out.println("Seu temperamento é 1- Calmo(a); 2- Nervoso(a); Agressivo(a)");
			temperamento = ler.nextInt();
			
			while (temperamento<=0 || temperamento >=3)
			{
				System.out.println("Digite uma opção válida... Seu temperamento é 1- Calmo(a); 2- Nervoso(a); Agressivo(a)");
				temperamento= ler.nextInt();
			}
			
			
			if (temperamento == 1)
			{
				PC++;
			}
			if (sexo == 1 && temperamento == 2)
			{
				MN++;
			}
			if (sexo == 2 && temperamento == 3)
			{
				HA++;
			}
			if (sexo == 3 && temperamento == 1)
			{
				OC++;
			}
			if (temperamento == 3 && idade>40)
			{
				NQ++;
			}
			if (temperamento == 1 && idade<18)
			{
				CD++;
			}
			
			Npessoas++;
		}
		
			
			System.out.println("\nPessoas calmas: "+PC);
			System.out.println("\nMulheres nervosas: "+MN);
			System.out.println("\nHomens Agressivos: "+HA);
			System.out.println("\nOutros calmos: "+OC);
			System.out.println("\nNervosos(as) com mais de 40 anos: "+NQ);
			System.out.println("\nCalmos(as) com menos de 18 anos: "+MN);
				
		
		
	}
	
}
