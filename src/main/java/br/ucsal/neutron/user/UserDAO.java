package br.ucsal.neutron.user;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	private static List<User> usuarios = new ArrayList<>();
	private User tester = new User();
	private int count;

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
		
		return usuarios;
	}

	public User listarPorID(Long id) {
		int contador = 0;
		for (User user : usuarios) {
			contador++;
			if (user.getId() == id) {
				this.tester = user;

			}
		}
		this.count = contador;
		return this.tester;
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

	public void update(String userName, String passWord) {
		this.tester.setUsername(userName);
		this.tester.setPassword(passWord);
		usuarios.set((this.count - 1), tester);
	}
	public void testarListar() {
		usuarios.add(new User("Teste", "123"));
		usuarios.add(new User("adm", "123"));
	}
}