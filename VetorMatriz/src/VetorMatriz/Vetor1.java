package VetorMatriz;

public class Vetor1 {

	public static void main (String args[])
	{
		
		int[] A = {1,0,5,-2,5,7};
		int soma;
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println ("A soma dos vetores solicitados é: "+soma);
		
		A[4] = 100;
		
		for (int i : A)
		{
			System.out.println ("\n"+i);
		}
		
	}
	
}
