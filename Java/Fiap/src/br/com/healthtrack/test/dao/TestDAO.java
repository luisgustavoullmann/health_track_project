package br.com.healthtrack.test.dao;

import java.util.*;

import br.com.healthtrack.db.dieta.dao.DbDietaDAO;
import br.com.healthtrack.db.dieta.dao.DietaDAO;
import br.com.healthtrack.dieta.Dieta;

/* Classe TestDAO para DietaDAO
 * @author Luis Gustavo Ullmann
 * @version 1.6
 * */

public class TestDAO {
	private static List<Dieta> dietas = new ArrayList<Dieta>();

	public static void main(String[] args) {
		//Instancia DAO
		DietaDAO dietadao = new DbDietaDAO();
		dietas = dietadao.getAll();
			Calendar SYSDATE = null;
			dietas.add(new Dieta(1, "Pão Francês", 200, "Café da Manhã", 3000, SYSDATE));
			dietas.add(new Dieta(2, "Lasanha", 300, "Almoço", 3000, SYSDATE));
			dietas.add(new Dieta(3, "Hamburguer", 250, "Lanche", 3000, SYSDATE));
			dietas.add(new Dieta(4, "Arroz com Feijão", 300, "Jantar", 3000, SYSDATE));
			dietas.add(new Dieta(5, "Pizza", 600, "Madrugada", 3000, SYSDATE));
		
		for(int i = 0; i < dietas.size(); i++) {
			System.out.println(dietas.get(i));
		}

		System.out.println("Cadastrado");
		
	}
}
