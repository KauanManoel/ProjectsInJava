package Aviao;

public class Aviao {
	//declara��o de pacotes

	//defini��o da classe Automovel


	//declara��o dos atributos da classe

	private String nomeProprietario;

	private String modelo;

	private int ano;

	private String identifica�ao;
	

	private int passag;

	//m�todo construtor

	public Aviao (String nomeProprietario, String modelo, String identifica�ao, int ano, int passag) 
	{

	this.nomeProprietario = nomeProprietario;

	this.modelo = modelo;

	this.identifica�ao = identifica�ao;

	this.ano = ano;
	
	this.passag = passag;

	}


	//declara��o dos demais m�todos da classe

	public void imprimirInfo (){

	System.out.println(nomeProprietario+ " possui um avi�o " + modelo + "com identifica�� " + identifica�ao + " e ano " + ano + "que comporta apenas" + passag);

	}

	public void setNomeProprietario (String nome){

	this.nomeProprietario = nome;

	}

	public void setIndent (String nIndent){

	this.identifica�ao = nIndent;

	}

		
	}


