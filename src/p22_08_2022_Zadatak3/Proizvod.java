package p22_08_2022_Zadatak3;

public class Proizvod {
	private String naziv;
	private Kupac kupac;
	private double cenaIzrade;
	
	
	public Proizvod(String naziv, double cenaIzrade) {
		this.naziv = naziv;
		this.cenaIzrade = cenaIzrade;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public double getCenaIzrade() {
		return cenaIzrade;
	}
	public void setCenaIzrade(double cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}

	public double racunajCenu() {
		return this.cenaIzrade * 1.9 * (100 - this.kupac.getKartica().getPopust()) / 100;
	}
	public void stampaj() {
		System.out.println(this.naziv + " - " + this.racunajCenu());
		kupac.stampaj();
	}
	
}
