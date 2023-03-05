package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.AbstractConnection;
import connection.H2Connection;
import model.Equipos;

public class EquiposRepository {
	
	private static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test;";
	AbstractConnection manager = new H2Connection();
	 

	public void insert(Equipos equipo) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		int id = getLastIdEquipo();
		id++;
		System.out.println("id siguiente: "+id);
		try {
			preparedStatement = conn
					//TODO
					.prepareStatement("INSERT INTO equipo (id,nombre_equipo,voto_equipo) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, equipo.getNombreEquipo());
			preparedStatement.setInt(3, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}
	
	public void delete(int id) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("DELETE FROM equipo WHERE id = ?"); //TODO
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	}
	
	public int getLastIdEquipo() {
		int last_id = 0;
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT max(id) as id FROM equipo "); //TODO

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

	public List<Equipos> listAll() {
		System.out.println("llega listall");
		List<Equipos> lista = new ArrayList<>();
		System.out.println("llega listall antes dbcurl");
		Connection conn = manager.open(jdbcUrl);
		System.out.println("llega listall post dbcurl");
		PreparedStatement preparedStatement = null;
		try {
			System.out.println("llega2");
			preparedStatement = conn
					.prepareStatement("SELECT * FROM equipo ");

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Equipos equipo = new Equipos();
				equipo.setId(resultSet.getInt("id"));
				equipo.setNombreEquipo(resultSet.getString("nombre_equipo"));
				lista.add(equipo);
				System.out.println("llega3");
				System.out.println("Id: " + equipo.getId());
				System.out.println("Equipo: " + equipo.getNombreEquipo());
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		System.out.println("Lista: " + lista.get(0).getNombreEquipo());
		return lista;
	}


	public List<Equipos> listOne(int id) {
		System.out.println("llega lisOne");
		List<Equipos> listOne = new ArrayList<>();
		System.out.println("llega listOne antes dbcurl");
		Connection conn = manager.open(jdbcUrl);
		System.out.println("llega listOne post dbcurl");
		PreparedStatement preparedStatement = null;
		try {
			System.out.println("llega2");
			preparedStatement = conn
					.prepareStatement("SELECT * FROM equipo WHERE id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Equipos equipo = new Equipos();
				equipo.setId(resultSet.getInt("id"));
				equipo.setNombreEquipo(resultSet.getString("nombre_equipo"));
				listOne.add(equipo);
				// System.out.println("llega3");
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		System.out.println("ListOne: " + listOne.get(0).getNombreEquipo());
		System.out.println("ListOne: " + listOne.get(0).getId());
		return listOne;
	}

}
