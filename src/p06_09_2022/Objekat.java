package p06_09_2022;

public abstract class Objekat {
	protected String adresa;
	protected double povrsinaObjekta;
	protected int zona; //1.2 ili 3
	
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public double getPovrsinaObjekta() {
		return povrsinaObjekta;
	}
	public void setPovrsinaObjekta(double povrsinaObjekta) {
		this.povrsinaObjekta = povrsinaObjekta;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public Objekat(String adresa, double povrsinaObjekta, int zona) {
		super();
		this.adresa = adresa;
		this.povrsinaObjekta = povrsinaObjekta;
		this.zona = zona;
	}
	public double koeficijentZaPorez() {
		if (this.zona == 1) {
			return 1.4;
		} else if (this.zona == 2) {
			return 1.1;
		} else if (this.zona == 3) {
			return 1.05;
		} else return 0;
	}
	public abstract double porez();
	public abstract void stampaj();
	
}
