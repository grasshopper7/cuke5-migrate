package dataobject;

import lombok.Data;

@Data
public class LectureId {

	private int id;
	
	public LectureId(String id) {
		this.id = Integer.parseInt(id);
	}

	public LectureId(int id) {
		this.id = id;
	}
}
