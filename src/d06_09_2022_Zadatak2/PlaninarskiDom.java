package d06_09_2022_Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String nazivDoma;
	private int godOsnivanja;
	private ArrayList<Planinar> nizPlaninara = new ArrayList<>();

	
	public String getNazivDoma() {
		return nazivDoma;
	}
	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	public ArrayList<Planinar> getNizPlaninara() {
		return nizPlaninara;
	}
	public void setNizPlaninara(ArrayList<Planinar> nizPlaninara) {
		this.nizPlaninara = nizPlaninara;
	}
		public PlaninarskiDom(String nazivDoma, int godOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godOsnivanja = godOsnivanja;
	}
		
		public PlaninarskiDom() {
			super();
		}

		public void uclaniPlaninara(Planinar planinar) {
			nizPlaninara.add(planinar);
		}
		
		public int brojPlaninaraKojiCeSePopetiUspesno(Planina planina) {
			int broj = 0;
			for (int i = 0; i < nizPlaninara.size(); i++) {
				if(nizPlaninara.get(i).uspesanUspon(planina) == true) {
					broj++;
				}
			}
			return broj;
		}
		
		public void izbaciPlaninara(int id) {
			for (int i = 0; i < nizPlaninara.size(); i++) {
				if (nizPlaninara.get(i).getIdentifikacioniBroj() == id) {
					nizPlaninara.remove(i);
				}
			}
		}
		
		public void stampajPodatke(Planina planina) {
			System.out.println("Naziv: " + this.nazivDoma);
			System.out.println("Godina osnivanja: " + this.godOsnivanja);
			for (int i = 0; i < nizPlaninara.size(); i++) {
				System.out.println(i + 1 + ". ");
				nizPlaninara.get(i).stampaj();
				System.out.println("---------------------------");
			}
			System.out.println("Broj planinara koji ce se uspesno popeti na planinu " + planina.getImePlanine()
					+ " je " + this.brojPlaninaraKojiCeSePopetiUspesno(planina));
			System.out.println("Mesecni prihod " + this.mesecniPrihod());
		}
		
		public double mesecniPrihod() {
			double suma = 0;
			for (int i = 0; i < nizPlaninara.size(); i++) {
				suma += nizPlaninara.get(i).clanarina();
			}
			return suma;
		}
}
