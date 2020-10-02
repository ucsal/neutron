package br.ucsal.neutron.teacher;

public class Degree {

	
	private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Degree() {
		// TODO Auto-generated constructor stub
	}
	
	public Degree(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
