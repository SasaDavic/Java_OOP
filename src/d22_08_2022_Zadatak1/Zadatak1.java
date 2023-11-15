package d22_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)

Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora) 

	U glavnom programu napraviti vise autora sa vise knjiga.

	 */
		
		Autor autor = new Autor("Robert", "Grin");
		Knjiga knjiga = new Knjiga("978-86-7804-244-7", "48 zakona moci", 1980);
		knjiga.setAutor(autor);
		knjiga.print();
		
		Autor autor1 = new Autor("Klod", "Ane");
		Knjiga knjiga1 = new Knjiga("978-86-10-04900-8", "ARIJANA, MLADA RUSKINJA", 2020);
		knjiga1.setAutor(autor1);
		knjiga1.print();
		
		
	}

}
