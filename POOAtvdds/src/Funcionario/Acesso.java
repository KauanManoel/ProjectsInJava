package Funcionario;


import java.util.Scanner;

public class Acesso {

	public static void main (String args[])
	
	{
		Scanner leitura = new Scanner (System.in);
		String pr;
		
		Funcionario[] lista = new Funcionario[3];
		lista[0] = new Funcionario();
		lista[1] = new Funcionario();
		lista[2] = new Funcionario();

		System.out.println ("Bom dia!!!");
		System.out.println ("\nRH SERVI�OS!!!");
		System.out.println ("\nProfissional do RH digite seu nome por favor: ");
		pr= leitura.next();
		System.out.println ("\n"+pr+ " inicie o cadastro do(s) novos funcion�rios...");
	
		for(Funcionario roda: lista)
		{
			roda.NameEnt();
			roda.CargoEnt();
			roda.SiteEnt();
			roda.CodigoEnt();
			
	for(Funcionario roda1: lista)
	{
			roda1.imprimir();
	}
			
			System.out.println("\nPr�ximo funcion�rio por gentileza...\n");
		}
		

	}
}

//for(x=0;x<6;x++)
	//System.out.println("Entre com um n�mero: ");
	//arrayNum[x]= ler.nextInt();

//Funcionario[] lista = new Funcionario[3];
//lista[0] = new Funcionario("_","_","_",0);
//lista[1] = new Funcionario("_","_","_",0);
//lista[2] = new Funcionario("_","_","_",0);


//for(Funcionario roda: lista)
//{
	//roda.NameEnt();
//}
//for(Funcionario roda:lista)
//{
	//roda.CargoEnt();
//}
//for(Funcionario roda:lista)
//{
	//roda.SiteEnt();
//}
//for(Funcionario roda:lista)
//{
	//roda.CodigoEnt();
//}
//for(Funcionario roda:lista)
//{
	//roda.imprimir();
//}





//Funcionario funcionario1 = new Funcionario();
//funcionario1.NameEnt();
//funcionario1.CargoEnt();
//funcionario1.SiteEnt();
//funcionario1.CodigoEnt();






