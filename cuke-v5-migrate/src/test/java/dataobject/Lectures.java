package dataobject;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lectures {

	private List<Lecture> lectures;

	public List<Lecture> getLectures() {
		return Collections.unmodifiableList(lectures);
	}

	public boolean addLecture(Lecture lect) {
		return lectures.add(lect);
	}
}
