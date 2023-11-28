package p25_08_2022_Zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Kreirati klasu InstagramUser koja ima:
username
Ime i prezime
email
Sve sto vam dalje zatreba dopunite klasu.

Kreiarti klasu InstagramTag koja ima:
x koordinatu na slici
y koordinatu na slici
usera koji je tagovan

Kreirati klasu InstagramImage koja ima:
niz tagova
dimenziju slike
putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
metodu dodajTag

Kreirati klasu InstagramPost koja ima
niz slika
Opis koji moze da se postavi za post
metodu dodajSliku

	 */
		// Kreiramo neke korisnike
		InstagramUser user1 = new InstagramUser("pera", "Petar Petrović", "pera@gmail.com");
		InstagramUser user2 = new InstagramUser("mika", "Mihajlo Mihajlović", "mika@gmail.com");
		InstagramUser user3 = new InstagramUser("zika", "Živko Živković", "zika@gmail.com");

		// Kreiramo neke slike
		InstagramImage image1 = new InstagramImage("800x600", "instagram.com/pera/profilna.jpg");
		InstagramImage image2 = new InstagramImage("1024x768", "instagram.com/mika/odmor.jpg");
		InstagramImage image3 = new InstagramImage("640x480", "instagram.com/zika/rodjendan.jpg");

		// Kreiramo neke tagove
		InstagramTag tag1 = new InstagramTag(100, 200, user1); 
		InstagramTag tag2 = new InstagramTag(300, 400, user2); 
		InstagramTag tag3 = new InstagramTag(500, 600, user3); 
		InstagramTag tag4 = new InstagramTag(700, 800, user1); 

		// Dodajemo tagove na slike
		image1.dodajTag(tag1);
		image1.dodajTag(tag2);
		image2.dodajTag(tag3);
		image3.dodajTag(tag4);

		// Kreiramo neke postove
		InstagramPost post1 = new InstagramPost("Ovo je moja profilna slika", user1);
		InstagramPost post2 = new InstagramPost("Uživam na odmoru", user1);
		InstagramPost post3 = new InstagramPost("Srećan rođendan meni", user2);

		// Dodajemo slike u postove
		post1.dodajSliku(image1);
		post2.dodajSliku(image2);
		post3.dodajSliku(image3);

		// Ispisujemo informacije o postovima
		post1.print();
		System.out.println("***********************");
		post2.print();
		System.out.println("***********************");
		post3.print();
	}

}
