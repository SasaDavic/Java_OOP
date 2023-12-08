package d26_08_2022_Zadatak1;

public class Igrac extends Osoba {
	
	private int brojIgraca;
	private String pozicija;
	private boolean kapiten;
	
	protected Igrac(String punoIme, String jmbg, int godRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}
	
	public Igrac() {
		super();
	}
	
	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	
	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Pozicija: " + this.pozicija + ", broj dresa je " + this.brojIgraca);
		if (this.kapiten == true) {
			System.out.println("Igrac je kapiten!");
		}
	}

}
