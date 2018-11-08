package br.com.healthtrack.dao;


import java.util.List;

import br.com.healthtrack.bean.Dieta;
import br.com.healthtrack.dbexception.DBException;

public interface DietaDAO {
	
	public void cadastrar(Dieta dieta) throws DBException;
	
	public List<Dieta> getAll();
	
	public void atualizar(Dieta dieta) throws DBException;
	
	public void remover(int codigo) throws DBException;
	
	public Dieta searchName (int code);
}
