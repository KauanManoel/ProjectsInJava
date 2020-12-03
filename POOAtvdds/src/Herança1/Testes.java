package Herança1;

public class Testes {

	public static void main (String args [])
	{
		Administrador adm1 = new Administrador ("Marcelo","Rua Voz",1234,1000);
		System.out.println (adm1.imprimir());
		
		Vendedor vend1 = new Vendedor ("Juliano","Rua Artes",1010, 890);
		System.out.println (vend1.imprimir1());
		System.out.println (vend1.comissao1());
	}
	
}

//Pessoa Jordan = new Pessoa ("Michael Jordan", "\nChicago\n",2005);
//Atleta Wade = new Atleta ("Dwayne Wade", "\nMiami\n", 2012, "\nBasquete","Adulto");
//Treinador Beight = new Treinador ("Beight Downvill","\nIndiana\n",2200,1234);

//Jordan.setNome("Kobe");
//System.out.println (Jordan.getNome());
//System.out.println (Wade.getEsporte());
//System.out.println (Beight.hashCode());
