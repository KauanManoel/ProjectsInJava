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
	
		System.out.println ("Digite os tanto dias que voc� est� aqui na terra: ");
		dias = ler.nextInt();
		
		System.out.println ("\nO tanto de dias que voc� tem na terra �: "+ dias);
		
		meses= dias/diasM;
		
		System.out.println ("\nO tanto de meses que voc� tem na terra �: "+ meses);
		
		anos= meses/mesesA;
				
		System.out.println ("\nO tanto de anos que voc� tem na terra �: "+ anos);
	}
}
