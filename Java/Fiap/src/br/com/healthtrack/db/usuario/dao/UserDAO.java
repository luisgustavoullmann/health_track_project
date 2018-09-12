package br.com.healthtrack.db.usuario.dao;

import java.util.List;

import br.com.healthtrack.usuario.Usuario;

public interface UserDAO {
	public void cadastrar(Usuario user);
	
	public List<Usuario> getAll();
	
	public void atualizar(Usuario user);
	
	public void remover(int codigo);
	
	public Usuario searchId (int id);
}
