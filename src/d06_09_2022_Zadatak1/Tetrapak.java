package d06_09_2022_Zadatak1;

public class Tetrapak extends Ambalaza {
	private boolean mozeSeReciklirati;
	private double osnovnaCena;
	
	public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean mozeSeReciklirati,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.mozeSeReciklirati = mozeSeReciklirati;
		this.osnovnaCena = osnovnaCena;
	}
	public Tetrapak() {
		super();
	}
		
	public boolean isMozeSeReciklirati() {
		return mozeSeReciklirati;
	}
	public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
		this.mozeSeReciklirati = mozeSeReciklirati;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}


		@Override
		public double cenaArtikla() {
			if(this.mozeSeReciklirati == true) {
				return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
			} else {
				return this.osnovnaCena;
			}
		}
		@Override
		public void stampaj() {	
			System.out.println("---------------------------------------------------");
			System.out.println("Naziv artikla: " +this.nazivArtikla);
			System.out.println("Moze da se reciklira: " + this.mozeSeReciklirati);
			System.out.println("Cena artikla: " + this.cenaArtikla());
			System.out.println("Barkod: " + this.barkod);
			System.out.println("---------------------------------------------------");
		}
}
