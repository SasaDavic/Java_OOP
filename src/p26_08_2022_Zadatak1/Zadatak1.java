package p26_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	Kreirati klasu Osoba koja od atributa ima:
 ime i prezime
 jmbg
konstuktor sa parametrima
metodu stampaj koja stampa podatke u formatu
			ime prezime, jmbg


		Kreirati klasu Student koja nasledjuje klasu Osoba, 
			koja od dodatnih atributa ima:
broj indeksa
dug za skolarinu 
konstuktor sa parametrima
metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. 
Metoda prima iznos uplate kao parametar metode.
Napisati metod stampajStudenta da stampa sve podatke o studentu


Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
			koja od dodatnih atributa ima:
naziv predmeta koji predaje
iznos plate
konstuktor sa parametrima
metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
Napisati metodu stampajProfu da stampa sve podatke o profesoru


			U glavnom programu kreirati 2 studenta i 2 profesora.

	(dopuna)
	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu
	 */
		
		Student prvi = new Student("Milan Mitic", "0908986412365", 2356, 15000);
		Student drugi = new Student("Milena Antic", "1402985412563", 1452, 25000);
		Profesor prvi1 = new Profesor("Dusan Ciric", "1525789632541", "Matematicka analiza 1", 140000);
		Profesor drugi1 = new Profesor("Dragana Cvetkovic", "1203658965874", "Matematicka analiza 3", 150000);

		prvi.stampaj();
		System.out.println("**********************");
		prvi1.stampaj();
		System.out.println("----------------------");
		prvi.uplatiSkolarinu(14000);
		prvi1.povecajPlatu(15);
		prvi.stampaj();
		System.out.println("**********************");
		prvi1.stampaj();
	}

}
