package p22_08_2022_Zadatak2;

public class Korisnik {
	
	private String ime;
	private String prezime;
	
	
	public Korisnik() {
	}

	public Korisnik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void stampa() {
		System.out.println(this.ime + " " + this.prezime);
	}

}
