package d06_09_2022_Zadatak1;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucijaZaFlasu;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;
	
	
	public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucijaZaFlasu,
			boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}
	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}
	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}
	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if(this.daLiSePlacaKaucija == true) {
			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}
	@Override
	public void stampaj() {
		System.out.println("---------------------------------------------------");
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Da li se placa kaucija: " + this.daLiSePlacaKaucija);
		System.out.println("Cena artikla: " + this.cenaArtikla());
		System.out.println("Barkod: " + this.barkod);
		System.out.println("---------------------------------------------------");
	}
	
}
