package br.com.healthtrack.db.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.bean.Exercicio;
import br.com.healthtrack.dao.ExercicioDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.singleton.CompanyDBManager;


/*Classe DAO da classe Exercicio - CRUD
 * @author Luis Gustavo Ullmann
 * @version 1.8
 * */
public class OracleExercicioDAO implements ExercicioDAO {
	
	private Connection conexao;
	
	@Override
	public void cadastrar(Exercicio ex) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			
			String sql = "INSERT INTO T_EXERCICIO(CD_EXERCICIO,"
					+ " NM_MOD,"
					+ " DT_DATA,"
					+ " NR_KM,"
					+ "NR_PADRAOKM,"
					+ "QTD_TEMPO,"
					+ "QTD_PADRAOTEMPO"
					+ "VALUES (SQ_EXERCICIO.NEXTVAL, ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')), ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')), TO_DATE(('??/??/????'),('DD/MM/YYYY')))";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, ex.getModalidade());
			java.sql.Date data = new  java.sql.Date(ex.getData().getTimeInMillis());
			stmt.setDate(3, data);
			stmt.setDouble(4, ex.getKm());
			stmt.setDouble(5, ex.getPadraoKm());
			java.sql.Date dataTempo = new  java.sql.Date(ex.getTempo().getTimeInMillis());
			stmt.setDate(6, dataTempo);
			java.sql.Date dataPadTempo = new  java.sql.Date(ex.getPadraoTempo().getTimeInMillis());
			stmt.setDate(7, dataPadTempo);
			
			stmt.executeUpdate();
			
			conexao.commit();
		} catch (SQLException e) {
			//conexao.rollback();
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	@Override
	public List<Exercicio> getAll() {
		//Cria uma lista de exercicio para ser consultada
		List<Exercicio> lista = new ArrayList<Exercicio>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_EXERCICIO");
			
			rs = stmt.executeQuery();
			
			//Percorre todos os registros
			while(rs.next()) {
				int code = rs.getInt("CD_EXERCICIO");
				String mod = rs.getString("NM_MOD");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataExercicio = Calendar.getInstance();
				dataExercicio.setTimeInMillis(data.getTime());
				double km = rs.getDouble("NR_KM");
				double padKm = rs.getDouble("NR_PADRAOKM");
				java.sql.Date dataT = rs.getDate("QTD_TEMPO");
				Calendar dataTempo = Calendar.getInstance();
				dataTempo.setTimeInMillis(dataT.getTime());
				java.sql.Date dataPadTempo = rs.getDate("QTD_PADRAOTEMPO");
				Calendar dataPaTempo = Calendar.getInstance();
				dataPaTempo.setTimeInMillis(dataPadTempo.getTime());
				
				Exercicio exercicio = new Exercicio(code, mod, dataExercicio,
						km, padKm, dataTempo, dataPaTempo);
				lista.add(exercicio);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return getAll();
	}
	
	
	@Override
	public void atualizar(Exercicio ex) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_EXERCICIO SET "
					+ " NM_MOD = ?,"
					+ " DT_DATA = TO_DATE(('??/??/????'),('DD/MM/YYYY')),"
					+ " NR_KM = ?,"
					+ "NR_PADRAOKM = ?,"
					+ "QTD_TEMPO = TO_DATE(('??/??/????'),('DD/MM/YYYY')),"
					+ "QTD_PADRAOTEMPO = TO_DATE(('??/??/????'),('DD/MM/YYYY')) WHERE CD_EXERCICIO = ?";
					
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, ex.getModalidade());
			java.sql.Date data = new  java.sql.Date(ex.getData().getTimeInMillis());
			stmt.setDate(3, data);
			stmt.setDouble(4, ex.getKm());
			stmt.setDouble(5, ex.getPadraoKm());
			java.sql.Date dataTempo = new  java.sql.Date(ex.getTempo().getTimeInMillis());
			stmt.setDate(6, dataTempo);
			java.sql.Date dataPadTempo = new  java.sql.Date(ex.getPadraoTempo().getTimeInMillis());
			stmt.setDate(7, dataPadTempo);
			
			
			conexao.commit();
		} catch(SQLException e) {
			//conexao.rollback();
			e.printStackTrace();
			throw new DBException("Erro ao atualizar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void remover(int code) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "DELETE FROM T_EXERCICIO WHERE CD_EXERCICIO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, code);
			
			stmt.executeUpdate();
			conexao.commit();
		} catch(SQLException e) {
			//conexao.rollback();
			e.printStackTrace();
			throw new DBException("Erro ao remover.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	@Override
	public Exercicio searchId (int id) {
		Exercicio ex = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_EXERCICIO WHERE CD_EXERCICIO = ?");
			
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code = rs.getInt("CD_EXERCICIO");
				String mod = rs.getString("NM_MOD");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataExercicio = Calendar.getInstance();
				dataExercicio.setTimeInMillis(data.getTime());
				double km = rs.getDouble("NR_KM");
				double padKm = rs.getDouble("NR_PADRAOKM");
				java.sql.Date dataT = rs.getDate("QTD_TEMPO");
				Calendar dataTempo = Calendar.getInstance();
				dataTempo.setTimeInMillis(dataT.getTime());
				java.sql.Date dataPadTempo = rs.getDate("QTD_PADRAOTEMPO");
				Calendar dataPaTempo = Calendar.getInstance();
				dataPaTempo.setTimeInMillis(dataPadTempo.getTime());
				
				ex = new Exercicio(code, mod, dataExercicio,
						km, padKm, dataTempo, dataPaTempo);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ex;
	}
	
}//done here
