package br.com.healthtrack.jdbc;

import java.sql.*;


public class CompanyDBManager {
	
	//Atributo que armazena a única instancia de CompanyDBManager
	private static CompanyDBManager instance;
	
	//Constructor
	private CompanyDBManager() {}
	
	public static CompanyDBManager getInstance() {
		if(instance == null) {
			instance = new CompanyDBManager();
		}
		
		return instance;
	}
	
	public Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection("");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
