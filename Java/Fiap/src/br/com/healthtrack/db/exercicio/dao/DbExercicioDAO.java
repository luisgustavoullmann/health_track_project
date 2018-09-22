package br.com.healthtrack.db.exercicio.dao;

import java.util.*;

import br.com.healthtrack.exercicio.Exercicio;
import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;
import br.com.healthtrack.jdbc.CompanyDBManager;

import java.sql.*;

public class DbExercicioDAO implements ExercicioDAO {
	private Connection conexao;
	
	/*
	 *INSERT 
	 */
	public void cadastrar(ExercicioOutdoor excercicio) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_EXERCICIO(CD_EXERCICIO, NM_TIPO, DT_DATA"
					+ "NR_KM, QTD_TEMPO, NR_PADRAOKM, QTD_PADRAOTEMPO) "
					+ "VALUES(SQ_EXERCICIO.NEXTVAL ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, );
		}
	}
	 
	
}//done here
