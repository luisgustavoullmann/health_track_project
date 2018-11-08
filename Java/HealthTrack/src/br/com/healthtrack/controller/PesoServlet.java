package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.bean.Peso;
import br.com.healthtrack.dao.PesoDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class PesoServlet
 */
@WebServlet("/peso")
public class PesoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	private PesoDAO pesoDAO;
	
	@Override
	public void init() throws ServletException{
		super.init();
		pesoDAO = DAOFactory.getPesoDAO();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataPeso = Calendar.getInstance();
			dataPeso.setTime(format.parse(request.getParameter("datapeso")));
			float altura = Float.parseFloat(request.getParameter("altura"));
			float peso = Float.parseFloat(request.getParameter("peso"));
			float padraoPeso = Float.parseFloat(request.getParameter("padraopeso"));
			
			Peso pesagem = new Peso(0, peso, altura, dataPeso, padraoPeso);
			pesoDAO.cadastrar(pesagem);
			
			request.setAttribute("msg", "Pesagem cadastrada!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar a pesagem!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados!");
		}
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}
}
