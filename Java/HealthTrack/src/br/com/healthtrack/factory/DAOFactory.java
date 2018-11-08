package br.com.healthtrack.factory;

import br.com.healthtrack.dao.DietaDAO;
import br.com.healthtrack.dao.EnderecoDAO;
import br.com.healthtrack.dao.ExercicioDAO;
import br.com.healthtrack.dao.PesoDAO;
import br.com.healthtrack.dao.PresArtDAO;
import br.com.healthtrack.dao.UserDAO;
import br.com.healthtrack.db.dao.OracleDietaDAO;
import br.com.healthtrack.db.dao.OracleEnderecoDAO;
import br.com.healthtrack.db.dao.OracleExercicioDAO;
import br.com.healthtrack.db.dao.OraclePesoDAO;
import br.com.healthtrack.db.dao.OraclePresArtDAO;
import br.com.healthtrack.db.dao.OracleUserDAO;


public abstract class DAOFactory {
	public static DietaDAO getDietaDAO() {
		return new OracleDietaDAO();
	}
	
	public static PesoDAO getPesoDAO() {
		return new OraclePesoDAO();
	}
	
	public static ExercicioDAO getExercicioDAO() {
		return new OracleExercicioDAO();
	}

	public static PresArtDAO getPresArtDAO() {
		return new OraclePresArtDAO();
	}
	
	public static UserDAO getUserDAO() {
		return new OracleUserDAO();
	}
	
	public static EnderecoDAO getEnderecoDAO() {
		return new OracleEnderecoDAO();
	}
	
}