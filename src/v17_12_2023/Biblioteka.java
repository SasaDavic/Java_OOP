package v17_12_2023;

import java.util.ArrayList;

public class Biblioteka {
	private ArrayList<Knjiga> spisakKnjiga = new ArrayList<>();
	private ArrayList<Clan> spisakClanova = new ArrayList<>();
		
	public Biblioteka() {
		super();
	}
	public void ubaciNovuKnjigu(Knjiga knjiga) {
		spisakKnjiga.add(knjiga);
	}
	public void uclani(Clan clan) {
		spisakClanova.add(clan);
	}
	public void iznajmiKnjigu(int clanskaKarta, String naslovKnjige) {
		for (int i = 0; i < spisakClanova.size(); i++) {
			if(spisakClanova.get(i).getBrojClanskeKarte() == clanskaKarta) {
				if (spisakClanova.get(i).getBrojIznajmljenjihKnjiga() > 2) {
					System.out.println("Vec ste iznajmili 3 knjige!");
				} else {
					for (int j = 0; j < spisakKnjiga.size(); j++) {
						if (spisakKnjiga.get(j).getNaslov().equals(naslovKnjige)) {
							spisakClanova.get(i).iznajmiKnjigu(spisakKnjiga.get(j));
						}
					}
				}
				spisakClanova.get(i).stampajClana();
			}
		}
	}
	public void vratiKnjigu(int clanskaKarta, String naslovKnjige) {
		for (int i = 0; i < spisakClanova.size(); i++) {
			if(spisakClanova.get(i).getBrojClanskeKarte() == clanskaKarta) {
				for (int j = 0; j < spisakKnjiga.size(); j++) {
					if (spisakKnjiga.get(j).getNaslov().equals(naslovKnjige)) {
						spisakClanova.get(i).vratiKnjigu(naslovKnjige);
					}
			}
				spisakClanova.get(i).stampajClana();
		}
	
	}
	}
}
