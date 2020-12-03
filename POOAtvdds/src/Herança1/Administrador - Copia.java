package Herança1;

public class Administrador extends Pessoa {
	
	private float AD;
	 	
	public Administrador (String Nome, String Endereço, int Telefone, float AD)
	{
		super (Nome,Endereço,Telefone);
		this.AD = AD;
	}

	public float getAD() {
		return AD;
	}

	public void setAD(float aD) {
		AD = aD;
	}
	
	public  String imprimir ()
	{
		String dados= "O nome do administrador é: "+ Nome + "\nEndereço: " + Endereço + "\nTelefone: " + Telefone +"\nAjuda de custo mensal: " + AD;
		return dados;
	}

	
}
