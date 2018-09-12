package br.com.healthtrack.db.pressaoarterial.dao;

import java.util.List;

import br.com.health.pressaoarterial.PresArterial;

public interface PresArtDAO {
	
	public void cadastrar(PresArterial presart);
	
	public List<PresArterial> getAll();
	
	public void atualizar(PresArterial presart);
	
	public void remover(int codigo);
	
	public PresArterial searchId(int codeSearch);
}
