package p16_08_2022_Zadatak3;

public class Auto {
	public String imeVozaca;
    public String marka;
	public int brojVrata;
	public double potrosnjuNa100km;
	public int trenutnaBrzinu;
	
	public int godProizvodnje;
	public int mesecRegistracije;
	public int kubikaza;
	
	public void stampaj() {
		System.out.println(this.imeVozaca);
		System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnjuNa100km + " l na 100km");
		System.out.println(this.trenutnaBrzinu + "km/h je trenutna brzina.");
	}
	
	public boolean jePrekoracio(int ogranicenje) {
		if(this.trenutnaBrzinu > ogranicenje) {
			return true;
		} else {
			return false;
		}
	}

	public int kazna(int ogranicenje) {
		if (jePrekoracio(ogranicenje) == true) {
			int x = (this.trenutnaBrzinu - ogranicenje) * 1000;
			return x;
		} else {
			return 0;
		}
	}
	
	public boolean oldtimer() {
		return (this.godProizvodnje < 1950) ? true : false;
	}
	
	public boolean isteklaRegistracija(int trenutniMesec) {
		return (this.mesecRegistracije <= trenutniMesec) ? false : true;
	}
	
	public double cenaRegistracija() {
		if (this.kubikaza <= 2000) {
			return kubikaza * 100;
		} else {
			return kubikaza * 100 * 1.3;
		}
	}
	

}