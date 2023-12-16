package p06_09_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
Npr: Ice point vanila sa dodacima: plazma, cokolada
Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez

Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
 naziv dodatka
 cenu dodatka
 konstruktore, gettere i settere koji su vam potrebni
 metodu stampaj koja stampa u formatu:
(dodatak)  (cena)

Kreirati abstraktnu klasu Proizvod koja ima:
 niz dodataka
 metodu ubaciDodatak koja dodaje dodatak u niz
 metodu koja vraca cenu svih dodataka koje ima proizvod
 abstraktnu metodu ukupnu racunaj cenu 
 abstraktnu metodu stampaj

Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
 tip sladoleda (vanila, cokolada)
 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
 override uje metodu koja ukupnu cenu racuna:
ako je mali ice point na cenu svih dodataka doda 100
ako je veliki ice point cenu svih dodataka doda 130
override uje metodu stampaj da stampa sve podatke
	
Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
 cena podloge
 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
override uje metodu stampaj da stampa sve podatke
	
U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. 
Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

Dopuna na 2.zad
Kreirati klasu Kasa koja ima:
niz svih dostupnih dodataka sa cenama.
niz proizvoda
metodu dodaj proizvod
Difoltni konstuktor u kom se u niz dodaju 10 razlicitih sastojaka u niz
Npr: luk, piletina, junetina, prsuta, jaja, cokolada, …
metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka. 
Metoda vraca dodatak (objekat tipa Dodatak)
metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
metodu setampajRacun, metoda stampa sve proizvode i ukupan racun

U mainu kreirati jednu kasu i u nju dodajte 3-4 proizvoda sa nekoliko dodatak i stampajte racun.
U mainu ne kreirate dodatke!!!! Koristite samo one koje vec ima kasa
	 */
		Kasa kasa = new Kasa();
		
		IcePoint ice = new IcePoint("vanila", false);
		ice.ubaciDodatak(kasa.traziDodatak("Jagoda"));
		ice.ubaciDodatak(kasa.traziDodatak("Keks"));
		ice.ubaciDodatak(kasa.traziDodatak("Karamela"));
		kasa.dodajProizvod(ice);
		
		IcePoint ice1 = new IcePoint("cokolada", true);
		ice1.ubaciDodatak(kasa.traziDodatak("Slag"));
		ice1.ubaciDodatak(kasa.traziDodatak("Cokolada"));
		kasa.dodajProizvod(ice1);
		
		IcePoint ice3 = new IcePoint("vocni", false);
		ice3.ubaciDodatak(kasa.traziDodatak("Keks"));
		kasa.dodajProizvod(ice3);
		
		Pica pica = new Pica(150);
		pica.ubaciDodatak(kasa.traziDodatak("Luk"));
		pica.ubaciDodatak(kasa.traziDodatak("Origano"));
		pica.ubaciDodatak(kasa.traziDodatak("Sunka"));
		pica.ubaciDodatak(kasa.traziDodatak("Kackavalj"));
		pica.ubaciDodatak(kasa.traziDodatak("Pelat"));
		kasa.dodajProizvod(pica);
		
		Pica pica1 = new Pica(200);
		pica1.ubaciDodatak(kasa.traziDodatak("Sunka"));
		pica1.ubaciDodatak(kasa.traziDodatak("Kackavalj"));
		kasa.dodajProizvod(pica1);
		
		kasa.setampajRacun();
		
	}

}
