package dataobject;

import lombok.Data;

@Data
public class Speech {

	private String text;
	private int lines;
	private int words;

	public Speech(String text) {
		this.text = text;
		this.lines = text.split("[\\n\\r]+").length;
		this.words = text.split("[\\s]+").length;
	}
}
