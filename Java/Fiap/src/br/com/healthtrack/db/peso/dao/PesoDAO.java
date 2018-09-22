package br.com.healthtrack.db.peso.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.healthtrack.peso.Peso;

public interface PesoDAO {
	public void cadastrar(Peso peso) throws SQLException;
	
	public List<Peso> listar();
	
	public void atualizar(Peso peso) throws SQLException;
	
	public void remover(int code) throws SQLException;
	
	public Peso searchId(int codeSearch);
}
