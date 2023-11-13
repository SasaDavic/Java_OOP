package d18_08_2022_Zadatak3;

public class SmartAirConditioning {
	public String marka;
	public int potrosnjaHladi;
	public int potrosnjaGreje;
	public int temperatura; //16-35
	public String mod;
	
	public void stampaj() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura);
	}
	
	public int mesecnaPotrosnjaKw() {
		if (this.mod.equals("hladi")) {
			return 30 * 15 * this.potrosnjaHladi;
		} else if (this.mod.equals("greje")) {
			return 30 * 15 * this.potrosnjaGreje;
		} else {
			return 0;
		}
	}
	
	public int racunZaStruju() {
		if (this.mesecnaPotrosnjaKw() <= 350) {
			return this.mesecnaPotrosnjaKw() * 6;
		} else {
			return 350 * 6 + (this.mesecnaPotrosnjaKw() - 350) * 9;
		}
	}

}
