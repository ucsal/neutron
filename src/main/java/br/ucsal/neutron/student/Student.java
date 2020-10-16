package br.ucsal.neutron.student;

public class Student {
    private Long id;
    private String name;
    private String course;
    private String email;
    private String enrollment;

    public Student(String name, String course, String email, String enrollment) {
        super();
        this.name = name;
        this.course = course;
        this.email = email;
        this.enrollment = enrollment;
    }

    public Long getId() {
        return id;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

}