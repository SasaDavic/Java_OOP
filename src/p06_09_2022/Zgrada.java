package p06_09_2022;

public class Zgrada extends Objekat {
	private int brojStanova;
	
	public int getBrojStanova() {
		return brojStanova;
	}
	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}
	public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
		super(adresa, povrsinaObjekta, zona);
		this.brojStanova = brojStanova;
	}
	
	@Override
	public double porez() {
		return koeficijentZaPorez() * this.povrsinaObjekta * this.brojStanova;
	}
	@Override
	public void stampaj() {
		System.out.println("Zgrada se nalazi na adresi: " + adresa);
		System.out.println("Povrsina stana je: " + povrsinaObjekta + "m2 i nalazi se u zoni " + zona + ".");
		System.out.println("Broj stanova u zgradi je: " + brojStanova);
		System.out.println("Porez: " + porez());
		
	} 
}
