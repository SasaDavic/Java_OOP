package p26_08_2022_Zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 * Kreirati klasu Paket koja ima:
naziv paketa
ime i prezime korisnika
mesecnu cenu
ugovorna obaveza
brzina interneta za download
brzina interneta za upload
getere, setere i konstuktore koji su logicni (brzine interneta nije moguce menjati kao i naziv paketa)
metodu produzi ugovor koja produzava ugovor za 12 meseci
metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
metodu za stampu koja stampa podatke u formatu:
ime i prezime korisnika
naziv paketa - brzina download/brzina upload - ugovorna obaveza
cena

	Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
ovaj paket ima 3 meseca po dinar
ovaj paket se zove EON LIGHT DUO
brzina interneta ovog paketa je 150/75 MB
metodu za stampu koja stampa podatke u formatu:
ime i prezime korisnika 
naziv paketa - brzina download/brzina upload - ugovorna obaveza
cena + broj meseci za dinar


	Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
ovaj paket ima 6 meseci po dinar
naziv paketa je EON FULL DUO
uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
brzina interneta ovog paketa je 250/100 MB
metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
metodu za stampu 
ime i prezime korisnika 
naziv paketa - brzina download/brzina upload - ugovorna obaveza
cena + broj meseci za dinar

	 */
		
		EONPaket paket1 = new EONPaket("Mila Jovic", 2500, 24);
		paket1.produziUgovor12meseci();
		paket1.stampaj();
		
		DUOPaket duo = new DUOPaket("Dusan Jovic", 4500, 12, "laptop");
		duo.povecajBrzinu(5);
		duo.stampaj();

	}

}
