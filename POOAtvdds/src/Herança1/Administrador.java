package Heran�a1;

public class Administrador extends Pessoa {
	
	private float AD;
	 	
	public Administrador (String Nome, String Endere�o, int Telefone, float AD)
	{
		super (Nome,Endere�o,Telefone);
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
		String dados= "O nome do administrador �: "+ Nome + "\nEndere�o: " + Endere�o + "\nTelefone: " + Telefone +"\nAjuda de custo mensal: " + AD;
		return dados;
	}

	
}
