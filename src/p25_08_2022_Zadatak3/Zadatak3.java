package p25_08_2022_Zadatak3;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 * Za potrebe google istorije potrebno je kreirati sledece klase.
Klasu HistoryPage koja ima:
naziv stranice
link do stranice 
vreme otvaranja stranice - sat i minut (2 atributa)
username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
konstuktore koji su logicni
gettere i setter (username i password nemaju settere)
metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
Metoda obrisi kolacice koja setuje username i password na null.
Metoda stampaj koja stampa podatke u formatu:
[sat] - [minut] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]


Klasu History koja ima:
niz stranica koje su posecene
metoda otvori stranicu koja dodaje novi historypage u niz.
metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
metoda obrisi istoriju - metoda brise celu istoriju
metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
metoda pogledajIstoriju - stampa sve posecene stranice
metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

	 */
//greska u tekstu - history page je home page!
		
		
		History history = new History();
		history.openPage("Google", "www.google.com", 15, 15);
		history.openPage("Youtube", "www.youtube.com", 26, 15);
		history.openPage("Wikipedia", "www.wiki.com", 56, 18);
		history.openPage("Facebook", "www.facebook.com", 02, 19);
		history.openPage("PMF", "www.pmf.edu.rs", 20, 20);
		history.saveCredentials("Youtube", "mina", "0123");		
		history.saveCredentials("PMF", "student", "3223");
		history.viewHistory();
		history.deleteAllCookies();
		System.out.println("-----------------------");
		history.viewHistory(); //ne brise kolacice u poslednjem satu
		
		history.deleteHistory();//??
		System.out.println("-----------------------");
		history.viewHistory(); 
		
		
	}

}
