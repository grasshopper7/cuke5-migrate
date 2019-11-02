package dataobject;

import java.util.Arrays;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class FullName {

	private String firstName = "";

	private String title = "";

	private String middleName = "";

	public static FullName parseNameDetails(String name) {
		String[] names = name.split(" ");
		FullName fullName = new FullName();

		if (names.length >= 1)
			fullName.setTitle(names[names.length - 1]);
		if (names.length >= 2)
			fullName.setFirstName(names[0]);
		if (names.length > 2)
			fullName.setMiddleName(Arrays.stream(names, 1, names.length - 1).collect(Collectors.joining(" ")));

		return fullName;
	}
}
