package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Collegamento {

	private final String HOST = "jdbc:mysql://localhost:3306/jaita93";
	private final String USER = "app_java";
	private final String PASS = "java_2023!";
	
	private Connection connessione = null;
	
	public Connection getConnessione() {
		if (this.connessione == null) connetti();
		
		return this.connessione;
	}
	
	private void connetti() {
		
		try {
			this.connessione = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("SEI CONNESSO!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("ERRORE DI CONNESSIONE AL DB " + e.getMessage());
		}
		
	}
	
}
