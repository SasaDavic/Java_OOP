package p26_08_2022_Zadatak2;

public class VisaKartica extends PlatnaKartica{
	
	private String ovlascenoLice;
	
	public String getOvlascenoLice() {
		return ovlascenoLice;
	}
	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}
	public VisaKartica(double novac$, String broj, int godinaIstekaKartice, int mesecIstekaKartice,
			String ovlascenoLice) {
		super(novac$, broj, godinaIstekaKartice, mesecIstekaKartice);
		this.ovlascenoLice = ovlascenoLice;
	}
	private double racunajProviziju(double transakcija) {
		double provizija = transakcija * 0.018;
		if (provizija < 4) {
			provizija = 4;
		}
		return provizija;
	}
	
	@Override
	public void izvrsiTransakciju(double transakcija) {
		
		super.izvrsiTransakciju(transakcija + racunajProviziju(transakcija));
	}
	  
	public void stampaj() {
		System.out.print("Visa Card: ");
		super.stampaj();
		System.out.println();
	}
	
}
