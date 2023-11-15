package p22_08_2022_Zadatak3;

public class ClanskaKarta {
	private int popust; //5-10
	private String brKartice;
	
	
	public ClanskaKarta(int popust, String brKartice) {
		this.popust = popust;
		this.brKartice = brKartice;
	}
	
	
	public int getPopust() {
		return popust;
	}


	public void setPopust(int popust) {
		this.popust = popust;
	}


	public String getBrKartice() {
		return brKartice;
	}


	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}


	
}
