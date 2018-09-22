package br.com.healthtrack.db.pressaoarterial.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.healthtrack.pressaoarterial.PresArterial;

public interface PresArtDAO {
	
	public void cadastrar(PresArterial presart) throws SQLException;
	
	public List<PresArterial> getAll();
	
	public void atualizar(PresArterial presart) throws SQLException;
	
	public void remover(int codigo) throws SQLException;
	
	public PresArterial searchId(int codeSearch);
}
