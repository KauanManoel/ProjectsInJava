package Heran�a1;

public class Treinador extends Pessoa {
	
	private int code;

	public Treinador(String Nome, String Endere�o, int Telefone, int code) 
	{
		super(Nome, Endere�o, Telefone);
		this.code= code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


}
