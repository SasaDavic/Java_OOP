package p23_08_2022_Zadatak4;

public class ViberKorisnik {

	private String punoIme;
	private String brTelefona;
	private boolean aktivan;
	
	
	
	public ViberKorisnik(String punoIme, String brTelefona) {
		this.punoIme = punoIme;
		this.brTelefona = brTelefona;
		this.aktivan = true;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getBrTelefona() {
		return brTelefona;
	}
	public void setBrTelefona(String brTelefona) {
		this.brTelefona = brTelefona;
	}
	public boolean getAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	
	
}
