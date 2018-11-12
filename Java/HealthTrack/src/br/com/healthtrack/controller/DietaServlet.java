package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "lista":
			listar(request, response);
		break;
		case "abrir-form-edicao":
			int id = Integer.parseInt(request.getParameter("codigo"));
			Dieta dieta = dietaDAO.searchId(id);
			request.setAttribute("dieta", dieta);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		break;
		
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Dieta> lista = dietaDAO.getAll();
		request.setAttribute("dieta", lista);
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch (acao){
			case "cadastrar":
				cadastrar(request, response);
				break;
			case "editar":
				editar(request, response);
				break;
		}
		
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
	
	
	
	private void editar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String nome = request.getParameter("alimento");
			String tipo = request.getParameter("tipo");
			Calendar horario = Calendar.getInstance();
			horario.setTimeInMillis(Integer.parseInt(request.getParameter("horario")));
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataDieta = Calendar.getInstance();
			dataDieta.setTime(format.parse(request.getParameter("dataDieta")));
			double caloria = Double.parseDouble(request.getParameter("caloria"));
			double padraocaloria = Double.parseDouble(request.getParameter("padraocaloria"));
			
			
			Dieta dieta = new Dieta(codigo, nome, caloria, tipo, padraocaloria, dataDieta, horario);
			dietaDAO.atualizar(dieta);
			
			request.setAttribute("msg", "Dieta atualizada com sucesso!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar nova dieta!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		listar(request, response);
	}
}
