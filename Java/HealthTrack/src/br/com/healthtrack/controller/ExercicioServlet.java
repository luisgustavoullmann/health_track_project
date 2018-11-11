package br.com.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.healthtrack.bean.Exercicio;
import br.com.healthtrack.dao.ExercicioDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;

/**
 * Servlet implementation class ExercicioServlet
 */
@WebServlet("/exercicio")
public class ExercicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private ExercicioDAO exercicioDAO;
    
	@Override
	public void init() throws ServletException {
		super.init();
		exercicioDAO = DAOFactory.getExercicioDAO();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Exercicio> lista = exercicioDAO.getAll();
		request.setAttribute("exercicio", lista);
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String modalidade = request.getParameter("exercicio");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar data = Calendar.getInstance();
			data.setTime(format.parse(request.getParameter("dataexercicio")));
			Calendar tempo = Calendar.getInstance();
			tempo.setTimeInMillis(Integer.parseInt(request.getParameter("tempo")));
			Calendar padraotempo = Calendar.getInstance();
			padraotempo.setTimeInMillis(Integer.parseInt(request.getParameter("padraotempo")));
			double km = Double.parseDouble(request.getParameter("km"));
			double padraokm = Double.parseDouble(request.getParameter("padraokm"));
			
			Exercicio exercicio = new Exercicio(0, modalidade, data, km, padraokm, tempo, padraotempo);
			
			exercicioDAO.cadastrar(exercicio);
			
			request.setAttribute("msg", "Exerc�cio cadastrado com sucesso!");
		} catch(DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro, exerc�cio n�o cadastrado!");
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
