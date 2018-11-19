package br.com.healthtrack.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.healthtrack.bean.Usuario;
import br.com.healthtrack.bo.EmailBO;
import br.com.healthtrack.dao.UserDAO;
import br.com.healthtrack.dbexception.EmailException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserDAO userDAO;
	private EmailBO bo;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        userDAO = DAOFactory.getUserDAO();
        bo = new EmailBO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario(email, password);
		
		if(userDAO.validarUsuario(usuario)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", email);
			Cookie cookie = new Cookie("user.login", email);
			response.addCookie(cookie);
			String mensagem = "Um login foi realizado.";
			
			try {
				bo.enviarEmail(email, "Login realizado", mensagem);
			} catch(EmailException e) {
				e.printStackTrace();
			}
		} else {
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
		}
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
