package p26_08_2022_Zadatak2;

public class PlatnaKartica {
	
	protected double novac$;
	protected String broj;
	protected int godinaIstekaKartice;
	protected int mesecIstekaKartice;
		
	  public PlatnaKartica(double novac$, String broj, int godinaIstekaKartice, int mesecIstekaKartice) {
		this.novac$ = novac$;
		this.broj = broj;
		this.godinaIstekaKartice = godinaIstekaKartice;
		this.mesecIstekaKartice = mesecIstekaKartice;
	}
	  
	public double getNovac$() {
		return novac$;
	}
	public String getBroj() {
		return broj;
	}
	public int getGodinaIstekaKartice() {
		return godinaIstekaKartice;
	}
	public int getMesecIstekaKartice() {
		return mesecIstekaKartice;
	}

	public void dodajSredstva(double suma) {
		this.novac$ += suma;
	}
	
	public void izvrsiTransakciju(double transakcija) {
		this.novac$ -= transakcija;
	}
	
	public void stampaj() {
		System.out.println(this.broj + ", " + this.mesecIstekaKartice + "/" 
				+ this.godinaIstekaKartice + ", $" + this.novac$);
	}
	
}
