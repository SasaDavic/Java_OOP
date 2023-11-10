package d16_08_2022_Zadatak1;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaGrami;
	
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
		System.out.println("tezina u kg: " + this.konvertuj("kg") + "kg");
		System.out.println("tezina u tonama: " + this.konvertuj("t") + "t");
	}
	public double konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			return this.tezinaGrami /1000;
		} else if (jedinica.equals("t")) {
			return this.tezinaGrami / 1000000;
		} else {
			return 0;
		}
	}
	
}
