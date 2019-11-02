package migrate;

import dataobject.Speech;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;

public class DocStringTypeStepDefinition {

	@DocStringType
	public Speech getSpeech(String text) {
		return new Speech(text);
	}

	@Given("the doc string is")
	public void the_doc_string_is(Speech speech) {
		System.out.println(speech);
	}
}
