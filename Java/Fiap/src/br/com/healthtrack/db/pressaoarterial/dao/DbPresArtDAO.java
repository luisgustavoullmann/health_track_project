package br.com.healthtrack.db.pressaoarterial.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.jdbc.CompanyDBManager;
import br.com.healthtrack.pressaoarterial.PresArterial;

public class DbPresArtDAO implements PresArtDAO {
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(PresArterial presart) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_PRESARTERIAL(CD_PRES_ART, NR_DADO, DT_DATA, DS_PADRAO)"
					+ "VALUES(SQ_PRESART.NEXTVAL, ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')), ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, presart.getCdUsuario());
			stmt.setDouble(2, presart.getDado());
			java.sql.Date data = new java.sql.Date(presart.getData().getTimeInMillis());
			stmt.setDate(3, data);
			stmt.setDouble(4, presart.getPadraoPres());
			
			stmt.executeUpdate();
			
			conexao.commit();
		} catch (SQLException e) {
			conexao.rollback();
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public List<PresArterial> getAll(){
		//Cria uma lista de pressões auferidas
		List<PresArterial> lista = new ArrayList<PresArterial>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_PRESARTERIAL");
			rs = stmt.executeQuery();
			
			//Percorre a lista inteira
			while(rs.next()) {
				int code = rs.getInt("CD_PRES_ART");
				double dado = rs.getDouble("NR_DADO");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataPres = Calendar.getInstance();
				dataPres.setTimeInMillis(data.getTime());
				double padrao = rs.getDouble("DS_PADRAO");
				
				//Cria um objeto Pressao
				PresArterial presart = new PresArterial(code, dado, dataPres, padrao);
				//Adiciona o dado na lista
				lista.add(presart);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return getAll();
	}//
	
	
	//UPDATE
	@Override
	public void atualizar(PresArterial presart) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_PRESARTERIAL SET  NR_DADO = ?, DT_DATA = TO_DATE(('??/??/????'),('DD/MM/YYYY')), DS_PADRAO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setDouble(1, presart.getDado());
			java.sql.Date data = new java.sql.Date(presart.getData().getTimeInMillis());
			stmt.setDate(2, data);
			stmt.setDouble(3, presart.getPadraoPres());
			
			stmt.executeUpdate();
			
			conexao.commit();
		} catch (SQLException e) {
			conexao.rollback();
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}	
	}//
	
	
	//Remove
	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "DELETE FROM T_PRESARTERIAL WHERE CD_PRES_ART = ?"; 
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.executeUpdate();
			
			conexao.commit();
		} catch (SQLException e) {
			conexao.rollback();
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}//
	
	
	//SEARCH
	@Override
	public PresArterial searchId(int codeSearch) {
		PresArterial presart = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		 try {
			 conexao = CompanyDBManager.getInstance().obterConexao();
			 stmt = conexao.prepareStatement("SELECT * FROM T_PRESARTERIAL WHERE CD_PRES_ART = ?");
			 stmt.setInt(1, codeSearch);
			 rs = stmt.executeQuery();
			 
			 if (rs.next()) {
				 int code = rs.getInt("CD_PRES_ART");
				 double dado = rs.getDouble("NR_DADO");
				 java.sql.Date data = rs.getDate("DT_DATA");
				 Calendar dataPres = Calendar.getInstance();
				 dataPres.setTimeInMillis(data.getTime());
				 double padrao = rs.getDouble("DS_PADRAO");
				 
				 presart = new PresArterial(code, dado, dataPres, padrao);
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
		 return presart;
	}//

}//done here
