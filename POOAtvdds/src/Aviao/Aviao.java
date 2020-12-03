package Aviao;

public class Aviao {
	//declaração de pacotes

	//definição da classe Automovel


	//declaração dos atributos da classe

	private String nomeProprietario;

	private String modelo;

	private int ano;

	private String identificaçao;
	

	private int passag;

	//método construtor

	public Aviao (String nomeProprietario, String modelo, String identificaçao, int ano, int passag) 
	{

	this.nomeProprietario = nomeProprietario;

	this.modelo = modelo;

	this.identificaçao = identificaçao;

	this.ano = ano;
	
	this.passag = passag;

	}


	//declaração dos demais métodos da classe

	public void imprimirInfo (){

	System.out.println(nomeProprietario+ " possui um avião " + modelo + "com identificaçõ " + identificaçao + " e ano " + ano + "que comporta apenas" + passag);

	}

	public void setNomeProprietario (String nome){

	this.nomeProprietario = nome;

	}

	public void setIndent (String nIndent){

	this.identificaçao = nIndent;

	}

		
	}


