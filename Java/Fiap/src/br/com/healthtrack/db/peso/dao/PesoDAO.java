package br.com.healthtrack.db.peso.dao;

import java.util.List;

import br.com.healthtrack.peso.Peso;

public interface PesoDAO {
	public void cadastrar(Peso peso);
	
	public List<Peso> listar();
	
	public void atualizar(Peso peso);
	
	public void remover(int code);
	
	public Peso searchId(int codeSearch);
}
