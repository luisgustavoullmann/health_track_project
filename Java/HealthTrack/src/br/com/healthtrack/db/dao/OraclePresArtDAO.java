package br.com.healthtrack.db.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.bean.PresArterial;
import br.com.healthtrack.dao.PresArtDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.singleton.CompanyDBManager;

public class OraclePresArtDAO implements PresArtDAO {
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(PresArterial presart) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_PRESARTERIAL(CD_PRES_ART, NR_DADOMAX, NR_DADOMIN, DT_DATA, DS_PADRAOMAX, DS_PADRAOMIN)"
					+ "VALUES(SQ_PRESART.NEXTVAL, ?, ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')), ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, presart.getCdUsuario());
			stmt.setDouble(2, presart.getDadoMax());
			stmt.setDouble(3, presart.getDadoMin());
			java.sql.Date data = new java.sql.Date(presart.getData().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setDouble(5, presart.getPadraoMaxPres());
			stmt.setDouble(6, presart.getPadraoMinPres());
			
			
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
			stmt = conexao.prepareStatement("SELECT * FROM T_PRESARTERIAL WHERE CD_PRES_ART = ?");
			rs = stmt.executeQuery();
			
			//Percorre a lista inteira
			while(rs.next()) {
				int code = rs.getInt("CD_PRES_ART");
				double dadoMax = rs.getDouble("NR_DADOMAX");
				double dadoMin = rs.getDouble("NR_DADOMIN");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataPres = Calendar.getInstance();
				dataPres.setTimeInMillis(data.getTime());
				double padraoMaxPres = rs.getDouble("DS_PADRAOMAX");
				double padraoMinPres = rs.getDouble("DS_PADRAOMIN");
				
				//Cria um objeto Pressao
				PresArterial presart = new PresArterial(code, dadoMax, dadoMin, dataPres, padraoMaxPres, padraoMinPres);
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
	public void atualizar(PresArterial presart) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_PRESARTERIAL SET  NR_DADOMAX = ?, NR_DADOMIN = ?, DT_DATA = TO_DATE(('??/??/????'),('DD/MM/YYYY')), DS_PADRAOMAX = ?, DS_PADRAOMIN = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, presart.getCdUsuario());
			stmt.setDouble(2, presart.getDadoMax());
			stmt.setDouble(3, presart.getDadoMin());
			java.sql.Date data = new java.sql.Date(presart.getData().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setDouble(5, presart.getPadraoMaxPres());
			stmt.setDouble(6, presart.getPadraoMinPres());
			
			stmt.executeUpdate();
			
			conexao.commit();
		} catch (SQLException e) {
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
	}//
	
	
	//Remove
	@Override
	public void remover(int codigo) throws DBException {
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
			//conexao.rollback();
			e.printStackTrace();
			throw new DBException("Erro ao remover.");
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
					double dadoMax = rs.getDouble("NR_DADOMAX");
					double dadoMin = rs.getDouble("NR_DADOMIN");
					java.sql.Date data = rs.getDate("DT_DATA");
					Calendar dataPres = Calendar.getInstance();
					dataPres.setTimeInMillis(data.getTime());
					double padraoMaxPres = rs.getDouble("DS_PADRAOMAX");
					double padraoMinPres = rs.getDouble("DS_PADRAOMIN");
				 
				 presart = new PresArterial(code, dadoMax, dadoMin, dataPres, padraoMaxPres, padraoMinPres);
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
