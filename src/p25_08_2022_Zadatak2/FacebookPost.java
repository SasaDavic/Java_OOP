package p25_08_2022_Zadatak2;

import java.util.ArrayList;

public class FacebookPost {
	private String imeKorisnika_pisaoPost;
	private String tekst;
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();
	
	
	public String getImeKorisnika_pisaoPost() {
		return imeKorisnika_pisaoPost;
	}
	public void setImeKorisnika_pisaoPost(String imeKorisnika_pisaoPost) {
		this.imeKorisnika_pisaoPost = imeKorisnika_pisaoPost;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public ArrayList<Reakcija> getReakcije() {
		return reakcije;
	}
//	public void setReakcije(ArrayList<Reakcija> reakcije) {    -ovo nije potrebno zbog privatne metode
//		this.reakcije = reakcije;
//	}
	public FacebookPost(String imeKorisnika_pisaoPost, String tekst) {
		
		this.imeKorisnika_pisaoPost = imeKorisnika_pisaoPost;
		this.tekst = tekst;
	}
	
	public void reaguj(Reakcija reakcija) {
		for (int i = 0; i < reakcije.size(); i++) {
			if (reakcije.get(i).getImeKorisnika().equals(reakcija.getImeKorisnika())) {
				reakcije.remove(i);
			}
		}
		this.reakcije.add(reakcija);
	}
	private int brojReakcija(String tip) {
		int brojac = 0;
		for (int i = 0; i < reakcije.size(); i++) {
			if(this.reakcije.get(i).getTipReakcije().equals(tip)) {
				brojac++;
			}
		}
		return brojac;
	}
	public void stampaj() {
		System.out.println(this.imeKorisnika_pisaoPost);
		System.out.println(this.tekst);
		System.out.println("Smajli " + this.brojReakcija("smajli") + " | Like " + this.brojReakcija("like") + 
				" | Srce " + this.brojReakcija("srce"));
	}



}
