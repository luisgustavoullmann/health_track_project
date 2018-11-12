package br.com.healthtrack.db.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.bean.Endereco;
import br.com.healthtrack.bean.Usuario;
import br.com.healthtrack.dao.UserDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.singleton.CompanyDBManager;

public class OracleUserDAO implements UserDAO {
	
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(Usuario user) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_USUARIO(CD_USUARIO, NM_USUARIO, NM_LAST, NM_EMAIL,"
					+ " NR_TELEFONE, NR_CPF, DS_SEXO, DT_NASCIMENTO, DT_CADASTRO, NR_PASSWORD, CD_ENDERECO)"
					+ " VALUES(SQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?,"
					+ " ?, TO_DATE(('??/??/????'),('DD/MM/YYYY')), ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, user.getCdUsuario());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getSobrenome());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getTelefone());
			stmt.setString(6, user.getCpf());
			stmt.setString(7, user.getSexo());
			stmt.setString(8, user.getNascimento());
			java.sql.Date dataCadastro = new java.sql.Date(user.getCadastro().getTimeInMillis());
			stmt.setDate(9, dataCadastro);
			stmt.setString(10, user.getPassword());
			stmt.setInt(11, user.getEndereco().getCdEndereco());
			
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
	}//
	
	@Override
	public List<Usuario> getAll(){
		//Cria uma lista de usuarios
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
		conexao = CompanyDBManager.getInstance().obterConexao();
		stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO"
				+ "INNER JOIN T_ENDERECO ON T_USUARIO.CD_ENDERECO = T_ENDERECO.CD_ENDERECO");
		rs = stmt.executeQuery();
		
		//Percorre todos os usuarios encontrados
			while(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String lastname = rs.getString("NM_LAST");
				String email = rs.getString("NM_EMAIL");
				String telefone = rs.getString("NR_TELEFONE");
				String cpf = rs.getString("NR_CPF");
				String sexo = rs.getString("DS_SEXO");
				String dataNasc = rs.getString("DT_NASCIMENTO");
				java.sql.Date dataCadastro = rs.getDate("DT_CADASTRO");
				Calendar dataCadast = Calendar.getInstance();
				dataCadast.setTimeInMillis(dataCadastro.getTime());
				String password = rs.getString("NR_PASSWORD");
				//Endereco
				int codigo = rs.getInt("CD_ENDERECO");
				String nmLogradouro = rs.getString("NM_LOGRADOURO");
				String cep = rs.getString("NR_CEP");
				String bairro = rs.getString("NM_BAIRRO");
				String cidade = rs.getString("NM_CIDADE");
				String estado = rs.getString("NM_ESTADO");
				String pais = rs.getString("NM_PAIS");
				int numero = rs.getInt("NR_ENDERECO");
								
				//Cria um objeto
				Usuario user = new Usuario(code, name, lastname, email, telefone, cpf, sexo, dataNasc, dataCadast, password);
				Endereco endereco = new Endereco(codigo, nmLogradouro, cep, bairro, cidade, estado, pais, numero);
				user.setEndereco(endereco);
				
				//Adiciona a lista
				lista.add(user);
				
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
	}//

	//UPDATE
	@Override
	public void atualizar(Usuario user) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_USUARIO SET NM_USUARIO = ?, NM_LAST = ?, NM_EMAIL = ?,"
					+ " NR_TELEFONE = ?, NR_CPF = ?, DS_SEXO = ?, DT_NASCIMENTO = ?, "
					+  "NR_PASSWORD = ?,"
					+ "CD_ENDERECO = ?"
					+ "WHERE CD_USUARIO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, user.getCdUsuario());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getSobrenome());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getTelefone());
			stmt.setString(6, user.getCpf());
			stmt.setString(7, user.getSexo());
			stmt.setString(8, user.getNascimento());
			java.sql.Date dataCadastro = new java.sql.Date(user.getCadastro().getTimeInMillis());
			stmt.setDate(9, dataCadastro);
			stmt.setString(10, user.getPassword());
			stmt.setInt(11, user.getEndereco().getCdEndereco());
			
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
	
	//REMOVE
	@Override
	public void remover(int codigo) throws DBException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "DELETE FROM T_USUARIO WHERE CD_USUARIO = ?";
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
	
	//Search with ID
	@Override
	public Usuario searchId (int id) {
		Usuario user = null;
		Endereco endereco = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO"
					+ " INNER JOIN T_ENDERECO ON T_USUARIO.CD_ENDERECO = T_ENDERECO.CD_ENDERECO"
					+ " WHERE CD_USUARIO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String lastname = rs.getString("NM_LAST");
				String email = rs.getString("NM_EMAIL");
				String telefone = rs.getString("NR_TELEFONE");
				String cpf = rs.getString("NR_CPF");
				String sexo = rs.getString("DS_SEXO");
				String dataNasc = rs.getString("DT_NASCIMENTO");
				java.sql.Date dataCadastro = rs.getDate("DT_CADASTRO");
				Calendar dataCadast = Calendar.getInstance();
				dataCadast.setTimeInMillis(dataCadastro.getTime());
				String password = rs.getString("NR_PASSWORD");
				//Endereco
				int codigo = rs.getInt("CD_ENDERECO");
				String nmLogradouro = rs.getString("NM_LOGRADOURO");
				String cep = rs.getString("NR_CEP");
				String bairro = rs.getString("NM_BAIRRO");
				String cidade = rs.getString("NM_CIDADE");
				String estado = rs.getString("NM_ESTADO");
				String pais = rs.getString("NM_PAIS");
				int numero = rs.getInt("NR_ENDERECO");
				
				user = new Usuario(code, name, lastname, email, telefone, cpf, sexo, dataNasc, dataCadast, password);
				endereco = new Endereco(codigo, nmLogradouro, cep, bairro, cidade, estado, pais, numero);
				
				user.setEndereco(endereco);
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
		return user;
	}//
	
	
	//Validando Usuario
	@Override
	public boolean validarUsuario(Usuario usuario) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {			
			conexao = CompanyDBManager.getInstance().obterConexao();
			
			stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO"
					+ " WHERE NM_EMAIL = ?, NR_PASSWORD = ?");
			stmt.setString(1, usuario.getEmail());
			stmt.setString(2, usuario.getPassword());
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				return true;
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
		
		return false;
	}//
	
	
}//done here
