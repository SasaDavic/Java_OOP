package p23_08_2022_Zadatak1;

public class Korisnik {
	
	private String punoIme;
	private String tipLicence;
	
	public Korisnik() {
		this.tipLicence = "basic";
	}

	public Korisnik(String punoIme) {
		this.punoIme = punoIme;
		this.tipLicence = "basic";
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipLicence() {
		return tipLicence;
	}
	
	public void pretplatiSe(int uplata) {
		if (uplata == 100) {
			this.tipLicence = "pro";
		} else if (uplata == 150) {
			this.tipLicence = "premium";
		} else {
			System.out.println("Greska! Cena paketa je $100 i $150!");
		}
	}
	
	public void ponistiPretplatu() {
		this.tipLicence = "basic";
	}
	
	public int maxDuzinaVideoPoziva() {
		if (this.tipLicence.equals("basic")) {
			return 40;
		} else if (this.tipLicence.equals("pro")) {
			return 240;
		} else if (this.tipLicence.equals("premium")) {
			return 1440;
		}
		return 0;
	}
	
	public void print() {
		System.out.println(this.punoIme);
	}
	
}
