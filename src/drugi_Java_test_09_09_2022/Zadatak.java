package drugi_Java_test_09_09_2022;

public class Zadatak {

	public static void main(String[] args) {
	/*
Resenja postavite na drajvu tako sto u svom drajv folderu kreirate folder pod nazivom Test - Java Klase 
i u njemu postavite java fajlove. 

Zadatak
(15 poena) Kreirati klasu InstagramUser koja ima:
username korisnika
ime i prezime
konstuktor koji postavlja samo username
konstuktor koji postavlja sve atribute
gettere za sve atribute
settere za sve atribute osim username-a
metodu za stampu koja stampa podatke korisnika u jednom redu:
	@username \t ime i prezime
metodu koja generise link do korisnickog profila.Metoda generise i vraca string u formatu:
https://www.instagram.com/[username]/
Npr:za username pera, metoda vraca string https://www.instagram.com/pera/

(20 poena) Kreirati apstraktnu klasu InstagramAddOn za potrebe ukljucivanja dodataka na stori koja ima:
id - jedinstveni identifikator koji moze da bude po zelji broj ili neki tekstualni kod
x i y koordinatu - sluze da odrede poziciju dodataka u okviru storija
sirinu dodatka 
visinu dodatka
getere za sve atribute
nemamo settere
konstuktor koji je potreban (potrebno je zakljuciti koji konstruktor jedino ima smisla da postoji)
apstraktnu metodu koja vraca minimalnu sirinu dodatka
apstraktnu metodu koja vraca minimalnu visinu dodatka
metodu za povecanje dimenzija. Metoda prima dva parametra, jedan za povecanje visine a drugi za povecanje sirine dodatka.
metodu za smanjenje dimenzija.Metoda prima dva parametra, jedan za smanjenje visine a drugi za smanjenje sirine. Duzina i visina ne mogu da spadnu ispod minimalnih vrednosti dodatka.
apstraktnu metodu za stampu

(10 poena) Kreiarti klasu InstagramLocationAddOn koja nasledjuje InstagramAddOn klasu i ima:
naziv lokacije
konstuktor koji je potreban
getter i setter za lokaciju
minimalna visina za lokaciju je 50 a duzina 100
stampanje se vrsi u formatu:
[x, y] (visina, sirina) L naziv lokacije

(10 poena) Kreirati klasu InstagramMentionAddOn koja nasledjuje  InstagramAddOn klasu i ima:
korisnika koji je tagovan
konstuktor koji je potreban
getter i setter za tagovanog korisnika
minimalna visina za lokaciju je 50 a duzina 80
stampanje se vrsi u formatu:
[x, y] (visina, sirina) @username/link do korisnickog profila
 
(30 poena) Kreirati klasu InstagramStory koja ima:
autor storija- korisnik koji je kreirao stori
link za swipe up
link do slike (npr: https://www.instagram.com/p/CecrcPyrPMj/  )
niz dodataka na stori
niz korisnika - cuvamo podatke ko je sve pogledao stori 
gettere za sve atribute
setter samo za swipe up link
konstuktore koji su vam potrebi 
metodu za dodavanje dodatka na stori
metodu za brisanje dodatka sa storija. Metodi se prosledjuje id dodatka koji je potrebno izbaciti.
private metodu koja proverava da li je korisnik sa datim username-om vec pogledao stori. Metoda kao parametar prima username i vraca da li je korisnik pogledao stori ili ne
metodu pogledaj stori. Metoda kao parametar prima korisnika i dodaje ga u niz korisnika koji su pogledali stori samo ako nije pogledao pre toga
metodu za postavljanje storia. Metoda stampa autora i niz dodataka. Ukoliko postoji link za swipe up na dnu stampa odstampajte swipe up zajedno sa linkom, ukoliko ne postoji tada se nista ne stampa

Primer stampe:
@milan	Milan Jovanovic
Story: 
Image: https://www.instagram.com/p/CecrcPyrPMj/
[10, 15] (70, 120) L Kej
[4, 1] (60, 120) @pera/https://www.instagram.com/pera/
[x, y] (60, 100) @mika/https://www.instagram.com/mika/
	<<< swipe up >>>
            http://google.com/ 

metodu koja vraca broj pregleda
metodu koja stampa sve korisnike koji su pogledali stori u formatu:
Viewers 3
@milan	Milan Jovanovic
@stefan13	Stefan Stefanovic
@pera Pera	Peric


(15 poena) U glavnom programu kreirati jedan instagram stori sa jednom postavljenom  lokacijom, 
sa bar 3 tagovanih osoba i bar 3 korisnika koja su pogledala stori a zatim isprobati sve metode objekata.
Napomena: probajte story sa i bez swipe up linkom
	 */
		InstagramUser user1 = new InstagramUser("Ana", "Ana", "Delic");
		InstagramUser user2 = new InstagramUser("Nix", "Neda", "Mitic");
		InstagramUser user3 = new InstagramUser("Nona", "Nina", "Dodic");
		InstagramUser user4 = new InstagramUser("Tiki", "Tijana", "Savic");
		InstagramUser user5 = new InstagramUser("Mix", "Miljana", "Tomic");
		InstagramUser user6 = new InstagramUser("Lili", "Ljiljana", "Cenic");
		InstagramUser user7 = new InstagramUser("Caki", "Saska", "Cvetkovic");
		
		InstagramLocationAddOn lokacija1 = new InstagramLocationAddOn("a0123", 15, 20, 200, 300, "Park Avetog Save");
		
		InstagramMentionAddOn tag1 = new InstagramMentionAddOn("b111", 20, 25, 25, 45, user1);
		InstagramMentionAddOn tag2 = new InstagramMentionAddOn("b112", 20, 25, 25, 45, user2);
		InstagramMentionAddOn tag3 = new InstagramMentionAddOn("b113", 20, 25, 25, 45, user3);
		
		InstagramStory stori = new InstagramStory(user7, "www.slika.com");
		stori.dodajDodatak(tag1);
		stori.dodajDodatak(tag2);
		stori.dodajDodatak(tag3);
		stori.dodajDodatak(lokacija1);
		
		stori.pogledajStori(user7);
		stori.pogledajStori(user6);
		stori.pogledajStori(user5);
		stori.pogledajStori(user4);
		stori.pogledajStori(user3);
		stori.pogledajStori(user3);
		stori.pogledajStori(user2);
		stori.pogledajStori(user2);
		stori.postaviStori();
	}

}
