package br.com.healthtrack.db.usuario.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.healthtrack.usuario.Usuario;

public interface UserDAO {
	public void cadastrar(Usuario user) throws SQLException;
	
	public List<Usuario> getAll();
	
	public void atualizar(Usuario user) throws SQLException;
	
	public void remover(int codigo) throws SQLException;
	
	public Usuario searchId (int id);
}
