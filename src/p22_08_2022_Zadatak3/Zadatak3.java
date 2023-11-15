package p22_08_2022_Zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati klasu Proizvod koja ima
Naziv proizvoda
kupca/musteriju
cenu izrade proizvoda
gettere i settere
konstruktore
Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
Metodu za stampanje proizvoda u formatu:
naziv proizvoda - cena
ime i prezime - broj kartice

Kreirati klasu Kupac koja ima:
ime i prezime
clansku kartu
gettere i settere, clanska karta ne moze da se menja
konstruktore
metodu stampaj koja stampa u formatu
ime i prezime - broj kartice

Kreirati klasu ClanskaKarta koja ima:
popust (u rasponu od 5 do 10 %)
broj kartice (npr: 9329-0239)
gettere i setter 
konstuktore

	 */
		
		ClanskaKarta karta = new ClanskaKarta(15, "123-852");
		Kupac kupac = new Kupac("Mica", karta);
		Proizvod proizvod = new Proizvod("Kais", 250);
		proizvod.setKupac(kupac);
		proizvod.stampaj();
		

	}

}
