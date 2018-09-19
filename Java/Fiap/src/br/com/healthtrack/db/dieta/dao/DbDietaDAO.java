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
	public void cadastrar(Dieta dieta) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
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
	
	
	@Override
	public List<Dieta> getAll(){
		//Cria uma lista de alimentos
		List<Dieta> lista = new ArrayList<Dieta>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA");
			rs = stmt.executeQuery();
			
			//Precorre todos os registros encontrados
			while (rs.next()) {
				int code = rs.getInt("CD_DIETA");
				String name = rs.getString("NM_ALIMENTO");
				double caloria1 = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("QTD_PADRAOCALORIA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataDieta = Calendar.getInstance();
				dataDieta.setTimeInMillis(data.getTime());
				
				//Instancia new Object Dieta com as informações encontradas
				Dieta dieta = new Dieta(code, name, caloria1, type, padcaloria, dataDieta);
												
				//Add a dieta a lista
				lista.add(dieta);
				
				//Loop
				for(int i = 0; i < lista.size(); i++) {
					Dieta di = lista.get(i);
					System.out.println(di.getTipo());
					System.out.println(di.getCaloria());
					System.out.println(di.getNomeAlimento());
					System.out.println(di.getPadraoCaloria());
					System.out.println(di.getData());
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch(SQLException e){
				e.printStackTrace();
				}
			}
			return getAll();
		}

	
	//UPDATE
	@Override
	public void atualizar(Dieta dieta) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "UPDATE T_DIETA SET NM_ALIMENTO = ?, QTD_CALORIA = ?, DS_TIPO = ?, QTD_PADRAOCALORIA = ?, DT_DATA = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dieta.getCdDieta());
			stmt.setString(2, dieta.getNomeAlimento());
			stmt.setDouble(3, dieta.getCaloria());
			stmt.setString(4, dieta.getTipo());
			stmt.setDouble(5, dieta.getPadraoCaloria());
			java.sql.Date data = new java.sql.Date(dieta.getData().getTimeInMillis());
			stmt.setDate(6, data);
			
			stmt.executeUpdate();
					
		} catch(SQLException e) {
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
	public void remover(int codigo) {
		PreparedStatement stmt = null;
		
		try {
			
			conexao = CompanyDBManager.obterConexao();
			String sql = "DELETE FROM T_DIETA WHERE CD_DIETA = ?";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
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
	
	//SEARCH por nome do alimento e CD_DIETA
	@Override
	public Dieta searchName (String nome, int code) {
		Dieta dieta = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA WHERE NM_ALIMENTO = ?, CD_DIETA = ?");
			stmt.setString(1, nome);
			stmt.setInt(2, code);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code1 = rs.getInt("CD_DIETA");
				String name = rs.getString("NM_ALIMENTO");
				double caloria1 = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("QTD_PADRAOCALORIA");
				java.sql.Date data = rs.getDate("DT_DATA");
				Calendar dataDieta = Calendar.getInstance();
				dataDieta.setTimeInMillis(data.getTime());
				
				dieta = new Dieta(int code1, String name, double caloria1, String type, double padcaloria);
				
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
