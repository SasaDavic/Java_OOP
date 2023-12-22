package d06_09_2022_Zadatak2;

public abstract class Planinar {
	protected int identifikacioniBroj;
	protected String imeIPrezime;
	public Planinar(int identifikacioniBroj, String imeIPrezime) {
		super();
		this.identifikacioniBroj = identifikacioniBroj;
		this.imeIPrezime = imeIPrezime;
	}
	public int getIdentifikacioniBroj() {
		return identifikacioniBroj;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public abstract void stampaj();
	
	public abstract double clanarina();
	
	public abstract boolean uspesanUspon(Planina planina);
	

}
