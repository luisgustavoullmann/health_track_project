package br.com.healthtrack.dao;


import java.util.*;

import br.com.healthtrack.bean.Exercicio;
import br.com.healthtrack.dbexception.DBException;

public interface ExercicioDAO {
	public void cadastrar(Exercicio ex) throws DBException;
	
	public List<Exercicio> getAll();
	
	public void atualizar(Exercicio ex) throws DBException;
	
	public void remover(int code) throws DBException;
	
	public Exercicio searchId (int id);
	
}
