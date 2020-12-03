package Funcionario;

import java.util.Scanner;

public class Funcionario {

	
	Scanner ler = new Scanner (System.in);
	private String nomeCompleto;
	private String cargo;
	private String site;
	private int codigo;

	
	public void Funcionario (String nome, String Cargo, String Site, int Codigo)
	{
		nomeCompleto= nome;
		cargo= Cargo;
		site= Site;
		codigo= Codigo;
		
	}


		public String NameEnt ()
	{
		String Name;
		System.out.println("Digite seu nome: ");
		Name= ler.next();
		return Name;	
	}
	 	public String CargoEnt ()
	{
		String Cargoe;
		System.out.println("Digite seu cargo: ");
		Cargoe= ler.next();
		return Cargoe;
		
	}
	 	public String SiteEnt ()
	{
		String Sitee;
		System.out.println("Digite seu site: ");
		Sitee= ler.next();
		return Sitee;
		
	}
	 	public int CodigoEnt  ()
	{
		int Code;
		System.out.println("Digite seu codigo: ");
		Code= ler.nextInt();
		return Code;
		
	}
	 	public void imprimir()
	{
			System.out.println("Cadastro confirmado do "+ NameEnt() + ", cujo cargo é "+ CargoEnt() +", do site "+ SiteEnt() +"\nSeu códgo é: "+ CodigoEnt());
	}
	 	
	public String getSubordinado()
	{
		String subordinado= nomeCompleto + cargo + site + codigo;
		return subordinado;
	}

	public String getNomeCompleto() 
	{
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) 
	{
		this.nomeCompleto = nomeCompleto;
		System.out.println ("Digite seu nome: ");
		nomeCompleto= ler.next();
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}

