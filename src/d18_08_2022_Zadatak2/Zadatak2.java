package d18_08_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu FacebookPost koja ima:
   Od atributa:
ime i prezime korisnika koji je objavio post
ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite 
objavu na tudjem profilu)
tekst objave
broj lajkova
broj deljenja
  Od metoda:
like(), koja povecava broj lajkova za 1.
dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
share(), koja povecava broj deljenja za 1
print(), koja stampa objavu u formatu:
(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
(tekst objave)
Likes (broj lajkova) | Shares (broj deljenja)

U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

Primer stampanja:
Milan Jovanovic >>> Pera Peric
Ovo je tekst objave
Likes 3 | Shares 1


	 */
		
		FacebookPost a1 = new FacebookPost();
		a1.namePosted = "Mila";
		a1.nameProfil = "Miki";
		a1.text = "Kako si prijatelju stari?";
		a1.likes = 10;
		a1.share = 5;
		a1.like();
		a1.like();
		a1.dislike();
		a1.share();
		a1.print();
		
		FacebookPost a2 = new FacebookPost();
		a2.namePosted = "Duki";
		a2.nameProfil = "Milos";
		a2.text = "Zdravo!";
		a2.likes = 0;
		a2.share = 0;
		a2.share();
		a2.dislike();
		a2.dislike();
		a2.like();
		a2.print();

	}

}
