package br.com.healthtrack.db.exercicio.dao;

import java.sql.*;
import java.util.*;

import br.com.healthtrack.exercicio.outdoor.ExercicioOutdoor;

public interface ExercicioDAO {
	public void cadastrar(ExercicioOutdoor excercicio) throws SQLException;
	
	public <T> List<T> getAll();
}
