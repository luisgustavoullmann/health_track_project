package br.com.healthtrack.jdbc;

import java.sql.DriverManager;

public class CompanyDBManager {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection("")
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
