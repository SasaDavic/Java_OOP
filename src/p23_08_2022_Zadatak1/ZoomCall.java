package p23_08_2022_Zadatak1;

public class ZoomCall {
	
	private String linkCall;
	private String password;
	private Korisnik host;
	private Korisnik guest;
	
	public ZoomCall(String linkCall, String password, Korisnik host) {
		this.linkCall = linkCall;
		this.password = password;
		this.host = host;
	}
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLinkCall() {
		return linkCall;
	}
	public Korisnik getHost() {
		return host;
	}
	public String getPassword() {
		return password;
	}
	
	public void pokreniPoziv() {
		System.out.println("Zoom Call: " + this.linkCall);
		System.out.println("Password: " + this.password);
		System.out.println("Host: " + this.host.getPunoIme());
		System.out.println("Guest: " + this.guest.getPunoIme());
		System.out.println("Maksimalno trajanje poziva je " + this.host.maxDuzinaVideoPoziva() + "min.");
	}
	

}
