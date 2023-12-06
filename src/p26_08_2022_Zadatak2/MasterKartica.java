package p26_08_2022_Zadatak2;

public class MasterKartica extends PlatnaKartica {
	
	
	public MasterKartica(double novac$, String broj, int godinaIstekaKartice, int mesecIstekaKartice) {
		super(novac$, broj, godinaIstekaKartice, mesecIstekaKartice);
	}
	
	
	private double racunajProviziju(double transakcija) {
		double provizija = transakcija * 0.015;
		
		return provizija;
	}
	
	@Override
	public void izvrsiTransakciju(double transakcija) {
		super.izvrsiTransakciju(transakcija + racunajProviziju(transakcija));
	}
	
	public void naplatiOdrzavanje() {
		this.novac$ -= 2;
	}
	
	public void stampaj() {
		System.out.print("Master Card: ");
		super.stampaj();
		System.out.println();
	}
	  
}
