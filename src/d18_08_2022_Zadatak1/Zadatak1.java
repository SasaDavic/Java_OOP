package d18_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je 
cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar 
popust u opsegu od 0 do 100.
racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
za tezinu do 100g, postarina iznosi 200din
za tezinu od 101g do 500g, postarina iznosi 400din
za tezinu preko 500g, postarina iznosi 1000din

U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

	 */
		
		Proizvod so = new Proizvod();
		so.cena = 100;
		so.naziv = "Himalajska so";
		so.tezinaGrami = 250;
		so.stampaj();
		so.povecajCenu(15);
		so.stampaj();
		double x = so.vratiCenuSaPopustom(20);
		System.out.println("Vikend popust je 20%: " + x);
		System.out.println("Postarina: " + so.racunajPostarinu());
		
		Proizvod origano = new Proizvod();
		origano.cena = 200;
		origano.naziv = "Origano zacin";
		origano.tezinaGrami = 50;
		origano.stampaj();
		origano.povecajCenu(500);
		origano.stampaj();
	}

}
