package p23_08_2022_Zadatak4;

public class ViberPoruka {

	private String text;
	private String vremePoslatePoruke;
	private ViberKorisnik poslaoPoruku;
	private ViberKorisnik primioPoruku;
	private ViberReakcija reakcija;

	
	
	public ViberReakcija getReakcija() {
		return reakcija;
	}

	public void setReakcija(ViberReakcija reakcija) {
		this.reakcija = reakcija;
	}

	public ViberPoruka(String text, String vremePoslatePoruke, ViberKorisnik poslaoPoruku, ViberKorisnik primioPoruku) {
		this.text = text;
		this.vremePoslatePoruke = vremePoslatePoruke;
		this.poslaoPoruku = poslaoPoruku;
		this.primioPoruku = primioPoruku;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVremePoslatePoruke() {
		return vremePoslatePoruke;
	}

	public void setVremePoslatePoruke(String vremePoslatePoruke) {
		this.vremePoslatePoruke = vremePoslatePoruke;
	}

	public ViberKorisnik getPoslaoPoruku() {
		return poslaoPoruku;
	}

	public void setPoslaoPoruku(ViberKorisnik poslaoPoruku) {
		this.poslaoPoruku = poslaoPoruku;
	}


	public ViberKorisnik getPrimioPoruku() {
		return primioPoruku;
	}


	public void setPrimioPoruku(ViberKorisnik primioPoruku) {
		this.primioPoruku = primioPoruku;
	}

	
	public void print() {
		if (this.poslaoPoruku.getAktivan() == true ) {
			System.out.println("From: " + this.poslaoPoruku.getPunoIme() + 
					" * Active Now - at " + this.vremePoslatePoruke);
		} else {
			System.out.println("From: " + this.poslaoPoruku.getPunoIme() + 
					" * Not Active - at " + this.vremePoslatePoruke);
		}
		System.out.println("To: " + this.primioPoruku.getPunoIme());
		if (this.reakcija != null) {
			System.out.println(this.text + " : " + this.reakcija.getEmoji() + 
					" from " + this.reakcija.getReagovao().getPunoIme());
		} else {
			System.out.println(this.text);
		}
		 
	}



	
	
}
