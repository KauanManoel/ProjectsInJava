package Cliente;

public class Cliente {

	private String nomeCompleto;
	private String email;	
	private String endere�o;
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
		endere�o= lougradouro;
		telefone= numero;
	}
	public String getDados()
	{
		String dados= nomeCompleto + email + endere�o + telefone;
		return dados;
		
	}
	
	
}

