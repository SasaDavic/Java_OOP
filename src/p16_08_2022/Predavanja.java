package p16_08_2022;

public class Predavanja {

	public static void main(String[] args) {
//		String ime = "Milan";
//		String email = "milan@gmail.com";
// 		klasa gde pravimo objekte iz klase korisnik
		
		Korisnik k = new Korisnik();
		k.ime = "Milan";
		k.email = "milan@gmail.com";
		k.godine = 27;
		k.stampaj();
		
		
		
		Korisnik r = new Korisnik();
		r.ime = "Nikola";
		r.godine = 29;
		r.email = "nikola@gmail.com";
		r.stampaj();

	}

}
