package p23_08_2022_Zadatak2;

public class FizickoLice {
	
	private String punoIme;
	private String brLicneKarte;
	private String jmbg;
	private boolean vecKupovao;
		
	public FizickoLice(String punoIme, String brLicneKarte, String jmbg, boolean vecKupovao) {
		this.punoIme = punoIme;
		this.brLicneKarte = brLicneKarte;
		this.jmbg = jmbg;
		this.vecKupovao = vecKupovao;
	}
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getBrLicneKarte() {
		return brLicneKarte;
	}
	public void setBrLicneKarte(String brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}
	public boolean isVecKupovao() {
		return vecKupovao;
	}
	public void setVecKupovao(boolean vecKupovao) {
		this.vecKupovao = vecKupovao;
	}
	public String getJmbg() {
		return jmbg;
	}

	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brLicneKarte);
	}
	

}
