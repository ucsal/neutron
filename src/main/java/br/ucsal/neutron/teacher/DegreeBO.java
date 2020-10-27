package br.ucsal.neutron.teacher;

import java.util.List;

public class DegreeBO {

	private DegreeDAO dao = new DegreeDAO();
	
	public List<Degree> list() {
		return dao.list();
	}
}
