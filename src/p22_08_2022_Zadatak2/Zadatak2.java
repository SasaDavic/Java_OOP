package p22_08_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu Korisnik koja ima
ime
prezime
gettere i settere za ime i prezime
konstuktore koje mislite da su vam potrebni
metoda koja stampa u formatu:
(ime) (prezime)

Kreirati klasu FacebookPost
opis
korisnik (referenca na korisnika koji je kreirao post)
konstrukore koje mislite da su vam potrebni
metoda print, stampa u formatu:
(ime) (prezime)
(opis post-a)

U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

	 */
		
		Korisnik korisnik = new Korisnik("Mile", "Peric");
		FacebookPost post = new FacebookPost("Zdravo!");
		post.setKorisnik(korisnik);
		post.print();

	}

}
