package br.com.healthtrack.factory;

public abstract class DAOFactory {
	public static DietaDAO getDietaDAO() {
		return new DbDietaDAO();
	}
}