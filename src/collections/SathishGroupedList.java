package collections;

import java.util.List;

public class SathishGroupedList {
	
	private Long id;
	
	private List<Sathish> groupedList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Sathish> getGroupedList() {
		return groupedList;
	}

	public void setGroupedList(List<Sathish> groupedList) {
		this.groupedList = groupedList;
	}

	@Override
	public String toString() {
		return "SathishGroupedList [id=" + id + ", groupedList=" + groupedList + "]";
	}
	
}
