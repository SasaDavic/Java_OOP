package p26_08_2022;

public class Kamion extends Vozilo {
private int nosivost;	
	
	public Kamion() {
		super();
	}
	
	public Kamion(String registracija, String marka, int brzina,
				  int maxBrzina, int nosivost, int kubikaza) {
		super(registracija, marka, brzina, kubikaza, maxBrzina);
		this.nosivost = nosivost;
	}
	
	
	
	public void stamapajKamion() {
		this.stampaj();
		System.out.println("Nosivost: " + this.nosivost);
	}

}
