package drugi_Java_test_09_09_2022;

import java.util.ArrayList;

public class InstagramStory {
	private InstagramUser kreatorStorija;
	private String linkZaSwipeUp;
	private String linkDoSlike;
	private ArrayList<InstagramUser> pogledaliStori = new ArrayList<InstagramUser>();
	private ArrayList<InstagramAddOn> nizDodataka = new ArrayList<>();
	public String getLinkZaSwipeUp() {
		return linkZaSwipeUp;
	}
	public void setLinkZaSwipeUp(String linkZaSwipeUp) {
		this.linkZaSwipeUp = linkZaSwipeUp;
	}
	public InstagramUser getKreatorStorija() {
		return kreatorStorija;
	}
	public String getLinkDoSlike() {
		return linkDoSlike;
	}
	public ArrayList<InstagramUser> getPogledaliStori() {
		return pogledaliStori;
	}
	public ArrayList<InstagramAddOn> getNizDodataka() {
		return nizDodataka;
	}
	public InstagramStory(InstagramUser kreatorStorija, String linkDoSlike) {
		super();
		this.kreatorStorija = kreatorStorija;
		this.linkZaSwipeUp = null;
		this.linkDoSlike = linkDoSlike;
	}
	public void dodajDodatak(InstagramAddOn dodaj) {
		nizDodataka.add(dodaj);
	}
	public void izbrisiDodatak(String id) {
		for (int i = 0; i < nizDodataka.size(); i++) {
			if(nizDodataka.get(i).getId().equals(id)) {
				nizDodataka.remove(i);
			}
		}
	}
	private boolean vecPogledaoStori(String username) {
		for (int i = 0; i < pogledaliStori.size(); i++) {
			if(pogledaliStori.get(i).getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	public void pogledajStori(InstagramUser user) {
		if(vecPogledaoStori(user.getUsername()) == false) {
			pogledaliStori.add(user);
		}
	}
	public void postaviStori() {
		System.out.println("Autor: " + this.kreatorStorija);
		System.out.println("Dodaci: ");
		for (int i = 0; i < nizDodataka.size(); i++) {
			nizDodataka.get(i).stampaj();
		}
		System.out.println("Link do slike: " + this.linkDoSlike);
		if (this.linkZaSwipeUp != null) {
			System.out.println(">> swipe up << " + this.linkZaSwipeUp);
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Pogledali stori (" + pogledaliStori.size() + ")");
		for (int i = 0; i < pogledaliStori.size(); i++) {
			System.out.print(i + 1 + ". ");
			pogledaliStori.get(i).stampaj();
			pogledaliStori.get(i).linkProfila(pogledaliStori.get(i).getUsername());
		}
	}
/*
metodu za postavljanje storia. Metoda stampa autora i niz dodataka. Ukoliko postoji link za swipe up na dnu 
stampa odstampajte swipe up zajedno sa linkom, ukoliko ne postoji tada se nista ne stampa
 */
}
