package br.com.healthtrack.db.endereco.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.endereco.Endereco;

public interface EnderecoDAO {
	
	public void cadastrar(Endereco endereco) throws SQLException;
	
	public List<Endereco> getAll();
	
	public void atualizar(Endereco endereco) throws SQLException;
	
	public void remover(int code) throws SQLException;
	
	public Endereco searchId(int code);
	
	
}//
