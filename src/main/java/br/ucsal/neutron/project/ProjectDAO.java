package br.ucsal.neutron.project;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProjectDAO {
	public final static List<Project> projects = new ArrayList<>();

	public void salvar(Project project) {
		project.setId(UUID.randomUUID().toString());
		projects.add(project);

	}

	public void delete(String id) {
		Project project = null;
		for (Project p : projects) {
			if (p.getId().equals(id)) {
				project = p;
			}
			
		}
		projects.remove(project);
	}

	public List<Project> listar() {
		return new ArrayList<Project>(projects);

	}
}
