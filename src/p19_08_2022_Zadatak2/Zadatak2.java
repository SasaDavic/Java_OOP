package p19_08_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu Radnik koja ima:
●	jmbg radnika
●	ime i prezime
●	broj dece (1,2,3,... ili 0 ako nema dece)
●	stepen strucne spreme (od 1 do 8)
●	godine radnog staza
●	konstuktor koji postavlja samo jmbg
●	konstuktor koji postavlja sve atribute
●	getere i setere
●	metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
●	metodu koja vraca koeficijent slozenosti:
○	Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.
●	metodu koja racuna platu radnika, plata se racuna po formuli:
25000 + (koeficijent slozenosti + minuli rad) * 10000
●	metodu koja vraca da li je zaposleni kreditno sposoban. 
(Kreditno je sposoban ako je plata veca od 50 000)

Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
- do 10 godina 0.05
- od 10-20 godina 0.075
- preko 20 godina 0.1

Koeficijent slozenosti
- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

	 */
		
		Radnik a1 = new Radnik("0202002635896", "Milan Mitic", 3, 6, 10);
		double x = a1.racunajPlatu();
		boolean y = a1.kreditnoSposoban();
		if (y == true) {
			System.out.println("Radnik je kreditno sposoban. Plata: " + x);
		} else {
			System.out.println("Radnik nije kreditno sposoban. Plata: " + x);
		}
		
	}

}
