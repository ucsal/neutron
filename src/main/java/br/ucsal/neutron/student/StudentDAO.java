package br.ucsal.neutron.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private final static List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
    }

    public List<Student> listar() {
        return students;
    }

    public void remover(Long id) {
        Student std = null;
        for (Student st : students) {
            if (st.getId() == id) {
                std = st;
            }
        }
        students.remove(std);
    }

}