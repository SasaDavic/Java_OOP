package d23_08_2022_Zadatak3;

public class Ringla {
	private String tip; //obicna ili ekspres
	private int jacina; //0-3 //0-12
	private double jacinaGrejacaKw; //0.8, 1, 1.5, …
	
	public Ringla(String tip, double jacinaGrejacaKw) {
		this.jacina = 0;
		this.tip = tip;
		this.jacinaGrejacaKw = jacinaGrejacaKw;
	}

	public int getJacina() {
		return jacina;
	}

	public void setJacina(int jacina) {
		this.jacina = jacina;
	}
	
	private int maxBrPojacavanja() {
		if (this.tip.equals("obicna")) {
			return 3;
		}
		if (this.tip.equals("ekspres")) {
			return 12;
		}
		return 0;
	}
	
	public void pojacajRinglu() {
		this.jacina += 1;
		if(this.tip.equals("obicna")) {
			if(this.jacina > 3) {
				this.jacina = 3;
			}
		} else if(this.tip.equals("ekspres")) {
			if(this.jacina > 12) {
				this.jacina = 12;
			}
		}
	}
	public void iskljuciRinglu() {
		this.jacina = 0;
	}

	public boolean ukljucenaRingla() {
		if(this.jacina > 0) {
			return true;
		} else {
			return false;
		}
	}
	public double potrosnjaEE(double kolikoSatiRinglaRadi) {
		return 100 / maxBrPojacavanja() * this.jacina * this.jacinaGrejacaKw * kolikoSatiRinglaRadi;
	}
	
	public void stampaj() {
		if (ukljucenaRingla() == true) {
			System.out.println("Ringla je ukljucena!");
		} else {
			System.out.println("Ringla je iskljucena!");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejacaKw + " kW");
	}

}
