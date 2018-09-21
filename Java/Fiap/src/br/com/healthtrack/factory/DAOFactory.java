package br.com.healthtrack.factory;

import br.com.healthtrack.db.dieta.dao.DbDietaDAO;
import br.com.healthtrack.db.dieta.dao.DietaDAO;

public abstract class DAOFactory {
	public static DietaDAO getDietaDAO() {
		return new DbDietaDAO();
	}
}