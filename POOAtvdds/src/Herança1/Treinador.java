package Herança1;

public class Treinador extends Pessoa {
	
	private int code;

	public Treinador(String Nome, String Endereço, int Telefone, int code) 
	{
		super(Nome, Endereço, Telefone);
		this.code= code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


}
