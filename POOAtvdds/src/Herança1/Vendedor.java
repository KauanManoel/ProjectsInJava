package Heran�a1;

import java.util.Scanner;

public class Vendedor extends Pessoa {
	
	private float valorVendas;
	Scanner ler = new Scanner (System.in);
	
	public Vendedor (String Nome, String Endere�o, int Telefone, float valorVendas)
	{
		super (Nome, Endere�o, Telefone);
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
		
		System.out.println ("O seu sal�rio mensal com a comiss�o � de: "+VencLiq);
		return zero;
		
	}
	public  String imprimir1 ()
	{
		String dados1= "O nome do administrador �: "+ Nome + "\nEndere�o: " + Endere�o + "\nTelefone: " + Telefone ;
		return dados1;
	}


	
}
