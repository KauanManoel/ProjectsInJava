package Polimorfismo1;

public class Cavalo extends Animal {
	private String som;
	private String mov;
	
	public Cavalo ()
	{

	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String getMov() {
		return mov;
	}

	public void setMov(String mov) {
		this.mov = mov;
	}

	
	public String apresenta��o1 ()
	{
		return "Esse Cachorro se chama "+ super.getNome() + " sua idade � " + super.getIdade() + " anos \n" + "Emite o som: " + this.getSom() + "\nE a movimenta��o: " + this.getMov();
	}
	
}
