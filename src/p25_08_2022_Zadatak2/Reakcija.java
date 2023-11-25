package p25_08_2022_Zadatak2;

public class Reakcija {
	
	private String tipReakcije;
	private String imeKorisnika;
	
	
	public Reakcija(String tipReakcije, String imeKorisnika) {
		this.tipReakcije = tipReakcije;
		this.imeKorisnika = imeKorisnika;
	}
	
	public String getTipReakcije() {
		return tipReakcije;
	}


	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}


	public String getImeKorisnika() {
		return imeKorisnika;
	}


	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}


	
}
