package collections;

import java.util.Objects;

public class Sathish {

	private Long id;
	private String name;

	public Sathish() {
	}

	public Sathish(Long id, String name) {
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Sathish [id=" + id + ", name=" + name + "]";
	}
	
}
