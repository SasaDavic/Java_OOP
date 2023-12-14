package p05_09_2022_Zadatak5;

import java.util.ArrayList;

public abstract class Proizvod {
	protected ArrayList<Dodatak> nizDodataka = new ArrayList<Dodatak>();
	
	public ArrayList<Dodatak> getNizDodataka() {
		return nizDodataka;
	}
	public void setNizDodataka(ArrayList<Dodatak> nizDodataka) {
		this.nizDodataka = nizDodataka;
	}
	public Proizvod() {
		super();
	}
	public void ubaciDodatak(Dodatak dodatak) {
		nizDodataka.add(dodatak);
	}
	public double cenaSvihDodataka() {
		double suma = 0;
		for (int i = 0; i < nizDodataka.size(); i++) {
			suma += nizDodataka.get(i).getCena();
		}
		return suma;
	}

	public abstract void racun();
	
	public abstract void stampaj();
		
}
