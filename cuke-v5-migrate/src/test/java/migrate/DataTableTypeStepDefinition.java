package migrate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dataobject.Lecture;
import dataobject.LectureId;
import dataobject.LectureLite;
import dataobject.LecturePrimitive;
import dataobject.LecturePrimitiveEnum;
import dataobject.LectureSimple;
import dataobject.Lectures;
import dataobject.ProfLevels;
import dataobject.Professor;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

public class DataTableTypeStepDefinition {
	
	@DataTableType
	public Lecture getLecture(Map<String, String> entry) {
		return Lecture.createLecture(entry);
	}
	
	@DataTableType
	public LectureId getLectureId(String cell) {
		return new LectureId(Integer.parseInt(cell));
	}

	@DataTableType
	public LectureLite getLectureLite(List<String> row) {
		return LectureLite.createLectureLite(row);
	}

	@DataTableType
	public Lectures getLectures(DataTable table) {
		List<Lecture> lects = table.asMaps().stream().map(m -> Lecture.createLecture(m)).collect(Collectors.toList());
		return new Lectures(lects);
	}

	@DataTableType
	public Professor getProfessor(String cell) {
		return new Professor(cell);
	}

	@DataTableType
	public ProfLevels getProfLevel(String cell) {
		return ProfLevels.valueOf(cell.toUpperCase());
	}

	@Given("the list string lecture details are")
	public void theListStringLectureDetailsAre(List<List<String>> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list primitive lecture details are")
	public void thePrimitiveLectureDetailsAre(List<LecturePrimitive> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list primitive enum lecture details are")
	public void thePrimitiveEnumLectureDetailsAre(List<LecturePrimitiveEnum> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list simple lecture object details are")
	public void theSimpleLectureObjectDetailsAre(List<LectureSimple> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list lecture details are")
	public void theLectureDetailsAre(List<Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("^switch the list lecture details are$")
	public void switchTheLectureDetailsAre(@Transpose List<Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the list no header lecture details are")
	public void theListNoHeaderLectureDetailsAre(List<LectureLite> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the map primitive key value")
	public void theMapPrimitiveKeyValue(Map<String, String> profs) {
		System.out.println("");
		System.out.println(profs);
	}

	@Given("the map object key value")
	public void theMapObjectKeyValue(Map<Professor, ProfLevels> profs) {
		System.out.println("");
		System.out.println(profs);
	}

	@Given("the map primitive key lecture details are")
	public void theMapPrimitiveKey(Map<String, Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("the map lecture details are")
	public void theMapLectureDetailsAre(Map<LectureId, Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("switch the map lecture details are")
	public void switchTheMapLectureDetailsAre(@Transpose Map<LectureId, Lecture> lectures) {
		System.out.println("");
		System.out.println(lectures);
	}

	@Given("all lectures details")
	public void allLecturesDetails(Lectures lectures) {
		System.out.println("");
		System.out.println(lectures);
	}
}
