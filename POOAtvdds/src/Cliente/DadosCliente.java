package Cliente;

public class DadosCliente {

	public static void main (String args[])
	{
		Cliente cliente1 = new Cliente ("Hudson Gouveia Neves","\nvaigaleracoração@rodeio.com","\nUberlandia, Minas Gerais N° 19\n",99999999);
		System.out.println("Cadastro Cliente 1.0\n");
		System.out.println(cliente1.getDados());
	}
	
}
		