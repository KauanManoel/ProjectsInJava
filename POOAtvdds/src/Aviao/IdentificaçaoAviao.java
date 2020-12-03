package Aviao;

public class IdentificaçaoAviao {
	public static void main (String args []) {

		//instanciando um objeto da classe Automóvel

		Aviao a = new Aviao ("Jonatas", "Boing 65w", "123321",2010, 60);

		//troca de mensagens (chamada ao método imprimir())

		a.imprimirInfo();

		System.out.println ("\n***Transferencia de Proprietario***");

		a.setNomeProprietario("\nRoger");

		a.imprimirInfo();

		Aviao b = new Aviao ("\nRoger", "Boing 65w", "123321", 2010,60);

		b.imprimirInfo();

		System.out.println("Warninig: O nosso avião comporta apenas 60 pessoas!!!");
		}

	//fim do método main

}
