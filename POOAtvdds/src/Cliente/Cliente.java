package Cliente;

public class Cliente {

	private String nomeCompleto;
	private String email;	
	private String enderešo;
	private int telefone;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Cliente (String nome, String Email, String lougradouro, int numero)
	{
		nomeCompleto= nome;
		email= Email;
		enderešo= lougradouro;
		telefone= numero;
	}
	public String getDados()
	{
		String dados= nomeCompleto + email + enderešo + telefone;
		return dados;
		
	}
	
	
}

