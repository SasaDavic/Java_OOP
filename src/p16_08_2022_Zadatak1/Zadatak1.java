package p16_08_2022_Zadatak1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

/*
 * Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. 
 * Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
 * Primer izvrsenja:
		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
		Primalac: Marko Markovic, 840-23932-334, stanje: 200
		Unesite sumu za transakciju: 500
		Stanje nakon stransakcije
		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
		Primalac: Marko Markovic, 840-23932-334, stanje: 700

 */
		Scanner s = new Scanner(System.in);
		
		Racun posaljilac = new Racun();
		posaljilac.punoImeVlasnika = "Milan Jovanovic";
		posaljilac.racun = "840-23932-323";
		posaljilac.stanje = 1000;
		System.out.println("Posaljilac: " + posaljilac.punoImeVlasnika + ", " + posaljilac.racun + ", "
							+ "stanje: " + posaljilac.stanje);
		
		Racun primalac = new Racun();
		primalac.punoImeVlasnika = "Marko Markovic";
		primalac.racun = "840-23932-334";
		primalac.stanje = 200;
		System.out.println("Primalac: " + primalac.punoImeVlasnika + ", " + primalac.racun + ", "
				+ "stanje: " + primalac.stanje);
		
		System.out.println("Unesite sumu za transakciju: ");
		int n = s.nextInt();
		primalac.stanje += n;
		posaljilac.stanje -= n;

		System.out.println("Stanje nakon stransakcije: ");
		System.out.println("Posaljilac: " + posaljilac.punoImeVlasnika + ", " + posaljilac.racun + ", "
				+ "stanje: " + posaljilac.stanje);
		System.out.println("Primalac: " + primalac.punoImeVlasnika + ", " + primalac.racun + ", "
				+ "stanje: " + primalac.stanje);
	}

}
