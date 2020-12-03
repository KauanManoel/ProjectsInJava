package LacoRepeticao;

import java.util.Scanner;

public class For2 {

	public static void main (String args[])
	{
		int num1, num, par=0, impar=0;
		Scanner ler = new Scanner (System.in);
		
		for (num1=1;num1<=10;num1++)
		{	       
           System.out.println("\nDigite um número: ");
           num= ler.nextInt();
          if (num%2 == 0)
          {
        	  par++;
          }
          else
          {
        	  impar++;
          }
        
		}
			System.out.println("\nForam "+par+" números pares digitados... e "+impar+" números impares");
	}
	
}
