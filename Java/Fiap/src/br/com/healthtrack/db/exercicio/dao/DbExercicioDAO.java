package br.com.healthtrack.db.exercicio.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.exercicio.Exercicio;
import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;
import br.com.healthtrack.jdbc.CompanyDBManager;


/*Classe DAO da classe Exercicio - CRUD
 * @author Luis Gustavo Ullmann
 * @version 1.3
 * */
public class DbExercicioDAO<T extends Exercicio> implements ExercicioDAO {
	public Class<T> tipo;
	
	public DbExercicioDAO(Class<T> tipo) {
		this.tipo = tipo;
	}
	
	private Connection conexao;
	
	
	
	/*
	 *INSERT 
	 */
	@Override
	public void cadastrar(ExercicioOutdoor excercicio) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_EXERCICIO(CD_EXERCICIO, NM_TIPO, DT_DATA"
					+ "NR_KM, QTD_TEMPO, NR_PADRAOKM, QTD_PADRAOTEMPO) "
					+ "VALUES(SQ_EXERCICIO.NEXTVAL ?, ?, ?, ?, ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')))";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, Exercicio.class.getName().equals(excercicio));
			
			conexao.commit();
		} catch (SQLException e) {
			conexao.rollback();
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public <T> List<T> getAll(){
	
		
		
		return getAll();
	}
	 
	
}//done here
