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
 
	 */
		int ogranicenje = 60;
		
		Auto fica = new Auto();
		fica.brojVrata = 3;
		fica.imeVozaca = "Pera Peric";
		fica.marka = "Zastava";
		fica.potrosnjuNa100km = 10;
		fica.trenutnaBrzinu = 50;
		fica.stampaj();
		System.out.println("Prekoracili ste brzinu: " + fica.jePrekoracio(ogranicenje));
		System.out.println("Kazna je " + fica.kazna(ogranicenje) + "din.");
		
		fica.kubikaza = 1500;
		fica.mesecRegistracije = 3;
		fica.godProizvodnje = 1945;
		
		System.out.println("******************************************");
		System.out.println("Oldtimer: " + fica.oldtimer());
		System.out.println("Registrovan: " + fica.isteklaRegistracija(11));
		System.out.println("Cena registracije: " + fica.cenaRegistracija());
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
