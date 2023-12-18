package v17_12_2023;

import java.util.ArrayList;

public class Biblioteka {
	private ArrayList<Knjiga> spisakKnjiga = new ArrayList<>();
	private ArrayList<Clan> spisakClanova = new ArrayList<>();
	public void ubaciNovuKnjigu(Knjiga knjiga) {
		spisakKnjiga.add(knjiga);
	}
	public void uclani(Clan clan) {
		spisakClanova.add(clan);
	}
	public void iznajmiKnjigu(String clan, String naslovKnjige) {
		int cl = -1;
		int k = -1;
		for (int i = 0; i < spisakClanova.size(); i++) {
			if(spisakClanova.get(i).getImeClana().equals(clan) && spisakClanova.get(i).brojIznajmljenihKnjiga < 4) {
				cl = i;
				for (int j = 0; j < spisakKnjiga.size(); j++) {
					if(spisakKnjiga.get(j).getNaslov().equals(naslovKnjige) && spisakKnjiga.get(j).isDosupna() == true) {
						spisakClanova.get(i).iznajmiKnjigu(spisakKnjiga.get(j));
						spisakKnjiga.get(j).setDosupna(false);
						k = j;
					} else if(spisakKnjiga.get(j).isDosupna() == false) {
						System.out.println("Knjiga nije dostupna!");
					} 
					
				}
			} else if (spisakClanova.get(i).getImeClana().equals(clan) && spisakClanova.get(i).brojIznajmljenihKnjiga > 3) {
				System.out.println("Clan biblioteke je vec iznajmio 3 knjige!");
			}
		}
		System.out.println("Podaci o clanu: ");
		spisakClanova.get(cl).stampajClana();
		System.out.println("Knjiga: ");
		spisakKnjiga.get(k).stampajPodatke();
	}
	public void vratiKnjigu(String clan, String naslovKnjige) {
		int cl = -1;
		int k = -1;
		for (int i = 0; i < spisakClanova.size(); i++) {
			if(spisakClanova.get(i).getImeClana().equals(clan)) {
				cl = i;
				for (int j = 0; j < spisakKnjiga.size(); j++) {
					if(spisakKnjiga.get(j).getNaslov().equals(naslovKnjige) && spisakKnjiga.get(j).isDosupna() == false) {
						spisakClanova.get(i).vratiKnjigu(naslovKnjige);
						spisakKnjiga.get(j).setDosupna(false);
						k = j;
					} else if(spisakKnjiga.get(j).isDosupna() == true) {
						System.out.println("Knjiga nije izdata!");
					}
					
				}
			}
		}
		System.out.println("Podaci o clanu: ");
		spisakClanova.get(cl).stampajClana();
		System.out.println("Knjiga: ");
		spisakKnjiga.get(k).stampajPodatke();
	}
	
}
