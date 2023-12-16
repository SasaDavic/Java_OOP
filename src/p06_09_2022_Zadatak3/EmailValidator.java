package p06_09_2022_Zadatak3;

public class EmailValidator extends Validator {
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		public EmailValidator(String email) {
		super();
		this.email = email;
	}
		@Override
		public ValidationResult validate() {
		ValidationResult result = new ValidationResult(); 
		if(!this.email.contains("@") || (!this.email.endsWith(".com") && !this.email.endsWith(".net"))) {
			result.addError("Email is invalid");
		}
		return result;
		}
}
