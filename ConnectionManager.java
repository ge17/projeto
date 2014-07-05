import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
	
	
	private static ConnectionManager instance;
	
	private ConnectionManager() throws ClassNotFoundException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	public static ConnectionManager getInstance() throws SQLException{
		
		try{
			if(instance == null){
				instance = new ConnectionManager();
			}
		}
		catch(ClassNotFoundException e){
			
			throw new SQLException("Driver não encontrado");
		}
		return instance;
	
	}
	
	public Connection getConnection() throws SQLException{
		
		String user = "OPS$RM70019";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String senha = "xxx";
		try{
			
			return DriverManager.getConnection(jdbcUrl,user,senha);
		}
		catch (SQLException e){
			e.printStackTrace();
			throw new SQLException("Erro ao abrir conexão com o banco");
		}
		
	}
	 
	
}
