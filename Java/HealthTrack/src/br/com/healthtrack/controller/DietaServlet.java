package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.bean.Dieta;
import br.com.healthtrack.dao.DietaDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class DietaServlet
 */
@WebServlet("/dieta")
public class DietaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private DietaDAO dietaDAO;

	public void init() throws ServletException{
		super.init();
		dietaDAO = DAOFactory.getDietaDAO();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String nome = request.getParameter("alimento");
			String tipo = request.getParameter("tipo");
			Calendar horario = Calendar.getInstance();
			horario.setTimeInMillis(Integer.parseInt(request.getParameter("horario")));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataDieta = Calendar.getInstance();
			dataDieta.setTime(format.parse(request.getParameter("dataDieta")));
			double caloria = Double.parseDouble(request.getParameter("caloria"));
			double padraocaloria = Double.parseDouble(request.getParameter("padraocaloria"));
			
			
			Dieta dieta = new Dieta(0, nome, caloria, tipo, padraocaloria, dataDieta, horario);
			dietaDAO.cadastrar(dieta);
			
			request.setAttribute("msg", "Dieta cadastrar com sucesso!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar nova dieta!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
