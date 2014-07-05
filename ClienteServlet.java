import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.beans.Cliente;
import projeto.dao.ClienteDAO;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet") 


public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClienteDAO cliDAO = new ClienteDAO();
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String nome = request.getParameter("nome"); 
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		try {
			cliDAO.inserir(cliente); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
