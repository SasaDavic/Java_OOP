package p06_09_2022;

public class Kuca extends Objekat {
	private int brojUkucana;
	
	public int getBrojUkucana() {
		return brojUkucana;
	}
	public void setBrojUkucana(int brojUkucana) {
		this.brojUkucana = brojUkucana;
	}
	
	public Kuca(String adresa, double povrsinaObjekta, int zona, int brojUkucana) {
		super(adresa, povrsinaObjekta, zona);
		this.brojUkucana = brojUkucana;
	}
	@Override
	public double porez() {
		double x = povrsinaObjekta;
		return koeficijentZaPorez() * x;
	}
	@Override
	public void stampaj() {
		System.out.println("Kuca se nalazi na adresi: " + adresa);
		System.out.println("Povrsina kuce je: " + povrsinaObjekta + "m2 i nalazi se u zoni " + zona + ".");
		System.out.println("U kuci trenutno zivi " + brojUkucana + " clana.");
		System.out.println("Porez: " + porez());
		
	}
	
//	porez racuna po formuli: koeficijent * povrsina.
//	prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
}
