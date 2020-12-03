package Herança1;

public class Pessoa {

	protected String Nome;
	protected String Endereço;
	protected int Telefone;
	
	public Pessoa (String Nome, String Endereço, int Telefone)
	{
		this.Nome = Nome;
		this.Endereço= Endereço;
		this.Telefone=Telefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
}
