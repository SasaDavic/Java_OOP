package p25_08_2022;

public class Film {
	private String naziv;
	private int godina;
	
	public Film(String naziv, int godina) {
		this.naziv = naziv;
		this.godina = godina;
	}
	
	
	public void stampaj() {
		System.out.println(this.naziv + " " + this.godina + ".god");
		 
	}

}
