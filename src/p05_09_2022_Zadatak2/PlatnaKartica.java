package p05_09_2022_Zadatak2;

public abstract class PlatnaKartica {
	
	protected double suma;
	protected String brKartice;
	protected int godIsteka;
	protected int mesecIsteka;
	
	public PlatnaKartica(double suma, String brKartice, int godIsteka, int mesecIsteka) {
		this.suma = suma;
		this.brKartice = brKartice;
		this.godIsteka = godIsteka;
		this.mesecIsteka = mesecIsteka;
	}
		
	public double getSuma() {
		return suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public int getGodIsteka() {
		return godIsteka;
	}
	public int getMesecIsteka() {
		return mesecIsteka;
	}


	public void dodajSredstva(double dodaj) {
		this.suma += dodaj;
	}

	public abstract void izvrsiTransakciju(double transakcija);
	
	public abstract void stampaj();
}
