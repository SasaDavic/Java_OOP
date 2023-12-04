package skocko;

public class SkockoGame {
	private int brojOdigranihPokusaja;
	private String polje1; //cuvaju trazenu kombinaciju
	private String polje2;
	private String polje3;
	private String polje4;
	private String odigrano1; //cuvaju poslednju odigranu kombinacju - njih postavljate kroz metodu
	private String odigrano2;
	private String odigrano3;
	private String odigrano4;
	
	public SkockoGame() {
	}
	

	public int getBrojOdigranihPokusaja() {
		return brojOdigranihPokusaja;
	}


	public String getPolje1() {
		return polje1;
	}


	public String getPolje2() {
		return polje2;
	}


	public String getPolje3() {
		return polje3;
	}


	public String getPolje4() {
		return polje4;
	}


	public String getOdigrano1() {
		return odigrano1;
	}


	public String getOdigrano2() {
		return odigrano2;
	}


	public String getOdigrano3() {
		return odigrano3;
	}


	public String getOdigrano4() {
		return odigrano4;
	}


	public void novaIgra(String polje1, String polje2, String polje3, String polje4) {
		this.polje1 = polje1;
		this.polje2 = polje2;
		this.polje3 = polje3;
		this.polje4 = polje4;
		this.brojOdigranihPokusaja = 0;
		this.odigrano1 = "";
		this.odigrano2 = "";
		this.odigrano3 = "";
		this.odigrano4 = "";		
	}
	
	public boolean isGameOver() {
		if (this.brojOdigranihPokusaja == 6) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isWinner() {
		if (this.polje1.equals(odigrano1) && this.polje2.equals(odigrano2) &&
				this.polje3.equals(odigrano3) && this.polje4.equals(odigrano4)) {
			return true;
		} else {
			return false;
		}
	}
	public void odigrajKombinaciju(String odigrano1, String odigrano2, String odigrano3, String odigrano4) {
		this.odigrano1 = odigrano1;
		this.odigrano2 = odigrano2;
		this.odigrano3 = odigrano3;
		this.odigrano4 = odigrano4;
		this.brojOdigranihPokusaja++;
	}
	
	public int brojPogodakaNaMestu() {
		int brojac = 0;
		if (this.polje1.equals(odigrano1)) {
			brojac++;
		}
		if (this.polje2.equals(odigrano2)) {
			brojac++;
		}
		if (this.polje3.equals(odigrano3)) {
			brojac++;
		}
		if (this.polje4.equals(odigrano4)) {
			brojac++;
		}
		return brojac;
	}
	public int brojPogodakaAliNisuNaMestu() {
		int brojac = 0;
		if (!this.polje1.equals(odigrano1) && (this.polje1.equals(odigrano2) || 
				this.polje1.equals(odigrano3) || this.polje1.equals(odigrano4))) {
			brojac++;
		}
		if (!this.polje2.equals(odigrano2) && (this.polje2.equals(odigrano3) ||
				this.polje2.equals(odigrano4))) {
			brojac++;
		}
		if (!this.polje3.equals(odigrano3) && this.polje3.equals(odigrano4)) {
			brojac++;
		}
		return brojac;
	}
	public void stampaTrazenuKombinacju() {
		System.out.println("Trazena kombinacija je:");
		System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " | " +
				this.polje4);
	}
	public void stampaOdigranuKombinacju() {
		System.out.println("Odigrana kombinacija br " + this.brojOdigranihPokusaja);
		System.out.println(this.odigrano1 + " | " + this.odigrano2 + " | " +
				this.odigrano3 + " | " + this.odigrano4);
	}

}
