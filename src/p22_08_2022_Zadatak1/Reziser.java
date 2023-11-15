package p22_08_2022_Zadatak1;

public class Reziser {
	
	private String punoIme;
	private int starost;
	
	
	public Reziser() {
	}
	public Reziser(String punoIme, int starost) {
		this.punoIme = punoIme;
		this.starost = starost;
	}
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}

	public void print() {
		System.out.println(this.punoIme + ", " + this.starost + " god.");
	}

}	
