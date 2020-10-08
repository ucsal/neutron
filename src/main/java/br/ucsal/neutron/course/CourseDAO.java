package br.ucsal.neutron.course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CourseDAO {

	private final static List<Course> courses = new ArrayList<>();

	public void salvar(Course course) {
		course.setId(UUID.randomUUID().toString());
		courses.add(course);
	}

	public List<Course> listar() {
		return new ArrayList<Course>(courses);
	}
	
	public static Course findById(String id) {
		Course course = null;
		for (Course c : courses) {
			if(c.getId().equals(id)) {
				course = c;
			}	
		}		
		return course;
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

	public static void atualizar(Course course) {
		for (Course c : courses) {
			if(c.getId().equals(course.getId())) {
				c.setName(course.getName());
				c.setCoordinator(course.getCoordinator());
				c.setDescription(course.getDescription());
			}
		}
		
	}
}
