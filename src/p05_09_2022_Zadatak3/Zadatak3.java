package p05_09_2022_Zadatak3;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati abstraktnu klasu Figura koja ima
abstraktnu metodu povrsina
abstraktnu metodu obim
metodu koja stampa podatke u formatu:
Povrsina je (povrsina)
Obim je (obim)

Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
stranicu a
gettere/settere/konstruktore
implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
implementira metodu obim

Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
stranice a i b
gettere/settere/konstruktore
implementira metodu povrsina
implementira metodu obim

U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve 
povrsine i obime i za svaku figuru ispisati ponaosob

	 */
		Figura a1 = new JednakostranicniTrougao(2);
		Figura a2 = new JednakostranicniTrougao(3);
		Figura a3 = new Pravougaonik(2, 3);
		Figura a4 = new Pravougaonik(3, 4);
		Figura a5 = new Pravougaonik(4, 5);
		
		ArrayList<Figura> niz = new ArrayList<>();
		niz.add(a1);
		niz.add(a2);
		niz.add(a3);
		niz.add(a4);
		niz.add(a5);
		
		double sumaP = 0;
		double sumaO = 0;
		
		for (int i = 0; i < niz.size(); i++) {
			niz.get(i).stampaj();
			sumaP += niz.get(i).povrsina();
			sumaO += niz.get(i).obim();
		}
		System.out.println("Suma svih povrsina je: " + sumaP);
		System.out.println("Suma svih obima je: " + sumaO);
	}

}
