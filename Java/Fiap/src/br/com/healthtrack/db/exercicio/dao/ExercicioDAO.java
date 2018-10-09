package br.com.healthtrack.db.exercicio.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.exercicio.Exercicio;

public interface ExercicioDAO {
	public void cadastrar(Exercicio ex) throws SQLException;
	
	public List<Exercicio> getAll();
	
	public void atualizar(Exercicio ex) throws SQLException;
	
	public void remover(int code) throws SQLException;
	
	public Exercicio searchId (int id) throws SQLException;
	
}
