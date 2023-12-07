package p26_08_2022_Zadatak3;

public class Paket {
	protected String nazivPaketa;
	protected String punoImeKorisnika;
	protected double mesecnaCena;
	protected int ugovornaObaveza; //koliko meseci
	protected int brzinaZaDownload;
	protected int brzinaZaUpload;
	
	

		public Paket(String nazivPaketa, String punoImeKorisnika, double mesecnaCena, int ugovornaObaveza,
			int brzinaZaDownload, int brzinaZaUpload) {
		this.nazivPaketa = nazivPaketa;
		this.punoImeKorisnika = punoImeKorisnika;
		this.mesecnaCena = mesecnaCena;
		this.ugovornaObaveza = ugovornaObaveza;
		this.brzinaZaDownload = brzinaZaDownload;
		this.brzinaZaUpload = brzinaZaUpload;
	}
		
		public String getPunoImeKorisnika() {
			return punoImeKorisnika;
		}
		public void setPunoImeKorisnika(String punoImeKorisnika) {
			this.punoImeKorisnika = punoImeKorisnika;
		}
		public double getMesecnaCena() {
			return mesecnaCena;
		}
		public void setMesecnaCena(double mesecnaCena) {
			this.mesecnaCena = mesecnaCena;
		}
		public int getUgovornaObaveza() {
			return ugovornaObaveza;
		}
		public void setUgovornaObaveza(int ugovornaObaveza) {
			this.ugovornaObaveza = ugovornaObaveza;
		}
		public String getNazivPaketa() {
			return nazivPaketa;
		}
		public int getBrzinaZaDownload() {
			return brzinaZaDownload;
		}
		public int getBrzinaZaUpload() {
			return brzinaZaUpload;
		}

		public void produziUgovor12meseci() {
			this.ugovornaObaveza += 12;
		}
		
		public int kolikoMeseciPlacateDinar() {
			return 0;
		}

		public void stampaj() {
			System.out.println("Ime i prezime korisnika: " + this.punoImeKorisnika);
			System.out.println(this.nazivPaketa + " - " + this.brzinaZaDownload + "/" + this.brzinaZaUpload
								+ " - " + this.ugovornaObaveza);
			System.out.println("Cena: " + this.mesecnaCena);
		}
		

}
