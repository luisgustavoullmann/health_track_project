package br.com.healthtrack.oracle.dieta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.jdbc.CompanyDBManager;

/*Classe DAO da classe Dieta - CRUD
 * @author Luis Gustavo Ullmann
 * @version 1.2 
 * */

public class OracleDietaDAO {
	private Connection conexao;
	
	//CREATE
	public void cadastrar(Dieta dieta) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_DIETA(CD_USUARIO, NM_ALIMENTO, QTD_CALORIA, DS_TIPO, DS_CALORIA)"
					+ "VALUES (SQ_DIETA.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dieta.getCdUsuario());
			stmt.setString(2, dieta.getNomeAlimento());
			stmt.setDouble(3, dieta.getCaloria());
			stmt.setString(4, dieta.getTipo());
			stmt.setDouble(5, dieta.getPadraoCaloria());
			
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
	
	
	
	public List<Dieta> getAll(){
		//Cria uma lista de alimentos
		//List<Dieta> lista = new ArrayList<Dieta>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA");
			rs = stmt.executeQuery();
			
			//Precorre todos os registros encontrados
			while (rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_ALIMENTO");
				double caloria1 = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("DS_CALORIA");
				
				//Instancia new Object Dieta com as informações encontradas
				//Dieta dieta = new Dieta();
								
				//Add a dieta a lista
				//lista.add(dieta);
				
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
			//return getAll();
		}

	
	//UPDATE
	public void atualizar(Dieta dieta) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "UPDATE T_DIETA SET NM_ALIMENTO = ?, QTD_CALORIA = ?, DS_TIPO = ?, DS_CALORIA = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dieta.getCdUsuario());
			stmt.setString(2, dieta.getNomeAlimento());
			stmt.setDouble(3, dieta.getCaloria());
			stmt.setString(4, dieta.getTipo());
			stmt.setDouble(5, dieta.getPadraoCaloria());
			
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
	public void remover(int codigo) {
		PreparedStatement stmt = null;
		
		try {
			
			conexao = CompanyDBManager.obterConexao();
			String sql = "DELETE FROM T_DIETA WHERE CD_USUARIO = ?";
			
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
	
	//SEARCH por nome do alimento e CD_USUARIO
	public Dieta searchName (String nome, int code) {
		Dieta dieta = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_DIETA WHERE NM_ALIMENTO = ?, CD_USUARIO = ?");
			stmt.setString(1, nome);
			stmt.setInt(2, code);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code1 = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_ALIMENTO");
				double caloria1 = rs.getInt("QTD_CALORIA");
				String type = rs.getString("DS_TIPO");
				double padcaloria = rs.getDouble("DS_CALORIA");
				
				//dieta = new Dieta(int code1, String name, double caloria1, String type, double padcaloria);
				
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
