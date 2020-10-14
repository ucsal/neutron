package br.ucsal.neutron.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.neutron.teacher.Degree;
import br.ucsal.neutron.teacher.Teacher;

public class Database {

	
	private static String user = "sa";
	private static String password = "";
	private static String url = "jdbc:hsqldb:mem:.";
	private static String driver ="org.hsqldb.jdbc.JDBCDriver";
	
	private static Database database = new Database(); 
	
	private Database() {
		try {
			Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, user, password);
			Statement statement  = conexao.createStatement();
			
			statement.execute("CREATE TABLE DEGREE (ID IDENTITY PRIMARY KEY, NAME VARCHAR(200))");
			statement.execute("CREATE TABLE TEACHER  ( ID IDENTITY PRIMARY KEY, NAME VARCHAR(200), COURSE_ID INT , EMAIL  VARCHAR(200),  DEGREE_ID INT NOT NULL, FOREIGN KEY (DEGREE_ID) REFERENCES DEGREE(ID));");
			
			statement.execute("INSERT INTO DEGREE (\"NAME\") VALUES ('GRADUACAO')");
			statement.execute("INSERT INTO DEGREE (\"NAME\") VALUES ('ESPECIALIZACAO')");

			statement.execute("INSERT INTO Teacher  ( \"NAME\", \"EMAIL\", \"DEGREE_ID\" ) VALUES ('PEDRO ', 18, 1 )");
			statement.execute("INSERT INTO Teacher  ( \"NAME\", \"EMAIL\", \"DEGREE_ID\" ) VALUES ('MARIA ', 18, 0 )");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Database getInstacia() {
		return database;
	}
	
	public Connection conexao() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	

	
	
	
	
}
