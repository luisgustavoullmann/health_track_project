package br.com.healthtrack.dao;

import java.util.*;

import br.com.healthtrack.bean.Endereco;
import br.com.healthtrack.dbexception.DBException;

public interface EnderecoDAO {
	
	public void cadastrar(Endereco endereco) throws DBException;
	
	public List<Endereco> getAll();
	
	public void atualizar(Endereco endereco) throws DBException;
	
	public void remover(int code) throws DBException;
	
	public Endereco searchId(int code);
	
	
}//
