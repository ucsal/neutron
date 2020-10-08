package br.ucsal.neutron.course;

public class Course {

	private String id;
	private String name;
	private String coordinator;
	private String description;

	public Course(String name, String coordinator, String description) {
		super();
		this.name = name;
		this.coordinator = coordinator;
		this.description = description;
	}

	public Course() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
