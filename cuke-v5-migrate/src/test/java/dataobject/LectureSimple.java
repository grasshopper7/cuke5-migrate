package dataobject;

import java.util.Map;

import lombok.Data;

@Data
public class LectureSimple {

	private Professor profName;

	private int size;

	private ProfLevels profLevel;

	public static LectureSimple createLecture(Map<String, String> entry) {
		LectureSimple lecture = new LectureSimple();
		lecture.setProfName(new Professor(entry.get("profName")));
		lecture.setSize(Integer.parseInt(entry.get("size")));
		lecture.setProfLevel(ProfLevels.valueOf(entry.get("profLevel").toUpperCase()));
		return lecture;
	}
}
