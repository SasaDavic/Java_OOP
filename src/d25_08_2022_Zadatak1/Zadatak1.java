package d25_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	 * Napisati klasu Student koja ima
broj indeksa
ime i prezime
tip studija (osnovne, master, doktorske)
niz ispita
konstuktore koje mislite da ce vam trebati
gettere i settere za indeks, ime i prezime, tip studija
getter za niz predmeta
metodu dodaj ispit u niz ispita
metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
metodu stampaj koja stampa u formatu:
(broj indeksa) - (ime i prezime) - (tip studija)
Predmeti:
(naziv predmeta) - (profesor) - (ocena)
(naziv predmeta) - (profesor) - (ocena)
(naziv predmeta) - (profesor) - (ocena)
Prosecna ocena: (prosecna ocena)


Napisati klasu Ispit koja ima
naziv predmeta
ocenu (u rasponu od 5 do 10)
Ime i prezime profesora koji predaje predmet
konstuktore koje mislite da ce vam trebati
gettere i settere za sve atribute
metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
metodu koja stampa ispit u formatu:
(naziv predmeta) - (profesor) - (ocena)

	 */
		
		Ispit analiza1 = new Ispit("Matematicka analiza 1", 6, "Dragana Cvetkovic");
		Ispit analiza2 = new Ispit("Matematicka analiza 2", 7, "Dusan Ciric");
		Ispit kompleksna = new Ispit("Kompleksna analiza", 5, "Dijana Dikic");
		Ispit analiza3 = new Ispit("Matematicka analiza 3", 10, "Dragana Cvetkovic");
		Ispit analiza4 = new Ispit("Matematicka analiza 4", 6, "Dragan Djordjenic");
		
		Student sasa = new Student(3223, "Sasa Djokic", "Osnovne");
		sasa.dodajIspit(analiza4);
		sasa.dodajIspit(analiza3);
		sasa.dodajIspit(analiza2);
		sasa.dodajIspit(analiza1);
		sasa.dodajIspit(kompleksna);
		
		sasa.stampaj();
		
		
		

	}

}
