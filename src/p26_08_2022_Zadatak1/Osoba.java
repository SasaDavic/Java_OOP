package p26_08_2022_Zadatak1;

public class Osoba {
	protected String imeIprezime;
	protected String jmbg;
	
	
	
	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public Osoba(String imeIprezime, String jmbg) {
		super();
		this.imeIprezime = imeIprezime;
		this.jmbg = jmbg;
	}
	
	public void stampaj() {
		System.out.println(this.imeIprezime + ", " + this.jmbg);
	}

}
