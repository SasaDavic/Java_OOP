package p19_08_2022_Zadatak2;

public class Radnik {
	private String jmbg;
	private String punoIme;
	private int brDece;
	private int sss; // 1-8
	private int godRadnogStaza;
	
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Radnik(String jmbg, String punoIme, int brDece, int sss, int godRadnogStaza) {
		this.jmbg = jmbg;
		this.punoIme = punoIme;
		this.brDece = brDece;
		this.sss = sss;
		this.godRadnogStaza = godRadnogStaza;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getBrDece() {
		return brDece;
	}

	public void setBrDece(int brDece) {
		this.brDece = brDece;
	}

	public int getSss() {
		return sss;
	}

	public void setSss(int sss) {
		this.sss = sss;
	}

	public int getGodRadnogStaza() {
		return godRadnogStaza;
	}

	public void setGodRadnogStaza(int godRadnogStaza) {
		this.godRadnogStaza = godRadnogStaza;
	}

	public double minuliRad() {
		if (this.godRadnogStaza <= 10) {
			return 0.05;
		} else if (this.godRadnogStaza <= 20) {
			return 0.075;
		} else {
			return 0.1;
		}
	}
	
	public double koeficijentSlozenosti() {
		double koeficijent = 1;
		if (this.sss == 1) {
			koeficijent = 1.03;
		} else if (this.sss == 2) {
			koeficijent = 1.65;
		} else if (this.sss == 3) {
			koeficijent = 2;
		} else if (this.sss == 4) {
			koeficijent = 2.27;
		} else if (this.sss == 5) {
			koeficijent = 2.88;
		} else if (this.sss == 6) {
			koeficijent = 3.09;
		} else if (this.sss == 7) {
			koeficijent = 3.40;
		} else if (this.sss == 8) {
			koeficijent = 4.12;
		}
		return koeficijent;
	}
	
	public double racunajPlatu() {
		return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
	}

	public boolean kreditnoSposoban() {
		return (racunajPlatu() > 50000) ? true : false;
	}
	

	

	
}
