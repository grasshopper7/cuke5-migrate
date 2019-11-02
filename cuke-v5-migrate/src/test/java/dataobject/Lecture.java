package dataobject;

import java.util.Map;

import lombok.Data;

@Data
public class Lecture {

	private Professor profName;
	
	private Topic topic;
	
	private int size;
	
	private int frequency;
	
	private Rooms rooms;

	public static Lecture createLecture(Map<String, String> entry) {
		Lecture lecture = new Lecture();
		lecture.setProfName(new Professor(entry.get("profName")));
		lecture.setSize(Integer.parseInt(entry.get("size")));
		lecture.setFrequency(Integer.parseInt(entry.get("frequency")));
		lecture.setRooms(Rooms.parseRooms(entry.get("rooms")));
		lecture.setTopic(Topic.parseTopic(entry.get("topic")));
		return lecture;
	}	
}
