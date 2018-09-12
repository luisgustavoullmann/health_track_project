package br.com.healthtrack.db.usuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.healthtrack.jdbc.CompanyDBManager;
import br.com.healthtrack.usuario.Usuario;

public class DbUserDAO implements UserDAO {
	
	private Connection conexao;
	
	//CREATE
	@Override
	public void cadastrar(Usuario user) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "INSERT INTO T_USUARIO(CD_USUARIO, NM_USUARIO, NM_EMAIL, NR_IDAIDE, NR_PESO,"
					+ " NR_ALTURA, NR_TELEFONE, NR_CPF, DS_SEXO)"
					+ " VALUES(SQ_USUARIO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, user.getCdUsuario());
			stmt.setString(2, user.getNome());
			stmt.setString(3, user.getEmail());
			stmt.setInt(4, user.getIdade());
			stmt.setDouble(5, user.getPeso());
			stmt.setDouble(6, user.getAltura());
			stmt.setInt(7, user.getTelefone());
			stmt.setInt(8, user.getCpf());
			stmt.setString(9, user.getSexo());
			
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
	
	@Override
	public List<Usuario> getAll(){
		//Cria uma lista de usuarios
		//List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
		conexao = CompanyDBManager.obterConexao();
		stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO");
		rs = stmt.executeQuery();
		
		//Percorre todos os usuarios encontrados
			while(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String email = rs.getString("NM_EMAIL");
				int idade = rs.getInt("NR_IDADE");
				float peso = rs.getFloat("NR_PESO");
				float altura = rs.getFloat("NR_ALTURA");
				int telefone = rs.getInt("NR_TELEFONE");
				int cpf = rs.getInt("NR_CPF");
				String sexo = rs.getString("DS_SEXO");
				
				//Cria um objeto
				//Usuario user = new Usuario(code, name, email, idade, peso, altura, telefone, cpf, sexo);
				//Adiciona a lista
				//lista.add(user);
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
		//return getAll();
	}//

	//UPDATE
	@Override
	public void atualizar(Usuario user) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "UPDATE T_USUARIO SET NM_USUARIO = ?, NM_EMAIL = ?,"
					+ " NR_IDAIDE = ?, NR_PESO = ?, NR_ALTURA = ?,"
					+ " NR_TELEFONE = ?, NR_CPF = ?, DS_SEXO = ?"
					+ "WHERE CD_USUARIO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, user.getNome());
			stmt.setString(2, user.getEmail());
			stmt.setInt(3, user.getIdade());
			stmt.setDouble(4, user.getPeso());
			stmt.setDouble(5, user.getAltura());
			stmt.setInt(6, user.getTelefone());
			stmt.setInt(7, user.getCpf());
			stmt.setString(8, user.getSexo());
			
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
	
	//REMOVE
	@Override
	public void remover(int codigo) {
		PreparedStatement stmt = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			String sql = "DELETE FROM T_USUARIO WHERE CD_USUARIO = ?";
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
	
	//Search with ID
	@Override
	public Usuario searchId (int id) {
		Usuario user = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = CompanyDBManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO WHERE CD_USUARIO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				int code = rs.getInt("CD_USUARIO");
				String name = rs.getString("NM_NOME");
				String email = rs.getString("NM_EMAIL");
				int idade = rs.getInt("NR_IDADE");
				float peso = rs.getFloat("NR_PESO");
				float altura = rs.getFloat("NR_ALTURA");
				int telefone = rs.getInt("NR_TELEFONE");
				int cpf = rs.getInt("NR_CPF");
				String sexo = rs.getString("DS_SEXO"); 
				
				//id = new Usuario(code, name, email, idade, peso, altura, telefone, cpf, sexo);
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
