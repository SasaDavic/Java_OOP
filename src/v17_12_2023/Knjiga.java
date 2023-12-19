package v17_12_2023;

public class Knjiga {
	
	private String naslov;
	private String autor;
	private int godinaIzdanja;
	private boolean dosupna;
	private int sifraKnjige;
	

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public boolean isDosupna() {
		return dosupna;
	}

	public void setDosupna(boolean dosupna) {
		this.dosupna = dosupna;
	}

	public int getSifraKnjige() {
		return sifraKnjige;
	}

	public void setSifraKnjige(int sifraKnjige) {
		this.sifraKnjige = sifraKnjige;
	}

	public Knjiga(String naslov, String autor, int godinaIzdanja, int sifraKnjige) {
		super();
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
		this.dosupna = true;
		this.sifraKnjige = sifraKnjige;
	}

	public Knjiga() {
		super();
	}
	
	public void stampajPodatke() {
		System.out.println("------------------------------------------");
		System.out.println(this.naslov + " - " + this.autor);
		System.out.println("Godina izdanja: " + this.godinaIzdanja);
		System.out.println("Sifra: " + this.sifraKnjige);
		if (this.dosupna == true) {
			System.out.println("Knjiga je dostupna!");
		} else {
			System.out.println("Knjiga je izdata!");
		}
		System.out.println("------------------------------------------");
	}
	
}
