package br.ucsal.neutron.course.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import br.ucsal.neutron.course.Course;

public class CourseDAO {

	private final static List<Course> courses = new ArrayList<>();

	public void salvar(Course course) {
		course.setId(UUID.randomUUID().toString());
		courses.add(course);
	}

	public List<Course> listar() {
		return new ArrayList<Course>(courses);
	}

	public void delet(String id) {
		Course course = null;
		for (Course c : courses) {
			if(c.getId().equals(id)) {
				course = c;
			}
		}
		courses.remove(course);
	}
}
