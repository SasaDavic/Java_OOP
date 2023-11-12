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
	
	public String brRegistracije;
	public boolean ukljucenaKlima;
	
	public int maxBrzina;
	
	public int kapacitetRezervoara;
	public int trenutnoGoriva;
	
		
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
		return (this.mesecRegistracije < trenutniMesec) ? true : false;
	}
	
	public double cenaRegistracija() {
		if (this.kubikaza <= 2000) {
			return kubikaza * 100;
		} else {
			return kubikaza * 100 * 1.3;
		}
	}
	
	public void dodajGas() {
		this.trenutnaBrzinu += 10;
		if (this.trenutnaBrzinu > this.maxBrzina) {
			this.trenutnaBrzinu = this.maxBrzina;
		}
	}
	
	public void koci() {
		this.trenutnaBrzinu -= 10;
		if (this.trenutnaBrzinu < 0) {
			this.trenutnaBrzinu = 0;
		}
	}
	
	public double potrosnja() {
		double faktor = 1;
		if (this.ukljucenaKlima == true) {
			faktor = 1.2;
		}
		return (this.trenutnaBrzinu / 100.0 * this.potrosnjuNa100km) * faktor;
	}
	
	public void stampajTablu() {
		for (int i = 0; i < 100; i++) {
			int x = this.trenutnaBrzinu * 100 / this.maxBrzina;
			if (i < x) {
				System.out.print("|");
			} else {
				System.out.print(".");
			}
		}
		System.out.println(" " + this.trenutnaBrzinu + "/" + this.maxBrzina + "km/h");
	}
	
	public int natociGorivo(int kolikoTocite) {
		if (this.trenutnoGoriva + kolikoTocite <= this.kapacitetRezervoara) {
			return 170 * kolikoTocite;
		} else {
			return (this.kapacitetRezervoara - this.trenutnoGoriva) * 170;
		}
	}

}