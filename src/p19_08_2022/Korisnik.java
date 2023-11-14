package p19_08_2022;

public class Korisnik {
	private String ime;
	private String prezime;
	private String email;
	
	
//	difoltni konstuktor
	public Korisnik() {

	}
//	konstruktor sa paramterima
	public Korisnik(String i, String p, String e) {
		this.ime = i;
		this.prezime = p;
		this.email = e;
	}
	
	public Korisnik(String ime) {
		this.ime = ime;
	}
	
	public void stamapaj() {
		System.out.println(this.ime);
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getIme() {
		return this.ime;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	
//	public void setNazivAtributa(TipAtributa nazivAtributa) {
//		this.nazivAtributa = nazivAtributa;
//	}
}
