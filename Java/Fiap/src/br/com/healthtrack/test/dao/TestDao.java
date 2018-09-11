package br.com.healthtrack.test.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.dieta.Dieta;
import br.com.healthtrack.oracle.dieta.dao.OracleDietaDAO;

/* Classe TestDAO para DietaDAO
 * @author Luis Gustavo Ullmann
 * @version 1.2
 * */

public class TestDao {
	public static void main(String[] args) {
		//Instancia DAO
		OracleDietaDAO dietadao = new OracleDietaDAO();
		
		List<Dieta> dieta = new ArrayList<Dieta>();
		Dieta dieta1 = new Dieta();
		dieta1.setTipo("Sobremesa");
		dieta1.setCaloria(200);
		dieta1.setNomeAlimento("Brigadeiro");
		dieta1.setPadraoCaloria(3000);
		
		Dieta dieta2 = new Dieta();
		dieta2.setTipo("Jantar");
		dieta2.setCaloria(750);
		dieta2.setNomeAlimento("Carne seca com aborora");
		dieta2.setPadraoCaloria(3000);
		
		Dieta dieta3 = new Dieta();
		dieta3.setTipo("Café da manhã");
		dieta3.setCaloria(400);
		dieta3.setNomeAlimento("Café com leite e misto quente");
		dieta3.setPadraoCaloria(3000);
		
		Dieta dieta4 = new Dieta();
		dieta4.setTipo("Almoço");
		dieta4.setCaloria(1200);
		dieta4.setNomeAlimento("Arroz, feijão, bifé com batata frita");
		dieta4.setPadraoCaloria(3000);
		
		Dieta dieta5 = new Dieta();
		dieta5.setTipo("Jantar");
		dieta5.setCaloria(854);
		dieta5.setNomeAlimento("Pizza");
		dieta5.setPadraoCaloria(3000);
		
		Dieta dieta6 = new Dieta();
		dieta6.setTipo("Sobremesa");
		dieta6.setCaloria(220);
		dieta6.setNomeAlimento("Torta alemã");
		dieta6.setPadraoCaloria(3000);
		
		Dieta dieta7 = new Dieta();
		dieta7.setTipo("Café da manhã");
		dieta7.setCaloria(200);
		dieta7.setNomeAlimento("Suco de laranja com pão de batata");
		dieta7.setPadraoCaloria(3000);
		
		Dieta dieta8 = new Dieta();
		dieta8.setTipo("Almoço");
		dieta8.setCaloria(1300);
		dieta8.setNomeAlimento("Lasanha");
		dieta8.setPadraoCaloria(3000);
		
		Dieta dieta9 = new Dieta();
		dieta9.setTipo("Lanche");
		dieta9.setCaloria(500);
		dieta9.setNomeAlimento("Salada");
		dieta9.setPadraoCaloria(3000);
		
		Dieta dieta10 = new Dieta();
		dieta10.setTipo("Jantar");
		dieta10.setCaloria(1000);
		dieta10.setNomeAlimento("Pizza");
		dieta10.setPadraoCaloria(3000);
		
		dieta.add(dieta1);
		dieta.add(dieta2);
		dieta.add(dieta3);
		dieta.add(dieta4);
		dieta.add(dieta5);
		dieta.add(dieta6);
		dieta.add(dieta7);
		dieta.add(dieta8);
		dieta.add(dieta9);
		dieta.add(dieta10);
		
			
		//Loop
		for(int i = 0; i < dieta.size(); i++) {
			Dieta di = dieta.get(i);
			System.out.println(di.getTipo());
			System.out.println(di.getCaloria());
			System.out.println(di.getNomeAlimento());
			System.out.println(di.getPadraoCaloria());
		}
		
		dietadao.getAll();
		
		
		System.out.println(dieta);
		System.out.println("Cadastrado");
		
	}
}
