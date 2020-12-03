package Polimorfismo1;

public class Preguiça extends Animal {

	private String som;
	private String mov;
	
	public Preguiça ()
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

	
	public String apresentação3 ()
	{
		return "Esse Cachorro se chama "+ super.getNome() + " sua idade é " + super.getIdade() + " anos \n" + "Emite o som: " + this.getSom() + "\nE a movimentação: " + this.getMov();
	}
	
}

	
