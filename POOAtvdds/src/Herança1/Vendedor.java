package Herança1;

import java.util.Scanner;

public class Vendedor extends Pessoa {
	
	private float valorVendas;
	Scanner ler = new Scanner (System.in);
	
	public Vendedor (String Nome, String Endereço, int Telefone, float valorVendas)
	{
		super (Nome, Endereço, Telefone);
		this.valorVendas = valorVendas;

	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
		
	}

	
	public double comissao1 ()
	{
		double VencBase= 1200;
		double comiss;
		double zero = 0;
		
		comiss = (valorVendas*10)/100;
		double VencLiq;
		VencLiq= VencBase + comiss;
		
		System.out.println ("O seu salário mensal com a comissão é de: "+VencLiq);
		return zero;
		
	}
	public  String imprimir1 ()
	{
		String dados1= "O nome do administrador é: "+ Nome + "\nEndereço: " + Endereço + "\nTelefone: " + Telefone ;
		return dados1;
	}


	
}
