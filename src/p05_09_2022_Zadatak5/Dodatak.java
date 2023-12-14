package p05_09_2022_Zadatak5;

public class Dodatak {
	private String naziv;
	private double cena;
	
	
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
	public Dodatak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	public Dodatak() {
		super();
	}

	public void stampaj() {
		System.out.println(this.naziv + " " + this.cena);
	}

}
