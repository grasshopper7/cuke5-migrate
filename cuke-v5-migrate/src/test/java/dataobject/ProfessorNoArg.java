package dataobject;

import lombok.Data;

@Data
public class ProfessorNoArg {

	private String profName;
		
	public static ProfessorNoArg parseProfessor(String name) {
		ProfessorNoArg prof = new ProfessorNoArg();
		prof.setProfName(name);
		return prof;
	}	
}
