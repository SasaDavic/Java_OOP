package p06_09_2022_Zadatak4;

import java.util.ArrayList;

public class Disciplina {
	private String imeDiscipline;
	private String tipDiscipline;
	private ArrayList<Atleticar> nizAtleticara = new ArrayList<>();
	
	
	public String getImeDiscipline() {
		return imeDiscipline;
	}
	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}
	public String getTipDiscipline() {
		return tipDiscipline;
	}
	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}
	public ArrayList<Atleticar> getNizAtleticara() {
		return nizAtleticara;
	}
	public void setNizAtleticara(ArrayList<Atleticar> nizAtleticara) {
		this.nizAtleticara = nizAtleticara;
	}
	public Disciplina(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}
	public void dodajAtleticara(Atleticar atleticar) {
		nizAtleticara.add(atleticar);
	}
	public void diskvalifikujAtleticara(String ime) {
		for (int i = 0; i < nizAtleticara.size(); i++) {
			if(nizAtleticara.get(i).getPunoIme().equals(ime)) {
				nizAtleticara.remove(i);
			}
		}
	}
		private Atleticar najboljiRezultat() {
			Atleticar bestOf = nizAtleticara.get(0);
			for (int i = 1; i < nizAtleticara.size(); i++) {
				if (this.nizAtleticara.get(i).boljiRezultatOd(bestOf) == true) {
					bestOf = nizAtleticara.get(i);
				}
			}
			return bestOf;
		}
		public void pobednikDiscipline() {
			Atleticar najbolji = najboljiRezultat();
			System.out.println("Pobednik discipline: " + this.imeDiscipline + ", je: " );
			najbolji.stampaj();
		}
		
		 
}
