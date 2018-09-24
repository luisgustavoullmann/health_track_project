package br.com.healthtrack.db.exercicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.healthtrack.exercicio.Exercicio;
import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;
import br.com.healthtrack.jdbc.CompanyDBManager;
/*Classe DAO da classe Exericio - CRUD
 * @author Luis Gustavo Ullmann
 * @version 1.2
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
	public void cadastrar(ExercicioOutdoor excercicio) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_EXERCICIO(CD_EXERCICIO, NM_TIPO, DT_DATA"
					+ "NR_KM, QTD_TEMPO, NR_PADRAOKM, QTD_PADRAOTEMPO) "
					+ "VALUES(SQ_EXERCICIO.NEXTVAL ?, ?, ?, ?, ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')))";
			stmt = conexao.prepareStatement(sql);
			
			
			conexao.commit();
		} catch () {
			
		}
	}
	 
	
}//done here
