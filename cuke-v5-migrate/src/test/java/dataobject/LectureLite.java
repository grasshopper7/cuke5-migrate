package dataobject;

import java.util.List;

import lombok.Data;

@Data
public class LectureLite {

	private Professor profName;

	private Topic topic;

	private int size;

	private int frequency;

	private Rooms rooms;

	public static LectureLite createLectureLite(List<String> row) {
		LectureLite lecture = new LectureLite();
		lecture.setProfName(new Professor(row.get(0)));
		lecture.setTopic(Topic.parseTopic(row.get(1)));
		lecture.setSize(Integer.parseInt(row.get(2)));
		lecture.setFrequency(Integer.parseInt(row.get(3)));
		lecture.setRooms(Rooms.parseRooms(row.get(4)));
		return lecture;
	}
}
