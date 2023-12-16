package v16_12_2023;

public class Zadatak {

	public static void main(String[] args) {
		/*
		Zadatak: Implementirajte klasu `Knjiga` u Javi. 

		Klasa `Knjiga` treba da sadrži sledeće atribute:
		- `naslov` (String)
		- `autor` (String)
		- `brojStrana` (int)
		- `godinaIzdanja` (int)

		Klasa treba da ima sledeće metode:
		- Konstruktor koji prima sve atribute
		- Gettere i settere za sve atribute
		- `toString()` metodu koja vraća string reprezentaciju objekta

		Nakon što implementirate klasu `Knjiga`, kreirajte klasu `Biblioteka` koja sadrži listu knjiga. 
		Ova klasa treba da ima sledeće metode:
		- `dodajKnjigu(Knjiga knjiga)` - dodaje knjigu u listu
		- `ukloniKnjigu(String naslov)` - uklanja knjigu na osnovu naslova
		- `pretraziKnjige(String autor)` - vraća listu knjiga određenog autora

		Testirajte svoje klase kreiranjem objekata i pozivanjem metoda.
		*/
		Knjiga k1 = new Knjiga("Knjiga o Titu", "Dobrica Ćosić", 328, 2023);
		Knjiga k2 = new Knjiga("Daleko je sunce", "Dobrica Ćosić", 384, 2023);
		Knjiga k3 = new Knjiga("Monah Hokaj", "Vuk Drašković", 152, 2023);
		
		Biblioteka bib = new Biblioteka();
		bib.dodajKnjigu(k1);
		bib.dodajKnjigu(k2);
		bib.dodajKnjigu(k3);
		
		bib.pretraziKnjige("Vuk Drašković");
		
		bib.ukloniKnjigu("Knjiga o Titu");
		bib.pretraziKnjige("Dobrica Ćosić");
		
	}

}
