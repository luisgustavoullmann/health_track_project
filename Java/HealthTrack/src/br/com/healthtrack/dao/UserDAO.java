package br.com.healthtrack.dao;


import java.util.List;

import br.com.healthtrack.bean.Usuario;
import br.com.healthtrack.dbexception.DBException;

public interface UserDAO {
	public void cadastrar(Usuario user) throws DBException;
	
	public List<Usuario> getAll();
	
	public void atualizar(Usuario user) throws DBException;
	
	public void remover(int codigo) throws DBException;
	
	public Usuario searchId (int id);
}
