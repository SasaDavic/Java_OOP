package p06_09_2022_Zadatak4;

public abstract class Atleticar {
	private String punoIme;
	protected double rezultat;
	
	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getRezultat() {
		return rezultat;
	}

	public void setRezultat(double rezultat) {
		this.rezultat = rezultat;
	}

	public Atleticar(String punoIme, double rezultat) {
		super();
		this.punoIme = punoIme;
		this.rezultat = rezultat;
	}

	public abstract boolean boljiRezultatOd(Atleticar atleticar);

	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.rezultat);
	}
		
}
