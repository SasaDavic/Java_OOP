package p25_08_2022_Zadatak4;

public class InstagramUser {

		private String username;
		private String imeIprezime;
		private String email;
		
		public InstagramUser(String username, String imeIprezime, String email) {
			this.username = username;
			this.imeIprezime = imeIprezime;
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getImeIprezime() {
			return imeIprezime;
		}

		public void setImeIprezime(String imeIprezime) {
			this.imeIprezime = imeIprezime;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		// Method that returns a representation of the user object
		public void print() {
			System.out.println(this.imeIprezime + " (@" + this.username + ")");
	        }
		
		
}
