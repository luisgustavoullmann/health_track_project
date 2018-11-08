package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.bean.Endereco;
import br.com.healthtrack.bean.Usuario;
import br.com.healthtrack.dao.EnderecoDAO;
import br.com.healthtrack.dao.UserDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private UserDAO userDAO;
	private EnderecoDAO enderecoDAO;
	
	@Override
	public void init() throws ServletException {
		super.init();
		userDAO = DAOFactory.getUserDAO();
		enderecoDAO = DAOFactory.getEnderecoDAO();
	}
       
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("name");
			String sobrenome = request.getParameter("lastname");
			String email = request.getParameter("email");
			String tel = request.getParameter("telefone");
			String cpf = request.getParameter("cpf");
			String sexo = request.getParameter("sexo");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
			Calendar nascimento = Calendar.getInstance();
			nascimento.setTime(format.parse(request.getParameter("nascimento")));
			String password = request.getParameter("password");
			//Endereco
			String nmLogradouro = request.getParameter("endereco");
			String cidade = request.getParameter("city");
			String cep = request.getParameter("cep");
			String bairro = request.getParameter("bairro");
			String estado = request.getParameter("estado");
			String pais = request.getParameter("pais");
			int numero = Integer.parseInt("numero");
			
			
			Usuario user = new Usuario(0, nome, sobrenome, email, tel, cpf, sexo, password, nascimento, password);
			Endereco endereco = new Endereco(0, nmLogradouro, cep, bairro, cidade, estado, pais, numero);
			userDAO.cadastrar(user);
			enderecoDAO.cadastrar(endereco);
			
			request.setAttribute("msg", "Usuário cadastrado!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar!");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
