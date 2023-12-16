package p06_09_2022;

public class Lokal extends Objekat {
	
	public Lokal(String adresa, double povrsinaObjekta, int zona) {
		super(adresa, povrsinaObjekta, zona);
	}
		@Override
		public double porez() {
			return koeficijentZaPorez() * povrsinaObjekta * 1.3;
		}
		@Override
		public void stampaj() {
			System.out.println("Lokal se nalazi na adresi: " + adresa);
			System.out.println("Povrsina lokala je: " + povrsinaObjekta + "m2 i nalazi se u zoni " + zona + ".");
			System.out.println("Porez: " + porez());			
		} 
}
