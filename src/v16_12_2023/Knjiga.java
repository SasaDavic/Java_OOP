package v16_12_2023;

public class Knjiga {
	private String nalov;
	private String autor;
	private int brStrana;
	private int godinaIzdanja;
	
	public String getNalov() {
		return nalov;
	}
	public void setNalov(String nalov) {
		this.nalov = nalov;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getBrStrana() {
		return brStrana;
	}
	public void setBrStrana(int brStrana) {
		this.brStrana = brStrana;
	}
	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	public Knjiga(String nalov, String autor, int brStrana, int godinaIzdanja) {
		super();
		this.nalov = nalov;
		this.autor = autor;
		this.brStrana = brStrana;
		this.godinaIzdanja = godinaIzdanja;
	}
	
	public void stampaj() {
		System.out.println(this.nalov + " - " + this.autor);
		System.out.println("Izdanje: " + this.godinaIzdanja);
		System.out.println("Broj strana: " + this.brStrana);
	}
}
