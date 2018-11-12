package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		switch (acao) {
		case "lista":
			listar(request, response);
			break;
		case "abrir-form-edicao":
			int id = Integer.parseInt(request.getParameter("codigo"));
			Peso peso = pesoDAO.searchId(id);
			request.setAttribute("peso", peso);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
			break;
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Peso> lista = pesoDAO.getALl();
		request.setAttribute("peso", lista);
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "acao":
			cadastrar(request, response);
			break;
		case "editar":
			editar(request, response);
			break;
		case "excluir":
			excluir(request, response);
			break;
		}
	}

	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataPeso = Calendar.getInstance();
			dataPeso.setTime(format.parse(request.getParameter("datapeso")));
			float altura = Float.parseFloat(request.getParameter("altura"));
			float peso = Float.parseFloat(request.getParameter("peso"));
			float padraoPeso = Float.parseFloat(request.getParameter("padraopeso"));
			
			Peso pesagem = new Peso(codigo, peso, altura, dataPeso, padraoPeso);
			pesoDAO.atualizar(pesagem);
			
			request.setAttribute("msg", "Pesagem atualizada!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar a pesagem!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados!");
		}
		listar(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
	
	private void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		try {
			pesoDAO.remover(codigo);
			request.setAttribute("msg", "Pesagem removida!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao remover a pesagem!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados!");
		}
		listar(request, response);
	}
}
