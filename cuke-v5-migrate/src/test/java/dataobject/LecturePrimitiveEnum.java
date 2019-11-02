package dataobject;

import java.util.Map;

import lombok.Data;

@Data
public class LecturePrimitiveEnum {

	private String profName;
	
	private int size;
		
	private ProfLevels profLevel;

	public static LecturePrimitiveEnum createLecture(Map<String, String> entry) {
		LecturePrimitiveEnum lecture = new LecturePrimitiveEnum();
		lecture.setProfName(entry.get("profName"));
		lecture.setSize(Integer.parseInt(entry.get("size")));
		lecture.setProfLevel(ProfLevels.valueOf(entry.get("profLevel").toUpperCase()));
		return lecture;
	}	
}
