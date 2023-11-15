package p22_08_2022_Zadatak2;

public class FacebookPost {
	
	private String opis;
	private Korisnik korisnik;
	
	
	public FacebookPost(String opis) {
		this.opis = opis;
	}
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public void print() {
		korisnik.stampa();
		System.out.println(this.opis);
	}
	
}
