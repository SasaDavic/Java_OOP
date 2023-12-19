package v17_12_2023;

public class Zadatak {

	public static void main(String[] args) {
	/*
Knjiga: Svaka knjiga ima naslov, autora, godinu izdanja i status dostupnosti. 
Knjiga može biti iznajmljena ili vraćena.

Clan: Svaki član biblioteke ima ime, prezime i listu iznajmljenih knjiga. 
Član može da iznajmi ili vrati knjigu.

Biblioteka: Biblioteka ima listu svih knjiga i članova. Biblioteka može da doda novu knjigu, novog člana, 
iznajmi knjigu članu ili primi vraćenu knjigu.

Implementirajte sve potrebne metode za ove klase. Takođe, dodajte odgovarajuće provere 
kako biste osigurali da se knjiga ne može iznajmiti ako je već iznajmljena, da član ne može 
iznajmiti više od 3 knjige odjednom, itd.
	 */
		Knjiga k1 = new Knjiga("Knjiga o Titu", "Dobrica Ćosić", 2023, 0001);
		Knjiga k2 = new Knjiga("Daleko je sunce", "Dobrica Ćosić", 2023, 0002);
		Knjiga k3 = new Knjiga("Vreme vlasti II", "Dobrica Ćosić", 2023, 0003);
		Knjiga k4 = new Knjiga("Vreme vlasti I", "Dobrica Ćosić", 2023, 0004);
		Knjiga k5 = new Knjiga("Deobe", "Dobrica Ćosić", 2023, 0005);
		
		Clan c1 = new Clan("Nina", "Stankovic", 9001);
		Clan c2 = new Clan("Ana", "Nikolic", 9002);
		Clan c3 = new Clan("Neda", "Stankovic", 9003);
		
		Biblioteka b = new Biblioteka();
		b.ubaciNovuKnjigu(k1);
		b.ubaciNovuKnjigu(k2);
		b.ubaciNovuKnjigu(k3);
		b.ubaciNovuKnjigu(k4);
		b.ubaciNovuKnjigu(k5);
		
		b.uclani(c1);
		b.uclani(c2);
		b.uclani(c3);
		
		b.iznajmiKnjigu(9001, "Deobe");
		b.iznajmiKnjigu(9001, "Vreme vlasti I");
		b.iznajmiKnjigu(9001, "Daleko je sunce");
		b.iznajmiKnjigu(9001, "Knjiga o Titu");
		
		b.iznajmiKnjigu(9002, "Deobe");
		
		b.vratiKnjigu(9001, "Vreme vlasti II");
		b.vratiKnjigu(9002, "Deobe");
		
	}

}
