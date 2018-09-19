package br.com.healthtrack.db.exercicio.dao;

import java.util.*;

import br.com.healthtrack.exercicio.Exercicio;
import br.com.healthtrack.jdbc.CompanyDBManager;

import java.sql.*;

public class DbExercicioDAO implements ExercicioDAO {
	private Connection conexao;
	
	/*
	 *INSERT 
	 */
	public void cadastrar(Exercicio excercicio) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_EXERCICIO"
		}
	}
	 
	
}//done here
