package d23_08_2022_Zadatak2;

public class Racun {
	
	private String brRacuna;
	private String imeKlijenta;
	private double trenutnoStanje;
		
	public Racun(String brRacuna, String imeKlijenta, double trenutnoStanje) {
		this.brRacuna = brRacuna;
		this.imeKlijenta = imeKlijenta;
		this.trenutnoStanje = trenutnoStanje;
	}
	public String getBrRacuna() {
		return brRacuna;
	}
	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}
	public String getImeKlijenta() {
		return imeKlijenta;
	}
	public void setImeKlijenta(String imeKlijenta) {
		this.imeKlijenta = imeKlijenta;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public boolean promenaStanja(double uplata) {
		if (this.trenutnoStanje + uplata < 0) {
			System.out.println("Nemate dovoljno sredstava na racunu!");
			return false;
		} else {
			this.trenutnoStanje += uplata;
			return true;
		}
	}
	
	public void stampaj() {
		System.out.println(this.imeKlijenta + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd.");
	}
	
}
