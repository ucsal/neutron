package br.ucsal.neutron.role.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.ucsal.neutron.role.model.Role;

public class RoleDAO {

	public final static List<Role> roles = new ArrayList<>();

	public void salvar(Role role) {
		role.setId(UUID.randomUUID().toString());
		roles.add(role);
	}

	public void delete(String id) {
		Role role = null;
		for (Role c : roles) {
			if (c.getId().equals(id)) {
				role = c;
			}
		}
		roles.remove(role);
	}

	public List<Role> listar() {
		return new ArrayList<Role>(roles);
	}
}
