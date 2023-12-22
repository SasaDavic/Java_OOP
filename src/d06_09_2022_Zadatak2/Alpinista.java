package d06_09_2022_Zadatak2;

public class Alpinista extends Planinar {
	private int poeni;
	
	public Alpinista(int identifikacioniBroj, String imeIPrezime, int poeni) {
		super(identifikacioniBroj, imeIPrezime);
		this.poeni = poeni;
	}
	
	
	public int getPoeni() {
		return poeni;
	}
	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + this.identifikacioniBroj + 
				" ime: " + this.imeIPrezime + " Broj poena: " + this.poeni);
		
	}
	@Override
	public double clanarina() {
		if (this.poeni != 0) {
			return 1500 - this.poeni * 50;
		}
		return 1500;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() <= 4000) {
			return true;
		}
		return false;
	}
	
}
