package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

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
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		switch(acao) {
		case "lista":
			List<PresArterial> lista = presDAO.getAll();
			request.setAttribute("pressao", lista);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
			break;
		case "abrir-form-edicao":
			int id = Integer.parseInt(request.getParameter("codigo"));
			PresArterial pressao = presDAO.searchId(id);
			request.setAttribute("pressao", pressao);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
			break;
		}
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
			
			request.setAttribute("msg", "Parab�ns, voc� cadastrou uma nova medida de press�o arterial!");	
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar nova press�o arterial!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
