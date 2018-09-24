package br.com.healthtrack.test.dao;

import java.util.List;

import br.com.healthtrack.db.dieta.dao.DbDietaDAO;
import br.com.healthtrack.db.dieta.dao.DietaDAO;
import br.com.healthtrack.dieta.Dieta;

/* Classe TestDAO para DietaDAO
 * @author Luis Gustavo Ullmann
 * @version 1.6
 * */

public class TestDAO {
	public static void main(String[] args) {
		//Instancia DAO
		DietaDAO dietadao = new DbDietaDAO();
		List<Dieta> dietas = dietadao.getAll();
				
		System.out.println(dietas);
		System.out.println("Cadastrado");
		
	}
}
