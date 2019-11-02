package dataobject;

import lombok.Data;

@Data
public class Topic {

	private String code;

	private String name;

	public Topic() {
	}

	public Topic(String details) {
		String[] topicData = details.split(":");
		this.code = topicData[0];
		this.name = topicData[1];
	}

	public Topic(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public static Topic parseTopic(String top) {
		String[] topicData = top.split(":");
		Topic topic = new Topic(topicData[0], topicData[1]);
		return topic;
	}
}
