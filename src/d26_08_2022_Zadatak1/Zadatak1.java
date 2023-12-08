package d26_08_2022_Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
Kreirati klasu Osoba koja ima:
-	ime i prezime
-	jmbg
-	godinu rodjenja
-	default-ni konstuktor
-	konstuktor sa parametrima
-	gettere i settere 
-	metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)

Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
-	broj (broj koji igrac nosi)
-	poziciju koju igra (odbrambeni, napadac, … )
-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
-	default-ni konstuktor
-	konstuktor sa parametrima
-	gettere i settere za broj, kapiten i poziciju
-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
-	godine iskustva
-	tip trenera (kondicioni, za igru, pomocni, personalni)
-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

		 */
		
		Igrac igrac = new Igrac("Dule Svaic", "12452345963", 1945, 15, "napadac", true);
		Igrac igrac1 = new Igrac("Miki Mikic", "12458455963", 1946, 19, "odbrana", false);
		Trener trener = new Trener("Dule Mitic", "12458745963", 1999, 15, "personalni");
		Trener trener1 = new Trener("Misa Mikic", "12458745974", 2005, 10, "kondicioni");
		igrac.stampaj();
		System.out.println("--------------------");
		igrac1.stampaj();
		System.out.println("--------------------");
		trener.stampaj();
		System.out.println("--------------------");
		trener1.stampaj();
		System.out.println("--------------------");
		
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		Scanner s = new Scanner(System.in);
		boolean dodaj = true;
		while (dodaj == true) {
			System.out.println("Ime igraca: ");
			String ime = s.next();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int god = s.nextInt();
			System.out.println("Broj dresa: ");
			int staz = s.nextInt();
			System.out.println("Pozicija: ");
			String poz = s.next();
			System.out.println("Da li je igrac kapiten: ");
			boolean kapiten = s.nextBoolean();
			Igrac igrac0 = new Igrac(ime, jmbg, god, staz, poz, kapiten);
			igraci.add(igrac0);
			System.out.println("Da li zelite da upisete jos jednog igraca: ");
			dodaj = s.nextBoolean();
		}
		boolean dodaj1 = true;
		while (dodaj1 == true) {
			System.out.println("Ime trenera: ");
			String ime = s.next();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int god = s.nextInt();
			System.out.println("Godine iskustva: ");
			int staz = s.nextInt();
			System.out.println("Tip trenera: ");
			String tip = s.next();
			Trener tren = new Trener(ime, jmbg, god, staz, tip);
			treneri.add(tren);
			System.out.println("Da li zelite da upisete jos jednog trenera: ");
			dodaj1 = s.nextBoolean();
		}
		System.out.println("Igraci: ");
		for (int i = 0; i < igraci.size(); i++) {
			System.out.print(i + 1 + ". ");
			igraci.get(i).stampaj();
			System.out.println("---------------------");
		}
		System.out.println("Treneri: ");
		for (int i = 0; i < treneri.size(); i++) {
			System.out.print(i + 1 + ". ");
			treneri.get(i).stampaj();
			System.out.println("---------------------");
		}

	}

}
