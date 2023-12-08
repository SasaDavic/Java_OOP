package d26_08_2022_Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba{
	
	private int brojIgraca;
	private String pozicija;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean jeKapiten;
	
	public Igrac() {
		super();
	}


		public Igrac(String punoIme, String jmbg, int godRodjenja, int brojIgraca, 
				String pozicija, boolean jeKapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}


		public int getBrojIgraca() {
			return brojIgraca;
		}


		public void setBrojIgraca(int brojIgraca) {
			this.brojIgraca = brojIgraca;
		}


		public String getPozicija() {
			return pozicija;
		}


		public void setPozicija(String pozicija) {
			this.pozicija = pozicija;
		}


		public boolean isJeKapiten() {
			return jeKapiten;
		}


		public void setJeKapiten(boolean jeKapiten) {
			this.jeKapiten = jeKapiten;
		}

		public void dodajKarton(Karton karton) {
			kartoni.add(karton);
		}
		
		public int brojZutih() {
			int brojac = 0;
			for (int i = 0; i < kartoni.size(); i++) {				
				if (kartoni.get(i).getTip().equals("zuti")) {
					brojac++;
				}
			}
			return brojac;
		}
		
		public int brojCrvenih() {
			int brojac = 0;
			for (int i = 0; i < kartoni.size(); i++) {				
				if (kartoni.get(i).getTip().equals("crveni")) {
					brojac++;
				}
			}
			return brojac;
		}
		@Override
		public void stampaj() {
			super.stampaj();
			System.out.println("Broj zutih kartona: " + this.brojZutih());
			System.out.println("Broj zutih kartona: " + this.brojCrvenih());
		}
	


}
