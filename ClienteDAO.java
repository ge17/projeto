import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projeto.beans.Cliente;


public class ClienteDAO {
	
	public void inserir(Cliente cliente) throws SQLException{
		
		Connection conn = null;
		
		try{
			
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement insert = conn.prepareStatement("INSERT INTO cliente(nome) VALUES (?)"); 
			
			insert.setString(1, cliente.getNome());
			insert.executeUpdate();
		}
		catch (SQLException e){
			e.printStackTrace();
			throw new SQLException("Erro ao manipular o banco");
		} finally {
			if (conn != null){
				try {
					conn.close();
				}catch (SQLException e){
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexão com o banco!", e);
				}
			}
		}
		
	}
	
public void buscar(Cliente cliente) throws SQLException{
		
		Connection conn = null;
		
		try{
			
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement select = conn.prepareStatement("SELECT * FROM cliente WHERE NOME = ?"); 
			
			select.setString(1, cliente.getNome());
			select.executeQuery();
		}
		catch (SQLException e){
			e.printStackTrace();
			throw new SQLException("Erro ao manipular o banco");
		} finally {
			if (conn != null){
				try {
					conn.close();
				}catch (SQLException e){
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexão com o banco!", e);
				}
			}
		}
		
	}
	

}
