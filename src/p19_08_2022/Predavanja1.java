package p19_08_2022;

import java.util.Scanner;

public class Predavanja1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		niz.set
//		niz.get(0)
		Korisnik k = new Korisnik();
		k.setIme("Milan");
		k.setPrezime("Jovanovic");
		k.setEmail("milan@gmail.com");
		
		System.out.println(k.getIme() + " " + k.getPrezime());
		
//		k.ime = "Milan";
//		k.prezime = "Jovanovic";
//		k.email = "milan@gmail.com";

//		Korisnik m = new Korisnik("Nikola", "Nikolic", "nikola@gmail.com");
		
//		m.stamapaj();
//		
//		Korisnik l = new Korisnik("Lazar");
//		l.stamapaj();
		
		System.out.println("KRAJ");
		
		
		
		
		System.out.println(k);

	}

}
