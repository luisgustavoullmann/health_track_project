package br.com.healthtrack.db.dieta.dao;

import java.sql.*;
import java.util.*;


import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.jdbc.CompanyDBManager;

/*Classe DAO da classe Dieta - CRUD
 * @author Luis Gustavo Ullmann
 * @version 1.5 
 * */

public class DbDietaDAO implements DietaDAO {
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(Dieta dieta) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_DIETA(CD_DIETA, NM_ALIMENTO, QTD_CALORIA, DS_TIPO, QTD_PADRAOCALORIA, DT_DATA)"
					+ "VALUES (SQ_DIETA.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dieta.getCdDieta());
			stmt.setString(2, dieta.getNomeAlimento());
			stmt.setDouble(3, dieta.getCaloria());
			stmt.setString(4, dieta.getTipo());
			stmt.setDouble(5, dieta.getPadraoCaloria());
			java.sql.Date data = new java.sql.Date(dieta.getData().getTimeInMillis());
			stmt.setDate(6, data);
			
			stmt.executeUpdate();
			
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
	public List<Dieta> getAll() {
		//Cria uma lista de alimentos
		List<Dieta> lista = new ArrayList<Dieta>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {			
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA");
			rs = stmt.executeQuery();
			
			//Precorre todos os registros encontrados
			while (rs.next()) {
				int code = rs.getInt("CD_DIETA");
				String name = rs.getString("NM_ALIMENTO");
				double caloria = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("QTD_PADRAOCALORIA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataDieta = Calendar.getInstance();
				dataDieta.setTimeInMillis(data.getTime());
				
				//Instancia new Object Dieta com as informações encontradas
				Dieta dieta = new Dieta(code, name, caloria, type, padcaloria, dataDieta);
												
				//Add a dieta a lista
				lista.add(dieta);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch(SQLException e){
				e.printStackTrace();
				}
			}
			return getAll();
		}

	
	//UPDATE
	@Override
	public void atualizar(Dieta dieta) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_DIETA SET NM_ALIMENTO = ?, QTD_CALORIA = ?, DS_TIPO = ?, QTD_PADRAOCALORIA = ?, DT_DATA = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, dieta.getNomeAlimento());
			stmt.setDouble(2, dieta.getCaloria());
			stmt.setString(3, dieta.getTipo());
			stmt.setDouble(4, dieta.getPadraoCaloria());
			java.sql.Date data = new java.sql.Date(dieta.getData().getTimeInMillis());
			stmt.setDate(5, data);
			
			stmt.executeUpdate();
			
			conexao.commit();
		} catch(SQLException e) {
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
	}
	
	
	
	//REMOVE
	@Override
	public void remover(int codigo) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "DELETE FROM T_DIETA WHERE CD_DIETA = ?";
			
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//SEARCH por nome do alimento e CD_DIETA
	@Override
	public Dieta searchName (int code) {
		Dieta dieta = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA WHERE CD_DIETA = ?");
			stmt.setInt(1, code);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code1 = rs.getInt("CD_DIETA");
				String name = rs.getString("NM_ALIMENTO");
				double caloria = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("QTD_PADRAOCALORIA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataDieta = Calendar.getInstance();
				dataDieta.setTimeInMillis(data.getTime());
				
				dieta = new Dieta(code1, name, caloria, type, padcaloria, dataDieta);
				
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
		return dieta;
	}
}//done here
