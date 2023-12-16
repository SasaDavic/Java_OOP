package p06_09_2022_Zadatak2;

import java.util.ArrayList;

public class Kasa {
	private ArrayList<Dodatak> d = new ArrayList<>();
	private ArrayList<Proizvod> p = new ArrayList<>();
	
	public void dodajProizvod(Proizvod proizvod) {
		p.add(proizvod);
	}
	
		public Kasa() {
		super();
		d.add(new Dodatak("Jagoda", 500));
		d.add(new Dodatak("Slag", 25));
		d.add(new Dodatak("Cokolada", 150));
		d.add(new Dodatak("Karamela", 50));
		d.add(new Dodatak("Keks", 40));
		d.add(new Dodatak("Luk", 20));
		d.add(new Dodatak("Origano", 15));
		d.add(new Dodatak("Sunka", 450));
		d.add(new Dodatak("Kackavalj", 350));
		d.add(new Dodatak("Pelat", 55));
	}

		public ArrayList<Dodatak> getD() {
			return d;
		}

		public void setD(ArrayList<Dodatak> d) {
			this.d = d;
		}

		public ArrayList<Proizvod> getP() {
			return p;
		}

		public void setP(ArrayList<Proizvod> p) {
			this.p = p;
		}

		public Dodatak traziDodatak(String naziv) {
			for (int i = 0; i < d.size(); i++) {
				if (naziv.equals(d.get(i).getNaziv())) {
					return d.get(i);
				}
			}
			return null;
		}
	
		public double sracunajCenuPorudzbine() {
			double suma = 0;
			for (int i = 0; i < p.size(); i++) {
				suma +=  p.get(i).ukupnaCena();
			}
			return suma;
		}
		
		public void setampajRacun() {
			for (int i = 0; i < p.size(); i++) {
				p.get(i).stampaj();
			}
			System.out.println("Suma: " + sracunajCenuPorudzbine());
		}

}
