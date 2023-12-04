package skocko;

import java.util.Scanner;

public class Skocko {

	public static void main(String[] args) {
	/*
Napisati program koji simulira ponasanje igrice Skocko iz slagalice. 
Korisnik ima 6 pokusaja da resi kombinaciju.
Dozvoljeni znakovi
D - za smajli
K - za karo
L - za list
S - za srce
Z - za zvedu
T - za tref
Kreirati klasu SkockoGame koja ima:
Atribute (NIJEDAN ATRIBUT NE POSTAVLJATE U MAINU, sve ide kroz metode)
atribut brojOdigranihPokusaja
imamo 4 atributa koja cuvaju trazenu kombinacju
polje1
polje2
polje3
polje4
imamo drugih 4 atrubita koja cuvaju poslednju odigranu kombinacju (Ovde atribute ne postavljate u mainu, njih postavljate kroz metodu)
odigrano1
odigrano2
odigrano3
odigrano4
Ako je trazena kombinacija list, list, karo, srce. To znaci atributi cuvaju vrednosti L, L, K, S
Metode:
novaIgra koja:
prima 4 parametra koji predstavljaju trazenu kombinaciju, ta 4 parametra postavlju polje1, polje2, polje3 i polje4 u telu metode
resetuje broj odigrani pokusaja na nulu
atribute za odigranu kombinacjiu postavlja sve na prazan string ""
isGameOver - ukoliko korisnik nema vise pokusaja igra je gotova
isWinner - metoda koja vraca da li je korisnik pogodio trazenu kombinacju tj. ukoliko se polja za trazenu i odigranu kombinaicju poklapaju
odigrajKombinaciju - metoda prima 4 parametra koji postavljaju odigranu kombinacju i povecava brojOdigranihPokusaja
brojPogodakaNaMestu - metoda vraca na koliko mesta se poklapa trazeno polje sa odigranim
brojPogodakaAliNisuNaMestu - metoda vraca koliko je pogodjenih znakova na pravom mestu
metoda stampaTrazenu kombinacju u formatu:
polje1 | polje2 | polje3 | polje4
Primer printa:
D | K | L | L
metoda stampaOdigranu kombinacju u formatu:
odigrano1 | odigrano2 | odigrano3 | odigrano4
Primer printa:
D | K | S | L

U glavnom programu:
kreirajte objekat SkockoGame
startujte novu igru
zatim dok ne bude kraj igre ili korisnik pogodi kombinaciju
trazite od korisnika da unese vrednosti za kombinacju
stampajte broj pogodaka na mesti i onih koji nisu na mestu
stampajte odigranu kombinaciju
Kada bude kraj igre odstampajte trazenu kombinacju
I ako je korisnik pobedio stampajte "Cestitamo! Pobedili ste!" u suprotnom "Kraj igre!"
Primer izvrsenja sa slike bi bio: (Trazena kombinacija je D | D | K | T )
Unesite kombinacju: D
Unesite kombinacju: D
Unesite kombinacju: T
Unesite kombinacju: T
Odigrana kombinacija:
D | D | T | T  - 3 na mestu, 0 pogodjena ali nisu na mestu
Unesite kombinacju: D
Unesite kombinacju: D
Unesite kombinacju: T
Unesite kombinacju: L
Odigrana kombinacija:
D | D | T | L  - 2 na mestu, 1 pogodjena ali nisu na mestu
Unesite kombinacju: D
Unesite kombinacju: D
Unesite kombinacju: S
Unesite kombinacju: T
Odigrana kombinacija:
D | D | S | T  - 3 na mestu, 0 pogodjena ali nisu na mestu
Unesite kombinacju: D
Unesite kombinacju: D
Unesite kombinacju: K
Unesite kombinacju: T
Odigrana kombinacija:
D | D | K | T  - 4 na mestu, 0 pogodjena ali nisu na mestu
Trazena kombinacija:
D | D | K | T
Cestitamo! Pobedili ste! (

	 */
		Scanner s = new Scanner(System.in);
		SkockoGame igra = new SkockoGame();
		System.out.println("Unesi dobitnu kombinaciju: ");
		String a = s.next();
		String b = s.next();
		String c = s.next();
		String d = s.next();
		
		igra.novaIgra(a, b, c, d);
		
		while(igra.isGameOver() == false || igra.isWinner() == false) {
			System.out.println("Odigraj kombinaciju (S, K, P, H, T, Z):");
			String a1 = s.next();
			String b1 = s.next();
			String c1 = s.next();
			String d1 = s.next();
			igra.odigrajKombinaciju(a1, b1, c1, d1);
			igra.stampaOdigranuKombinacju();
			System.out.println("Broj pogodaka na mestu: " + igra.brojPogodakaNaMestu());
			System.out.println("Broj pogodaka koji nisu na mestu: " + igra.brojPogodakaAliNisuNaMestu());
		}
		igra.stampaTrazenuKombinacju();
	
	}

}
