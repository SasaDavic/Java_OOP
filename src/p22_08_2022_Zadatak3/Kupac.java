package p22_08_2022_Zadatak3;

public class Kupac {
	private String punoIme;
	private ClanskaKarta kartica;
	
	
	public Kupac(String punoIme, ClanskaKarta kartica) {
		this.punoIme = punoIme;
		this.kartica = kartica;
	}
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public ClanskaKarta getKartica() {
		return kartica;
	}

	public void stampaj() {
		System.out.println(this.punoIme + " - " + this.kartica.getBrKartice());
	}
	
}
