package p25_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Sastojak koja ima:
naziv
cenu
gettere i settere
konstruktore
metodu za stampanje koja stampa  podatke u formatu:
naziv - cena.din
	
Kreirati klasu Pasta koja ima:
niz sastojaka
metodu za dodavanje sastojka
defaultni konstruktor
metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
metodu za stampu koja stampa podatke u formatu:
Pasta je sa sastojcima:
naziv - cena.din
naziv - cena.din
naziv - cena.din
Cena paste je cena.din

U glavnom programu kreirati objekte i testirati funkcionalnosti 


(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

	 */
		
		Sastojak pasta = new Sastojak("Spagete", 90);
		Sastojak zacin = new Sastojak("Origano", 50);
		Sastojak povrce = new Sastojak("Paradajz sos", 150);
		Sastojak meso = new Sastojak("Mleveno mesano meso", 500);
		Sastojak sir = new Sastojak("Mocarela", 300);
		
		Pasta boloneze = new Pasta();
		boloneze.dodajSastojak(pasta);
		boloneze.dodajSastojak(sir);
		boloneze.dodajSastojak(meso);
		boloneze.dodajSastojak(povrce);
		boloneze.dodajSastojak(zacin);
		boloneze.stampaj();
		boloneze.brisiSastojak("Origano");
		System.out.println("-----------------");
		boloneze.stampaj();
		
		
		
	}

}
