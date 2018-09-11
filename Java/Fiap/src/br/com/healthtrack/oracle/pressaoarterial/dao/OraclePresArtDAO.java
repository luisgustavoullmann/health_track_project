package br.com.healthtrack.oracle.pressaoarterial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.health.pressaoarterial.PresArterial;
import br.com.healthtrack.jdbc.CompanyDBManager;

public class OraclePresArtDAO {
	private Connection conexao;
	
	public void cadastrar(PresArterial presart) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_PRESARTERIAL(CD_USUARIO, NR_DADO, DT_DATA, DS_PADRAO)"
					+ "VALUES(SQ_PRESART.NEXTVAL, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, presart.getCdUsuario());
			stmt.setDouble(2, presart.getDado());
			java.sql.Date data = new java.sql.Date(presart.getData().getTime());
			stmt.setDate(3, data);
			stmt.setDouble(4, presart.getPadraoPres());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
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
	
	public List<PresArterial> getAll(){
		//Cria uma lista de pressões auferidas
		//List<PresArterial> lista = new ArrayList<PresArterial>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_PRESARTERIAL");
			rs = stmt.executeQuery();
			
			//Percorre a lista inteira
			while(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				double dado = rs.getDouble("NR_DADO");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataPres = Calendar.getInstance();
				dataPres.setTimeInMillis(data.getTime());
				double padrao = rs.getDouble("DS_PADRAO");
				
				//Cria um objeto Pressao
				//PresArterial presart = new PresArterial(code, dado, data, padrao);
				//Adiciona o dado na lista
				//lista.add(presart);
			
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
		//return getAll();
	}//
	
	
	//UPDATE
	public void atualizar(PresArterial presart) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "UPDATE T_PRESARTERIAL SET  NR_DADO = ?, DT_DATA = ?, DS_PADRAO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setDouble(1, presart.getDado());
			java.sql.Date data = new java.sql.Date(presart.getData().getTime());
			stmt.setDate(2, data);
			stmt.setDouble(3, presart.getPadraoPres());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
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
	public void remover(int codigo) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "DELETE FROM T_PRESARTERIAL WHERE CD_USUARIO = ?"; 
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.executeUpdate();
		} catch (SQLException e) {
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
	public PresArterial searchId(int codeSearch) {
		PresArterial presart = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		 try {
			 conexao = CompanyDBManager.obterConexao();
			 stmt = conexao.prepareStatement("SELECT * FROM T_PRESARTERIAL WHERE CD_USUARIO = ?");
			 stmt.setInt(1, codeSearch);
			 rs = stmt.executeQuery();
			 
			 if (rs.next()) {
				 int code = rs.getInt("CD_USUARIO");
				 double dado = rs.getDouble("NR_DADO");
				 java.sql.Date data = rs.getDate("DT_DATA");
				 Calendar dataPres = Calendar.getInstance();
				 dataPres.setTimeInMillis(data.getTime());
				 double padrao = rs.getDouble("DS_PADRAO");
				 
				 //prestart = new PresArterial(int code, double dado, Calendar dataPres, double padrao);
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
