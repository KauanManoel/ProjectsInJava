package Polimorfismo1;

public class Cachorro extends Animal {
	
	private String som;
	private String mov;
	
	public Cachorro ()
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

	
	public String getNome ()
	{
		return "Esse Cachorro se chama "+ super.getNome() + " sua idade é " + " anos \n" + "Emite o som: " + this.getSom() + "\nE a movimentação: " + this.getMov();
	}
	
}
