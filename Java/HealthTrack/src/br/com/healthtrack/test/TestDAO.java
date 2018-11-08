package br.com.healthtrack.test;

import java.util.*;

import br.com.healthtrack.bean.Usuario;
import br.com.healthtrack.dao.UserDAO;
import br.com.healthtrack.dbexception.DBException;
import br.com.healthtrack.factory.DAOFactory;


/* Classe TestDAO
 * @author Luis Gustavo Ullmann
 * @version 1.9
 * */

public class TestDAO {
	public static void main(String[] args) {
		UserDAO dao = DAOFactory.getUserDAO();
		
		//Cadastrar usuario
		Usuario user = new Usuario(0, "Luis", "Ullmann" , "luis@gmail.com",
				"222-222", "111.111.111-11", "masculino", "00/00/0000", Calendar.getInstance(), "123");
		
		try{
			dao.cadastrar(user);
			System.out.println("Usuario cadastrado!");
		} catch(DBException e) {
			e.printStackTrace();
		}
		
		//Buscar pelo id
		user = dao.searchId(0);
		user.setNome("Gustavo");
		
		try {
			dao.atualizar(user);
			System.out.println("Usuario atualizado!");
		} catch(DBException e) {
			e.printStackTrace();
		}
		
		//Listar os usuarios
		List<Usuario> lista = dao.getAll();
		for (Usuario usuario : lista) {
			System.out.println(usuario.getNome() + ""+ usuario.getSobrenome() + " " + usuario.getEmail());
		}
		
		
		//Remover usuario
		try {
			dao.remover(0);
			System.out.println("Usuario removido.");
		} catch(DBException e) {
			e.printStackTrace();
		}
	}
}
