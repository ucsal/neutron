package br.ucsal.neutron.teacher;

import java.util.List;

public class TeacherBO {

	private TeacherDAO dao = new TeacherDAO();
	
	public List<Teacher> list() {
		return dao.list();
	}

	public void savar(Teacher teacher) {
		//regras de negocio
		dao.save(teacher);
	}
}
