package dataobject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Rooms {

	private List<Room> rooms;

	public Rooms(String details) {
		this.setRooms(Arrays.stream(details.split(",")).map(Room::new).collect(Collectors.toList()));
	}

	public Rooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public static Rooms parseRooms(String rooms) {
		return new Rooms(Arrays.stream(rooms.split(",")).map(Room::new).collect(Collectors.toList()));
	}
}
