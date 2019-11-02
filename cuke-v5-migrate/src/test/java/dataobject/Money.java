package dataobject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Money {

	public String currency = "";

	public int main = 0;

	public int sec = 0;

	public static Money parseMoneyDetails(String value) {
		Matcher matcher = Pattern.compile("^([\\D]*)([\\d]+)\\.([\\d][\\d])$").matcher(value);
		matcher.find();
		return new Money(matcher.group(1), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
	}
}
