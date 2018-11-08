package br.com.healthtrack.dao;


import java.util.List;

import br.com.healthtrack.bean.Peso;
import br.com.healthtrack.dbexception.DBException;

public interface PesoDAO {
	public void cadastrar(Peso peso) throws DBException;
	
	public List<Peso> listar();
	
	public void atualizar(Peso peso) throws DBException;
	
	public void remover(int code) throws DBException;
	
	public Peso searchId(int codeSearch);
}
