package Heran�a1;

public class Atleta extends Pessoa {

	private String esporte;
	private String categoria;
	
	public Atleta (String Nome, String Endere�o, int Telefone, String esporte, String categoria)
	{
		super(Nome,Endere�o,Telefone);
		this.esporte= esporte;
		this.categoria = categoria;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	  
}
