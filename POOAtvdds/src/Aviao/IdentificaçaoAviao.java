package Aviao;

public class Identifica�aoAviao {
	public static void main (String args []) {

		//instanciando um objeto da classe Autom�vel

		Aviao a = new Aviao ("Jonatas", "Boing 65w", "123321",2010, 60);

		//troca de mensagens (chamada ao m�todo imprimir())

		a.imprimirInfo();

		System.out.println ("\n***Transferencia de Proprietario***");

		a.setNomeProprietario("\nRoger");

		a.imprimirInfo();

		Aviao b = new Aviao ("\nRoger", "Boing 65w", "123321", 2010,60);

		b.imprimirInfo();

		System.out.println("Warninig: O nosso avi�o comporta apenas 60 pessoas!!!");
		}

	//fim do m�todo main

}
