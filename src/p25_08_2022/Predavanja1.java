package p25_08_2022;

public class Predavanja1 {

	public static void main(String[] args) {
		
//			ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
			
			Reziser r = new Reziser("Pera Peric");
			
			Film f1 = new Film("Roki 1", 1999);
			Film f2 = new Film("Roki 2", 2001);
			Film f3 = new Film("Roki 3", 2004);
			Film f4 = new Film("Roki 4", 2007);
			r.dodajFilm(f1);
			r.dodajFilm(f2);
			r.dodajFilm(f3);
			r.dodajFilm(f4);
			
			r.stampajPodatke();
			
	//
//			ArrayList<Film> filmovi = new ArrayList<Film>();
//			
//			filmovi.add(f1);
//			filmovi.add(f2);
//			
//			r.setFilmovi(filmovi);
//			
//			filmovi.add(f3);
//			r.setFilmovi(filmovi);
			

		}

	}


