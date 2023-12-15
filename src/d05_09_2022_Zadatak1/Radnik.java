package d05_09_2022_Zadatak1;

import java.util.ArrayList;

public abstract class Radnik {
	
		protected String punoIme;
		protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();
		
		
		
		public String getPunoIme() {
			return punoIme;
		}

		public void setPunoIme(String punoIme) {
			this.punoIme = punoIme;
		}

		public ArrayList<Sektor> getNizSektora() {
			return nizSektora;
		}

		public void setNizSektora(ArrayList<Sektor> nizSektora) {
			this.nizSektora = nizSektora;
		}

		public Radnik(String punoIme) {
			super();
			this.punoIme = punoIme;
		}

		public abstract double plata();
		
		public void zaposliSeUsektor(Sektor ime) {
			nizSektora.add(ime);
		}
}
