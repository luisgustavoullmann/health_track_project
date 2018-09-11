package br.com.healthtrack.oracle.dieta.dao;

import java.util.List;

import br.com.healthtrack.dieta.Dieta;

public interface DietaDAO {
	
	public void cadastrar(Dieta dieta);
	
	public List<Dieta> getAll();
	
	public void atualizar(Dieta dieta);
	
	public void remover(int codigo);
	
	public Dieta searchName (String nome, int code);
}
