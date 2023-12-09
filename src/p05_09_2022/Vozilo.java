package p05_09_2022;

public abstract class Vozilo {
	protected String registracija;
	protected String marka;
	protected int brzina;
	protected int kubikaza;
	protected int maxBrzina;
	
	public Vozilo() {
	}
	
	public Vozilo(String registracija, String marka, int brzina, int kubikaza, int maxBrzina) {
		super();
		this.registracija = registracija;
		this.marka = marka;
		this.brzina = brzina;
		this.kubikaza = kubikaza;
		this.maxBrzina = maxBrzina;
	}





	public String getRegistracija() {
		return registracija;
	}



	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public int getBrzina() {
		return brzina;
	}



	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}



	public int getKubikaza() {
		return kubikaza;
	}



	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}



	public int getMaxBrzina() {
		return maxBrzina;
	}



	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}



	public abstract void stampaj();
	
	public void dodajGas() {
		this.brzina = this.brzina + 10;
	}
}
