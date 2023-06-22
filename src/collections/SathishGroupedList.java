package collections;

import java.util.List;

public class SathishGroupedList {
	
	private Long id;
	private String email;
	
	private List<Sathish> groupedList;
	
	public SathishGroupedList() {
	}
	
	public SathishGroupedList(Long id,String email, List<Sathish> groupedList) {
		this.id = id;
		this.email= email;
		this.groupedList = groupedList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Sathish> getGroupedList() {
		return groupedList;
	}

	public void setGroupedList(List<Sathish> groupedList) {
		this.groupedList = groupedList;
	}

	@Override
	public String toString() {
		return "SathishGroupedList [id=" + id + ", email=" + email + ", groupedList=" + groupedList + "]";
	}
	
}
