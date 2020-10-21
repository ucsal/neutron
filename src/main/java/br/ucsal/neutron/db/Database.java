package br.ucsal.neutron.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Database {

	private Context ctx = null;
	private DataSource ds = null;
//	private Connection con = null;

	private static Database database = new Database();

	private Database() {
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("jdbc/neutronDS");
//			con = ds.getConnection();
//			Statement statement = con.createStatement();
//			statement.execute(
//			"CREATE TABLE USER  ( ID IDENTITY PRIMARY KEY, USERNAME VARCHAR(50), PASSWORD VARCHAR(250) );");
//
//			statement.execute("INSERT INTO USER (\"USERNAME\",\"PASSWORD\") VALUES ('root','root')");
//
//			statement.execute("CREATE TABLE DEGREE (ID IDENTITY PRIMARY KEY, NAME VARCHAR(200))");
//			statement.execute(
//					"CREATE TABLE TEACHER  ( ID IDENTITY PRIMARY KEY, NAME VARCHAR(200), COURSE_ID INT , EMAIL  VARCHAR(200),  DEGREE_ID INT NOT NULL, FOREIGN KEY (DEGREE_ID) REFERENCES DEGREE(ID));");
//
//			statement.execute("INSERT INTO DEGREE (\"NAME\") VALUES ('GRADUACAO')");
//			statement.execute("INSERT INTO DEGREE (\"NAME\") VALUES ('ESPECIALIZACAO')");
//
//			statement.execute("INSERT INTO Teacher  ( \"NAME\", \"EMAIL\", \"DEGREE_ID\" ) VALUES ('PEDRO ', 18, 1 )");
//			statement.execute("INSERT INTO Teacher  ( \"NAME\", \"EMAIL\", \"DEGREE_ID\" ) VALUES ('MARIA ', 18, 0 )");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Database getInstacia() {
		return database;
	}

	public Connection conexao() throws SQLException {
		return ds.getConnection();
	}

}
