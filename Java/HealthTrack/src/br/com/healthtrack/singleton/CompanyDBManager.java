package br.com.healthtrack.singleton;

import java.sql.*;


public class CompanyDBManager {
	
	//Atributo que armazena a �nica instancia de CompanyDBManager
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
			
			conexao = DriverManager.getConnection("jdbc:oracle:thin:oracle.fiap.com.br:ORCL", "RM80167", "05051989");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
