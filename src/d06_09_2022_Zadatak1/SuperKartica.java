package d06_09_2022_Zadatak1;

public class SuperKartica {
	private int brKartice;
	private String punoImeVlasnika;
	private double popustDin;
	public SuperKartica(int brKartice, String punoImeVlasnika, double popustDin) {
		super();
		this.brKartice = brKartice;
		this.punoImeVlasnika = punoImeVlasnika;
		this.popustDin = popustDin;
	}
	public SuperKartica() {
		super();
	}
	public int getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}
	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}
	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}
	public double getPopustDin() {
		return popustDin;
	}
	public void setPopustDin(double popustDin) {
		this.popustDin = popustDin;
	}
	public void stampajSyperKarticu() {
		System.out.println(this.brKartice + ", " + this.punoImeVlasnika);
	}
	
	

}
