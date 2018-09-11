package br.com.healthtrack.test.dao;

import java.util.List;

import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.oracle.dieta.dao.DietaDAO;
import br.com.healthtrack.oracle.dieta.dao.OracleDietaDAO;

/* Classe TestDAO para DietaDAO
 * @author Luis Gustavo Ullmann
 * @version 1.5
 * */

public class TestDAO {
	public static void main(String[] args) {
		//Instancia DAO
		DietaDAO dietadao = new OracleDietaDAO();
		List<Dieta> dietas = dietadao.getAll();
				
		System.out.println(dietas);
		System.out.println("Cadastrado");
		
	}
}
