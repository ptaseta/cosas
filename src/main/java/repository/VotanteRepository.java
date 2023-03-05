package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.AbstractConnection;
import connection.H2Connection;
import model.Votantes;

public class VotanteRepository {
	private static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test;";
	AbstractConnection manager = new H2Connection();
	 

	public void insert(Votantes votante) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		int id = getLastIdVotante();
		id++;
		
		try {
			preparedStatement = conn
					//TODO
					.prepareStatement("INSERT INTO votante (id,nombre) VALUES (?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, votante.getNombre());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public int getLastIdVotante() {
		int last_id = 0;
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT max(id) as id FROM votante "); //TODO

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				last_id = resultSet.getInt("id");
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return last_id;
	}

	public List<Votantes> listAll() {
		List<Votantes> lista = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT * FROM votante ");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Votantes votante = new Votantes();
				votante.setId(resultSet.getInt("id"));
				votante.setNombre(resultSet.getString("nombre"));
				lista.add(votante);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return lista;
	}


}
