package br.com.healthtrack.db.dieta.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.healthtrack.dieta.Dieta;

public interface DietaDAO {
	
	public void cadastrar(Dieta dieta) throws SQLException;
	
	public List<Dieta> getAll();
	
	public void atualizar(Dieta dieta) throws SQLException;
	
	public void remover(int codigo) throws SQLException;
	
	public Dieta searchName (int code);
}
