package p06_09_2022_Zadatak3;

public class PhoneValidator extends Validator{
	private String brTelefona;
	
	
	public PhoneValidator(String brTelefona) {
		super();
		this.brTelefona = brTelefona;
	}

	public String getBrTelefona() {
		return brTelefona;
	}

	public void setBrTelefona(String brTelefona) {
		this.brTelefona = brTelefona;
	}
	public boolean containsDigit(String string) {
		  for (int i = 1; i < string.length(); i++) {
		    if (Character.isDigit(string.charAt(i))) {
		      return true;
		    }
		  }

		  return false;
		}
		@Override
		public ValidationResult validate() {
		ValidationResult result = new ValidationResult();
			if(!this.brTelefona.startsWith("+")) {
				result.addError("Phone number must start with +");
			}
			if(this.brTelefona.contains(" ")) {
				result.addError("Phone number cannot contain spaces");
			}
			if(containsDigit(brTelefona) == false) {
				result.addError("Phone number can only contain numbers");
			}
			return result;
		}

}
