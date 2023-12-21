package d06_09_2022_Zadatak1;

import java.util.ArrayList;

public class Korpa {
	private SuperKartica kartica;
	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

	public ArrayList<Ambalaza> getNizAmbalaza() {
		return nizAmbalaza;
	}

	public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
		this.nizAmbalaza = nizAmbalaza;
	}

	public SuperKartica getKartica() {
		return kartica;
	}

	public void setKartica(SuperKartica kartica) {
		this.kartica = kartica;
	}

	public Korpa() {
		super();
	}
	
	public void dodajAmbalazu(Ambalaza a) {
		nizAmbalaza.add(a);
	}
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			if(nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				nizAmbalaza.remove(i);
			}
		}
	}
	private double ukupnaCenaSaPopustom(double popust) {
		double suma = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			suma += nizAmbalaza.get(i).cenaArtikla();
		}
		return suma - popust;
	}
	public double cenaKorpe(SuperKartica kartica) {
		return ukupnaCenaSaPopustom(kartica.getPopustDin());
	}

	public void stampajKorpu() {
		System.out.println("Racun: ");
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			System.out.println(1 + i + ". ");
			nizAmbalaza.get(i).stampaj();
		}
		System.out.println("Super kartica: ");
		kartica.stampajSyperKarticu();
		System.out.println("****************************");
		System.out.println("Ukupna cena " + ukupnaCenaSaPopustom(0));
		if (this.kartica != null) {
			System.out.println("Cena sa popustom: " + cenaKorpe(kartica));
		}
		
	}
}
