package p23_08_2022_Zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Kreirati klasu ViberKorisnik koja ima:
ime i prezime
broj telefona
da li je trenutno aktivan (boolean)
gettere, settere, konstuktore

Kreirati klasu ViberPoruka koja ima:
tekst poruke
vreme kad je poslata poruka
korisnika koji je poslao poruku
korisnika kome je poslata poruka
gettere i setere i konstuktore
rekaciju na poruku
metodu prikazi koja stampa podatke o poruci u formatu:
From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
To: [Ime i prezime korisnika kome je poslata]
[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]

POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
if (this.reakcija != null)

Kreirati klasu ViberReakcija koja ima:
emoji (moze da bude sunglases, heart, smile, like ili sad)
korisnika koji je reagovao
U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

	 */
		
		ViberKorisnik prvi = new ViberKorisnik("Mila", "018/563-965");
		ViberKorisnik drugi = new ViberKorisnik("Masa", "011/896-6523");
		drugi.setAktivan(false);
		ViberPoruka poruka = new ViberPoruka("Zdravo", "15:40 17.11.2022.", prvi, drugi);
		poruka.print();
		ViberReakcija emoji1 = new ViberReakcija(":D", drugi);
		poruka.setReakcija(emoji1);
		poruka.print();
		
		
		

	}

}
