package p16_08_2022_Zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati klasu Auto koja ima:
ime i prezime vozaca
marku automobila
broj vrata
potrosnju na 100km (npr: 10)
trenutnu brzinu kojom se auto krece
metodu za stampu koja stampa podatke u formatu:
[Vozac]
	[Marka] - [br vrata]-ro vrata
	Sa potrosnjom od [potrosnja] l na 100km
	[Trenutna brzina auta] km/h je trenutna brzina.
	Primer:
	Milan Jovanovic
	BMW - 5-ro vrata
	Sa potrosnjom od 10 l na 100km
	200 km/h je trenutna brzina

(Dopuna)
U okviru klase Auto, implementirati jos 2 metode:
metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje 
(kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din. 
Metoda od parametara prima ogranicenje brzine
U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

(Dopuna 2)
Dopuniti klasu Auto tako da ima:
atribut godinu proizvodnje
atribut mesec do kad je registrovan auto (int)
atribut kubikaza auta (npr: 1600 - 5000)
metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu 
toga vraca true ili false.
metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije 
kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

(Dopuna 3)
Dopuniti klasu Auto tako da ima:
●	atribut broj registracije
●	da li je ukljucena klima u autu
●	metodu dodajGas, koja povecava trenutnu brzinu za 10.
●	metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
●	metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
○	faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
○	(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

 (Dopuna 4)
	Dopuniti klasu Auto tako da ima:
●	atribut za maksimalnu brzinu na auto (npr: 240)
●	Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
●	metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa 
               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

(Dopuna 5)
Dopuniti klasu Auto tako da ima:
●	kapacitet rezervoara
●	trenutnu kolicinu goriva u rezervoaru (u litrima)
●	metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu 
vrednost goriva. Litar goriva je 170din. Vodite racuna da trenutna kolicina goriva ne predje 
kapacitet rezervoara, takodje ukoliko se unese kolicina koja prelazi kapacitet, 
tu kolicinu koja prelazi ne racunate u cenu.

	 */
		int ogranicenje = 60;
		
		Auto fica = new Auto();
		fica.brojVrata = 3;
		fica.imeVozaca = "Pera Peric";
		fica.marka = "Zastava";
		fica.potrosnjuNa100km = 10;
		fica.trenutnaBrzinu = 50;
		fica.stampaj();
		
		boolean x = fica.jePrekoracio(ogranicenje);
		System.out.println("PREKORACENJE: " + x);
		int y = fica.kazna(ogranicenje);
		System.out.println("Kazna je " + y + " din.");
		
		fica.kubikaza = 1500;
		fica.mesecRegistracije = 3;
		fica.godProizvodnje = 1945;
		
		fica.ukljucenaKlima = false;
		fica.brRegistracije = "NI895-MN";
		
		fica.maxBrzina = 70;
		
		fica.kapacitetRezervoara = 20;
		fica.trenutnoGoriva = 12;
		
		System.out.println("------------------------------------------");
		System.out.println("Oldtimer: " + fica.oldtimer());
		System.out.println("Registrovan: " + fica.isteklaRegistracija(11));
		System.out.println("Cena registracije: " + fica.cenaRegistracija());
		System.out.println("------------------------------------------");
		fica.dodajGas();
		fica.dodajGas();
		fica.jePrekoracio(ogranicenje);
		fica.kazna(ogranicenje);
		System.out.println("Trenutna brzina je: " + fica.trenutnaBrzinu);
		System.out.println("Trenutna potrosnja je: " + fica.potrosnja());
		fica.stampajTablu();
		int z = fica.natociGorivo(10);
		System.out.println("Cena za gorivo je " + z + "din.");
		
		System.out.println("******************************************");
		
		Auto punto = new Auto();
		punto.brojVrata = 5;
		punto.imeVozaca = "Miki";
		punto.marka = "Fiat";
		punto.potrosnjuNa100km = 8;
		punto.trenutnaBrzinu = 80;
		punto.stampaj();
		System.out.println("Prekoracili ste brzinu: " + punto.jePrekoracio(ogranicenje));
		System.out.println("Kazna je " + punto.kazna(ogranicenje) + "din.");
		
		punto.kubikaza = 2500;
		punto.mesecRegistracije = 12;
		punto.godProizvodnje = 2005;
		
		System.out.println("******************************************");
		System.out.println("Oldtimer: " + punto.oldtimer());
		System.out.println("Registrovan: " + punto.isteklaRegistracija(11));
		System.out.println("Cena registracije: " + punto.cenaRegistracija());
		System.out.println("******************************************");
		

	}

}
