package br.com.healthtrack.dao;


import java.util.List;

import br.com.healthtrack.bean.PresArterial;
import br.com.healthtrack.dbexception.DBException;

public interface PresArtDAO {
	
	public void cadastrar(PresArterial presart) throws DBException;
	
	public List<PresArterial> getAll();
	
	public void atualizar(PresArterial presart) throws DBException;
	
	public void remover(int codigo) throws DBException;
	
	public PresArterial searchId(int codeSearch);
}
