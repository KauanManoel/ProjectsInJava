package Heranša1;

public class Pessoa {

	protected String Nome;
	protected String Enderešo;
	protected int Telefone;
	
	public Pessoa (String Nome, String Enderešo, int Telefone)
	{
		this.Nome = Nome;
		this.Enderešo= Enderešo;
		this.Telefone=Telefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEnderešo() {
		return Enderešo;
	}

	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
}
