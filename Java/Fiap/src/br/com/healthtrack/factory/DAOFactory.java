package br.com.healthtrack.factory;

import br.com.healthtrack.db.dieta.dao.DbDietaDAO;
import br.com.healthtrack.db.dieta.dao.DietaDAO;
import br.com.healthtrack.db.endereco.dao.DbEnderecoDAO;
import br.com.healthtrack.db.endereco.dao.EnderecoDAO;
import br.com.healthtrack.db.exercicio.dao.DbExercicioDAO;
import br.com.healthtrack.db.exercicio.dao.ExercicioDAO;
import br.com.healthtrack.db.peso.dao.DbPesoDAO;
import br.com.healthtrack.db.peso.dao.PesoDAO;
import br.com.healthtrack.db.pressaoarterial.dao.DbPresArtDAO;
import br.com.healthtrack.db.pressaoarterial.dao.PresArtDAO;
import br.com.healthtrack.db.usuario.dao.DbUserDAO;
import br.com.healthtrack.db.usuario.dao.UserDAO;

public abstract class DAOFactory {
	public static DietaDAO getDietaDAO() {
		return new DbDietaDAO();
	}
	
	public static PesoDAO getPesoDAO() {
		return new DbPesoDAO();
	}
	
	public static ExercicioDAO getExercicioDAO() {
		return new DbExercicioDAO();
	}
	
	public static PresArtDAO getPresArtDAO() {
		return new DbPresArtDAO();
	}
	
	public static UserDAO getUserDAO() {
		return new DbUserDAO();
	}
	
	public static EnderecoDAO getEnderecoDAO() {
		return new DbEnderecoDAO();
	}
	
}