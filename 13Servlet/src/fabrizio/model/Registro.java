package fabrizio.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fabrizio.database.DatabaseConnector;

public class Registro {
	
	private ArrayList<Persona> persone = new ArrayList<Persona>();


	public void setPersone(ArrayList<Persona> persone) {
		this.persone = persone;
	}
	
	public void addPersona(Persona p) {
		Connection c = DatabaseConnector.getConnection();
		try {
			Statement s = c.createStatement();
			String valueString = "'"+p.getNome()+"'" + "," + "'"+p.getMail()+"'";
			// ci sono due tipi di execute
			// può ritornare una tabella (solo in caso di select )o un intero
			// ExecuteQuery è solo per SELECT
			System.out.println("Insert INTO persona (name,mail) values("+valueString +")");
			s.executeUpdate("Insert INTO persona (name,mail) values("+valueString +")");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void deletePersona(int id) {
		Connection c = DatabaseConnector.getConnection();
		try {
			Statement s = c.createStatement();
			
			s.executeUpdate("Delete FROM persona where id="+id);
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void populateRegistro(){
		Connection c = DatabaseConnector.getConnection();
		try {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM persona");
			while(rs.next()) {
				Persona p = new Persona(rs.getInt("id"),rs.getString("name"),rs.getString("mail"));
				persone.add(p);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public ArrayList<Persona> getPersone() {
		return persone;
	}

	public void updatePersona(Persona p) {
		Connection c = DatabaseConnector.getConnection();
		try {
			Statement s = c.createStatement();
			String setString = "name='"+p.getNome()+"', mail='"+p.getMail()+"'";
			
			s.executeUpdate("UPDATE persona SET "+setString+" where id="+p.getId());
		}catch (SQLException e) {
			
			e.printStackTrace();
		}

		
	}
}
