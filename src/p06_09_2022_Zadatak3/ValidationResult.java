package p06_09_2022_Zadatak3;

import java.util.ArrayList;

public class ValidationResult {
	
	private boolean hasErrors;
	private ArrayList<String> errors = new ArrayList<String>();
	
	public ValidationResult() {
		super();
		this.hasErrors = false;
	}
	public boolean isHasErrors() {
		return hasErrors;
	}
	public ArrayList<String> getErrors() {
		return errors;
	}
	public void addError(String error) {
		this.hasErrors = true;
		errors.add(error);
	}
	public void printErrors() {
		if(this.hasErrors == false) {
			System.out.println("No validation errors");
		} else {
			for (int i = 0; i < errors.size(); i++) {
				System.out.print(i + 1 + ". ");
				System.out.println(errors.get(i));
			}
		}
	}
	
}
