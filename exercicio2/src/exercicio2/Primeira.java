/**
 * 
 */
package exercicio2;

import java.util.Scanner;

/**
 * @author Proevento
 *
 */
public class Primeira {
	
	public static void main (String args[])
	{
	
	int dias, diasM, meses, mesesA, anos;
	diasM= 30;
	mesesA= 12;
		
		Scanner ler = new Scanner(System.in);
	
		System.out.println ("Digite os tanto dias que você está aqui na terra: ");
		dias = ler.nextInt();
		
		System.out.println ("\nO tanto de dias que você tem na terra é: "+ dias);
		
		meses= dias/diasM;
		
		System.out.println ("\nO tanto de meses que você tem na terra é: "+ meses);
		
		anos= meses/mesesA;
				
		System.out.println ("\nO tanto de anos que você tem na terra é: "+ anos);
	}
}
