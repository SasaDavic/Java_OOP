package d25_08_2022_Zadatak2;

import java.util.ArrayList;

public class Listic {
	
	private ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();
	
	public void dodajKombinaciju(Kombinacija kom) {
		if(this.kombinacije.size() < 7) {
			kombinacije.add(kom);
		} else {
			System.out.println("Maksimalan broj kombinacija je 7");
		}
	}
	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			if(this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija.getNizBrojeva()) == true) {
				System.out.println("Kombinacija br " + i);
				System.out.println("Cestitamo!");
				return true;
			} else {
				System.out.println("Kombinacija br " + i);
				System.out.println("Niste pogodili kombinaciju!");
			}
		}
		return false;
	}
	
	
	public void stampajListic() {
		for (int i = 0; i < kombinacije.size(); i++) {
			kombinacije.get(i).stampaj();
		}
	}
	

}
