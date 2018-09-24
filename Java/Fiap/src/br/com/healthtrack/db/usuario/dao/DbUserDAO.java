package br.com.healthtrack.db.usuario.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.jdbc.CompanyDBManager;
import br.com.healthtrack.usuario.Usuario;

public class DbUserDAO implements UserDAO {
	
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(Usuario user) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "INSERT INTO T_USUARIO(CD_USUARIO, NM_USUARIO, NM_EMAIL, NR_IDAIDE,"
					+ " NR_TELEFONE, NR_CPF, DS_SEXO, DT_NASCIMENTO, DT_CADASTRO, NR_PASSWORD)"
					+ " VALUES(SQ_USUARIO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " TO_DATE(('??/??/????'),('DD/MM/YYYY')), TO_DATE(('??/??/????'),('DD/MM/YYYY')), ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, user.getCdUsuario());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getEmail());
			stmt.setInt(4, user.getIdade());
			stmt.setInt(5, user.getTelefone());
			stmt.setInt(6, user.getCpf());
			stmt.setString(7, user.getSexo());
			java.sql.Date dataNascimento = new java.sql.Date(user.getNascimento().getTimeInMillis());
			stmt.setDate(8, dataNascimento);
			java.sql.Date dataCadastro = new java.sql.Date(user.getCadastro().getTimeInMillis());
			stmt.setDate(9, dataCadastro);
			stmt.setString(10, user.getPassword());
			
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
	
	@Override
	public List<Usuario> getAll(){
		//Cria uma lista de usuarios
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
		conexao = CompanyDBManager.getInstance().obterConexao();
		stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO");
		rs = stmt.executeQuery();
		
		//Percorre todos os usuarios encontrados
			while(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String email = rs.getString("NM_EMAIL");
				int idade = rs.getInt("NR_IDADE");
				int telefone = rs.getInt("NR_TELEFONE");
				int cpf = rs.getInt("NR_CPF");
				String sexo = rs.getString("DS_SEXO");
				java.sql.Date dataNascimento = rs.getDate("DT_NASCIMENTO");
				Calendar dataNasc = Calendar.getInstance();
				dataNasc.setTimeInMillis(dataNascimento.getTime());
				java.sql.Date dataCadastro = rs.getDate("DT_CADASTRO");
				Calendar dataCadast = Calendar.getInstance();
				dataCadast.setTimeInMillis(dataCadastro.getTime());
				String password = rs.getString("NR_PASSWORD");
				
				//Cria um objeto
				Usuario user = new Usuario(code, name, email, idade, telefone, cpf, sexo, dataNasc, dataCadast, password);
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
	public void atualizar(Usuario user) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			conexao.setAutoCommit(false);
			
			conexao = CompanyDBManager.getInstance().obterConexao();
			String sql = "UPDATE T_USUARIO SET NM_USUARIO = ?, NM_EMAIL = ?,"
					+ " NR_IDAIDE = ?,"
					+ " NR_TELEFONE = ?, NR_CPF = ?, DS_SEXO = ?, DT_NASCIMENTO = TO_DATE(('??/??/????'),('DD/MM/YYYY')), "
					+  "NR_PASSWORD = ?"
					+ "WHERE CD_USUARIO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, user.getNome());
			stmt.setString(2, user.getEmail());
			stmt.setInt(3, user.getIdade());
			stmt.setInt(4, user.getTelefone());
			stmt.setInt(5, user.getCpf());
			stmt.setString(6, user.getSexo());
			java.sql.Date dataNascimento = new java.sql.Date(user.getNascimento().getTimeInMillis());
			stmt.setDate(7, dataNascimento);
			stmt.setString(8, user.getPassword());
			
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
	
	//REMOVE
	@Override
	public void remover(int codigo) throws SQLException {
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
	
	//Search with ID
	@Override
	public Usuario searchId (int id) {
		Usuario user = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.getInstance().obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO WHERE CD_USUARIO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String email = rs.getString("NM_EMAIL");
				int idade = rs.getInt("NR_IDADE");
				int telefone = rs.getInt("NR_TELEFONE");
				int cpf = rs.getInt("NR_CPF");
				String sexo = rs.getString("DS_SEXO");
				java.sql.Date dataNascimento = rs.getDate("DT_NASCIMENTO");
				Calendar dataNasc = Calendar.getInstance();
				dataNasc.setTimeInMillis(dataNascimento.getTime());
				java.sql.Date dataCadastro = rs.getDate("DT_CADASTRO");
				Calendar dataCadast = Calendar.getInstance();
				dataCadast.setTimeInMillis(dataCadastro.getTime());
				String password = rs.getString("NR_PASSWORD");
				
				user = new Usuario(code, name, email, idade, telefone, cpf, sexo, dataNasc, dataCadast, password);
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
	
}//done here
