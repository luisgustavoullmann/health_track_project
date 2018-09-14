package br.com.healthtrack.db.dieta.dao;

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
			String sql = "INSERT INTO T_DIETA(CD_DIETA, NM_ALIMENTO, QTD_CALORIA, DS_TIPO, DS_CALORIA)"
					+ "VALUES (SQ_DIETA.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dieta.getCdDieta());
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
				double padcaloria = rs.getDouble("DS_CALORIA");
				
				//Instancia new Object Dieta com as informações encontradas
				Dieta dieta1 = new Dieta();
				dieta1.setTipo("Sobremesa");
				dieta1.setCaloria(200);
				dieta1.setNomeAlimento("Brigadeiro");
				dieta1.setPadraoCaloria(3000);
				
				Dieta dieta2 = new Dieta();
				dieta2.setTipo("Jantar");
				dieta2.setCaloria(750);
				dieta2.setNomeAlimento("Carne seca com aborora");
				dieta2.setPadraoCaloria(3000);
				
				Dieta dieta3 = new Dieta();
				dieta3.setTipo("Café da manhã");
				dieta3.setCaloria(400);
				dieta3.setNomeAlimento("Café com leite e misto quente");
				dieta3.setPadraoCaloria(3000);
				
				Dieta dieta4 = new Dieta();
				dieta4.setTipo("Almoço");
				dieta4.setCaloria(1200);
				dieta4.setNomeAlimento("Arroz, feijão, bifé com batata frita");
				dieta4.setPadraoCaloria(3000);
				
				Dieta dieta5 = new Dieta();
				dieta5.setTipo("Jantar");
				dieta5.setCaloria(854);
				dieta5.setNomeAlimento("Pizza");
				dieta5.setPadraoCaloria(3000);
				
				Dieta dieta6 = new Dieta();
				dieta6.setTipo("Sobremesa");
				dieta6.setCaloria(220);
				dieta6.setNomeAlimento("Torta alemã");
				dieta6.setPadraoCaloria(3000);
				
				Dieta dieta7 = new Dieta();
				dieta7.setTipo("Café da manhã");
				dieta7.setCaloria(200);
				dieta7.setNomeAlimento("Suco de laranja com pão de batata");
				dieta7.setPadraoCaloria(3000);
				
				Dieta dieta8 = new Dieta();
				dieta8.setTipo("Almoço");
				dieta8.setCaloria(1300);
				dieta8.setNomeAlimento("Lasanha");
				dieta8.setPadraoCaloria(3000);
				
				Dieta dieta9 = new Dieta();
				dieta9.setTipo("Lanche");
				dieta9.setCaloria(500);
				dieta9.setNomeAlimento("Salada");
				dieta9.setPadraoCaloria(3000);
				
				Dieta dieta10 = new Dieta();
				dieta10.setTipo("Jantar");
				dieta10.setCaloria(1000);
				dieta10.setNomeAlimento("Pizza");
				dieta10.setPadraoCaloria(3000);
								
				//Add a dieta a lista
				lista.add(dieta1);
				lista.add(dieta2);
				lista.add(dieta3);
				lista.add(dieta4);
				lista.add(dieta5);
				lista.add(dieta6);
				lista.add(dieta7);
				lista.add(dieta8);
				lista.add(dieta9);
				lista.add(dieta10);
				
				//Loop
				for(int i = 0; i < lista.size(); i++) {
					Dieta di = lista.get(i);
					System.out.println(di.getTipo());
					System.out.println(di.getCaloria());
					System.out.println(di.getNomeAlimento());
					System.out.println(di.getPadraoCaloria());
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
