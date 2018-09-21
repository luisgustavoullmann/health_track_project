package br.com.healthtrack.db.peso.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.jdbc.CompanyDBManager;
import br.com.healthtrack.peso.Peso;

public class DbPesoDAO implements PesoDAO {
	private Connection conexao;
	
	/*
	 *INSERT Peso
	 */
	@Override
	public void cadastrar(Peso peso) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_PESO(CD_PESO, NR_PESO, NR_ALTURA, DT_DATA)"
					+ "VALUES (SQ_PESO.NEXTVAL ?, ?, ?, ?)";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, peso.getCdPeso());
			stmt.setFloat(2, peso.getPeso());
			stmt.setFloat(3, peso.getAltura());
			java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
			stmt.setDate(4, data);
			
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
	}
	
	@Override
	public List<Peso> listar(){
		//Cria uma lista de pesos
		List<Peso> lista = new ArrayList<Peso>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_PESO");
			rs = stmt.executeQuery();
			
			//Percorre todos os pesos registrados encontrados
			while(rs.next()) {
				int cdPeso = rs.getInt("CD_PESO");
				float ps = rs.getFloat("NR_PESO");
				float altura = rs.getFloat("NR_ALTURA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataPeso = Calendar.getInstance();
				dataPeso.setTimeInMillis(data.getTime());
				
				/*
				 * Create an object Peso with all informations 
				 */
				Peso peso = new Peso(cdPeso, ps, altura, dataPeso);
				//add lista
				lista.add(peso);
			}
			
		} catch (SQLException e) {
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
		return lista;
	}
	
	/*
	 *UPDATE Peso 
	 */
	@Override
	public void atualizar(Peso peso) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "UPDATE T_PESO SET NR_PESO = ?, NR_ALTURA = ?, DT_DATA = ? WHERE CD_PESO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setFloat(1, peso.getPeso());
			stmt.setFloat(2, peso.getAltura());
			java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
			stmt.setDate(3, data);
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		} try {
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 *DELETE Peso 
	 */
	@Override
	public void remover(int code) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "DELETE FROM T_PESO WHERE CD_PESO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, code);
			stmt.executeUpdate();
		} catch (SQLException e) {
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
	
	/*
	 * @param Search with ID
	 */
	@Override
	public Peso searchId(int codeSearch) {
		Peso peso = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_PESO WHERE CD_PESO = ?");
			stmt.setInt(1, codeSearch);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int cdPeso = rs.getInt("CD_PESO");
				float ps = rs.getFloat("NR_PESO");
				float altura = rs.getFloat("NR_ALTURA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataPeso = Calendar.getInstance();
				dataPeso.setTimeInMillis(data.getTime());
				
				peso = new Peso(cdPeso, ps, altura, dataPeso);
				
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
		
		return peso;
	}
	
}//done here
