package p06_09_2022_Zadatak2;

import java.util.ArrayList;

public abstract class Proizvod {
		 
		protected ArrayList<Dodatak> dodaci = new ArrayList<>();
				
		public Proizvod() {
			super();
		}

		public ArrayList<Dodatak> getDodaci() {
			return dodaci;
		}

		public void setDodaci(ArrayList<Dodatak> dodaci) {
			this.dodaci = dodaci;
		}

		public double cenaDodataka() {
			double suma = 0;
			for (int i = 0; i < dodaci.size(); i++) {
				suma += dodaci.get(i).getCena();
			}
			return suma;
		}
		
		public void ubaciDodatak(Dodatak dodatak) {
			dodaci.add(dodatak);
		}
		public abstract double ukupnaCena();
		public abstract void stampaj();
		
}
