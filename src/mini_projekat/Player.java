package mini_projekat;

public class Player {
	private String imeIprezime;
	
	public Player(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}
	public String getImeIprezime() {
		return imeIprezime;
	}
	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}
	public void print() {
		System.out.println("Igrac: " + this.imeIprezime);
	}

}
