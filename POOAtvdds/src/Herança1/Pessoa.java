package Heran�a1;

public class Pessoa {

	protected String Nome;
	protected String Endere�o;
	protected int Telefone;
	
	public Pessoa (String Nome, String Endere�o, int Telefone)
	{
		this.Nome = Nome;
		this.Endere�o= Endere�o;
		this.Telefone=Telefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndere�o() {
		return Endere�o;
	}

	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
}
