package br.ucsal.neutron.role;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RoleDAO {

	public final static List<Role> roles = new ArrayList<>();

	public void salvar(Role role) {
		role.setId(UUID.randomUUID().toString());
		roles.add(role);
	}

	public void delete(String id) {
		Role role = null;
		for (Role r : roles) {
			if (r.getId().equals(id)) {
				role = r;
			}
		}
		roles.remove(role);
	}

	public List<Role> listar() {
		return new ArrayList<Role>(roles);
	}
}
