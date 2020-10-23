package br.ucsal.neutron.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import br.ucsal.neutron.db.Database;

public class UserDAO {

	private static List<User> usuarios = new ArrayList<>();

	public void save(User usuario) {
		usuarios.add(usuario);
	}

	public void delete(Long id) {
		User tester = null;
		for (User user : usuarios) {
			if (user.getId() == id) {
				tester = user;
			}
		}
		usuarios.remove(tester);
	}

	public List<User> listarTodos() {
		Context ctx;
		DataSource ds;
		List<User> lista = new ArrayList<User>();
		try {
			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("jdbc/neutronDS");
			Statement stmt = ds.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT ID,USERNAME,PASSWORD FROM USER");
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getLong("ID"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				lista.add(user);
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public User listarPorID(Long id) {
		User retorno = null;
		for (User user : usuarios) {
			if (user.getId() == id) {
				retorno = user;
			}
		}
		return retorno;
	}
	
	public User buscarLogin(String userName) {
		User userLogin = null;
		for (User user : usuarios) {
			if(user.getUsername().equals(userName)) {
				userLogin = user;
			}
		}
		return userLogin;
	}

	
	public void update(User user) {
		User userFind = listarPorID(user.getId());
		userFind.setUsername(user.getUsername());
		userFind.setUsername(user.getPassword());
	}

	public User buscarLogin(String username, String password) {
		try {
			Connection conexao = Database.getInstacia().conexao();
			String sql = "SELECT ID,USERNAME,PASSWORD FROM USER "
					+ "WHERE USERNAME='"+username+"' and PASSWORD='"+password+"'";
			String sql2 = "SELECT ID,USERNAME,PASSWORD FROM USER "
					+ "WHERE USERNAME=? and PASSWORD=?";
			System.out.println(sql2);
			PreparedStatement statement = conexao.prepareStatement(sql2);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			User user = null;
			if(resultSet.next()) {
				user = new User();
				user.setId(resultSet.getLong("ID"));
				user.setUsername(resultSet.getString("USERNAME"));
				user.setPassword(resultSet.getString("PASSWORD"));
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}