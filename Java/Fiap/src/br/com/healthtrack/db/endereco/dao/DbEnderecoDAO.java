package br.com.healthtrack.db.endereco.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.endereco.Endereco;
import br.com.healthtrack.jdbc.CompanyDBManager;

public class DbEnderecoDAO implements EnderecoDAO {
	private Connection conexao;
	
	@Override
	public void cadastrar(Endereco endereco) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_ENDERECO(CD_ENDERECO, DS_LOGRADOURO, NM_LOGRADOURO, "
					+ "NR_CEP, NM_BAIRRO, NM_CIDADE, NM_ESTADO, NM_PAIS, NR_ENDERECO)"
					+ " VALUES(SQ_ENDERECO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, endereco.getTipoLogradouro());
			stmt.setString(2, endereco.getLogradouro());
			stmt.setString(3, endereco.getCep());
			stmt.setString(4, endereco.getBairro());
			stmt.setString(5, endereco.getCidade());
			stmt.setString(6, endereco.getEstado());
			stmt.setString(7, endereco.getPais());
			stmt.setInt(8, endereco.getNumEnd());
			
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
	}
	
	@Override
	public List<Endereco> getAll() {
		//Cria uma lista de enderecos
		List<Endereco> lista = new ArrayList<Endereco>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_ENDERECO");
			
			rs = stmt.executeQuery();
			
			//Percorre todos os registros
			while(rs.next()) {
				int codigo = rs.getInt("CD_ENDERECO");
				String tipoLogradouro = rs.getString("DS_LOGRADOURO");
				String nmLogradouro = rs.getString("NM_LOGRADOURO");
				String cep = rs.getString("NR_CEP");
				String bairro = rs.getString("NM_BAIRRO");
				String cidade = rs.getString("NM_CIDADE");
				String estado = rs.getString("NM_ESTADO");
				String pais = rs.getString("NM_PAIS");
				int numero = rs.getInt("NR_ENDERECO"); 
				
				//Cria um objeto com as informações encontradas
				Endereco endereco = new Endereco(codigo, tipoLogradouro, nmLogradouro, cep, bairro, cidade, estado, pais, numero);
				//Add endereco a lista
				lista.add(endereco);
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
	public void atualizar(Endereco endereco) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_ENDERECO SET DS_LOGRADOURO = ?, NM_LOGRADOURO = ?, NR_CEP = ?, "
					+ "NM_BAIRRO = ?, NM_CIDADE = ?, NM_ESTADO = ?, NM_PAIS = ?, NR_ENDERECO = ? ";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, endereco.getTipoLogradouro());
			stmt.setString(2, endereco.getLogradouro());
			stmt.setString(3, endereco.getCep());
			stmt.setString(4, endereco.getBairro());
			stmt.setString(5, endereco.getCidade());
			stmt.setString(6, endereco.getEstado());
			stmt.setString(7, endereco.getPais());
			stmt.setInt(8, endereco.getNumEnd());
			
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
	}
	
	@Override
	public void remover(int code) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "DELETE FROM T_ENDERECO WHERE CD_ENDERECO = ?";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, code);
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
	}
	
	@Override
	public Endereco searchId(int code) {
		Endereco endereco = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_ENDERECO WHERE CD_ENDERECO = ?");
			stmt.setInt(1, code);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int codigo = rs.getInt("CD_ENDERECO");
				String tipoLogradouro = rs.getString("DS_LOGRADOURO");
				String nmLogradouro = rs.getString("NM_LOGRADOURO");
				String cep = rs.getString("NR_CEP");
				String bairro = rs.getString("NM_BAIRRO");
				String cidade = rs.getString("NM_CIDADE");
				String estado = rs.getString("NM_ESTADO");
				String pais = rs.getString("NM_PAIS");
				int numero = rs.getInt("NR_ENDERECO"); 
				
				//Cria um objeto com as informações encontradas
				endereco = new Endereco(codigo, tipoLogradouro, nmLogradouro, cep, bairro, cidade, estado, pais, numero);
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
		
		return endereco;
	}
}//done here
