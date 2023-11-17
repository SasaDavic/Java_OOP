package p23_08_2022_Zadatak3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Kreirati klasu Sastojak koja ima:
naziv sastojka
cenu 
gettere i settere 
konstuktore

--U glavnom programu kreirati 3 sastojka.
 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. 
 Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

	 */
		Sastojak a001 = new Sastojak("so", 95);
		Sastojak a002 = new Sastojak("secer", 150);
		Sastojak a003 = new Sastojak("Brasno", 98);
		
		ArrayList<Sastojak> niz = new ArrayList<Sastojak>();
		
		niz.add(a001);
		niz.add(a002);
		niz.add(a003);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Upisite N: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite ime sastojka: ");
			String ime = s.next();
			System.out.println("Unesite cenu: ");
			double cena = s.nextDouble();
			Sastojak i1 = new Sastojak(ime, cena);
			niz.add(i1);
		}
		System.out.println("Sastojci: ");
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(i + 1 + ". ");
			niz.get(i).print();
		}

	}

}
