package p06_09_2022_Zadatak3;

public class PasswordValidator extends Validator{
	
	private String password;
	
	public PasswordValidator(String password) {
		super();
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean containsUpperCaseCharacter(String string) {
		  for (int i = 0; i < string.length(); i++) {
		    if (Character.isUpperCase(string.charAt(i))) {
		      return true;
		    }
		  }

		  return false;
		}
	public boolean containsLowerCaseCharacter(String string) {
		  for (int i = 0; i < string.length(); i++) {
		    if (Character.isLowerCase(string.charAt(i))) {
		      return true;
		    }
		  }

		  return false;
		}
	
	public boolean containsDigit(String string) {
		  for (int i = 0; i < string.length(); i++) {
		    if (Character.isDigit(string.charAt(i))) {
		      return true;
		    }
		  }

		  return false;
		}
	
	@Override
	public ValidationResult validate() {
		ValidationResult result = new ValidationResult();
		if(!this.password.contains("@") && !this.password.contains("#") && 
				!this.password.contains("/") && !this.password.contains("*")) {
			result.addError("Password must contain at least one special character @, #, / or *");
		}
		if(this.password.length() < 8) {
			result.addError("Password must be minimum 8 characters");
		}
		if(containsUpperCaseCharacter(password) == false) {
			result.addError("Password must contain at least one uppercase letter");
		}
		if(containsLowerCaseCharacter(password) == false) {
			result.addError("Password must contain at least one lowercase letter");
		}
		if(containsDigit(password) == false) {
			result.addError("Password must contain at least one digit");
		}
		return result;
		
	}
		
	/*	
		
		Sadrzi bar jedan cifru. Koristan link, idite na kraj stranice to je najslicnije resenje onom iznad 
			Ukoliko se npr za password unese vrednost botcamp
			Metoda vraca rezultat sa greskama:
		Password must contain at least one uppercase letter
		Password must contain at least one special character @, # or *
		Password must be minimum 8 characters
		Password must contain at least one digit
		Kreirati klasu PhoneValidator koja nasledjuje klasu Validator i koja ima:
		 Atribut za broj telefona
		Geter i seter za broj telefona
		Broj telefona je validan ukoliko:
		Broj krece sa znakom +
		Ukoliko nema razmaka
		Sadrzi samo cifre
		Ukoliko se npr za broj telefona unese vrednost 5a5 555 55
			Metoda vraca rezultat sa greskama:
		Phone number must start with +
		Phone number cannot contain spaces
		Phone number can only contain numbers
*/
}
