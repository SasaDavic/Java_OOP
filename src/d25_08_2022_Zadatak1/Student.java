package d25_08_2022_Zadatak1;

import java.util.ArrayList;

public class Student {
	
	private int brIndexa;
	private String imeIprezime;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();
	
	public Student(int brIndexa, String imeIprezime, String tipStudija) {
		this.brIndexa = brIndexa;
		this.imeIprezime = imeIprezime;
		this.tipStudija = tipStudija;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}
	
	public void dodajIspit(Ispit ispit) {
		nizIspita.add(ispit);
	}
	public void racunajProsek() {
		int suma = 0;
		int brojac = 0;
		for (int i = 0; i < nizIspita.size(); i++) {			
			if(this.nizIspita.get(i).polozio() == true) {
				suma += this.nizIspita.get(i).getOcena();
				brojac++;
			}
		}
		double prosek = suma * 1.0 / brojac;
		System.out.println("Prosecna ocena: " + prosek);
	}
	public void stampaj() {
		System.out.println(this.brIndexa + " - " + this.imeIprezime + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < nizIspita.size(); i++) {
			nizIspita.get(i).stampaj();
		}
		racunajProsek();
	}

	
}
