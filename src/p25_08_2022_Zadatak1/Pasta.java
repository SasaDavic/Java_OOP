package p25_08_2022_Zadatak1;

import java.util.ArrayList;

public class Pasta {
	public ArrayList<Sastojak> niz = new ArrayList<Sastojak>();
	
	public void dodajSastojak(Sastojak sastojak) {
		niz.add(sastojak);
	}
	
	public Pasta() {
	}

	public double cenaPaste() {
		double suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma += niz.get(i).getCena();
		}
		return suma;
	}
	
	public void stampaj() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < niz.size(); i++) {
			niz.get(i).stampaj();
		}
		System.out.println("Cena paste je " + cenaPaste() + "din.");
	}
	
	public void brisiSastojak(String naziv) {
		int a = -1;
		for (int i = 0; i < niz.size(); i++) {
			if(niz.get(i).getNaziv().equals(naziv)) {
				a = i;
			}
		}
		niz.remove(a);
	}


}
