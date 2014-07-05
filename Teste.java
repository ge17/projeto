import java.sql.SQLException;

import projeto.beans.Cliente;
import projeto.dao.ClienteDAO;


public class Teste {
	
	public static void main(String[] args) throws SQLException {
		
	
	
	ClienteDAO cliDAO = new ClienteDAO();
	
	Cliente cli = new Cliente();
	
	cli.setNome("georgito");
	
	cliDAO.inserir(cli);
	
	System.out.println(cli.getNome());
	
	cliDAO.buscar(cli);
	
	System.out.println(cli.getNome());
	
	
	}
}
