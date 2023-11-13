package d18_08_2022_Zadatak1;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaGrami;
	
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
	}
	public void povecajCenu(double poskupljenje) {
		this.cena += poskupljenje;
	}
	
	public double vratiCenuSaPopustom(int popust) {
		if (popust > 100 || popust < 0) {
			System.out.println("Greska! Unesite procenat popusta (0-100)!");
			return this.cena;
		} else {
			return this.cena * (100 - popust) /100;
		}		
	}
	
	public double racunajPostarinu() {
		if (this.tezinaGrami <= 100) {
			return 200;
		} else if (this.tezinaGrami <= 500) {
			return 400;
		} else {
			return 1000;
		}
	}
	


}
