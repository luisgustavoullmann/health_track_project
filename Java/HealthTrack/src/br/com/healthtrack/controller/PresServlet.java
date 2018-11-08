package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.bean.PresArterial;
import br.com.healthtrack.dao.PresArtDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class PresServlet
 */
@WebServlet("/pressao")
public class PresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private PresArtDAO presDAO;
    
	@Override
	public void init() throws ServletException{
		super.init();
		presDAO = DAOFactory.getPresArtDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			Double dadoMax = Double.parseDouble(request.getParameter("max"));
			Double dadoMin = Double.parseDouble(request.getParameter("min"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar data = Calendar.getInstance();
			data.setTime(format.parse(request.getParameter("datapressao")));
			Double padraoMax = Double.parseDouble(request.getParameter("padraomax"));
			Double padraoMin = Double.parseDouble(request.getParameter("padraomin"));
			
			PresArterial pressao = new PresArterial(0, dadoMax, dadoMin, data, padraoMax, padraoMin);
			presDAO.cadastrar(pressao);
			
			request.setAttribute("msg", "Parabéns, você cadastrou uma nova medida de pressão arterial!");	
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar nova pressão arterial!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
