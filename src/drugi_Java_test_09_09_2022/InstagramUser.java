package drugi_Java_test_09_09_2022;

public class InstagramUser {
	private String username;
	private String ime;
	private String prezime;
	
	public InstagramUser(String username, String ime, String prezime) {
		super();
		this.username = username;
		this.ime = ime;
		this.prezime = prezime;
	}
	public InstagramUser(String username) {
		super();
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public void stampaj() {
		System.out.println("@" + this.username + " \t " + this.ime + " " + this.prezime);
	}
	public String linkProfila(String username) {
		return "https://www.instagram.com/" + this.username + "/";
	}
		
	
}
