package p06_09_2022_Zadatak2;

public class Dodatak {

	private String naziv;
	private double cena;
	public Dodatak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public void stampaj() {
		System.out.println(this.naziv + " " + this.cena);
	}
	
}
