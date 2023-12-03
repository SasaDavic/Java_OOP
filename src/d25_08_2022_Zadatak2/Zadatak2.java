package d25_08_2022_Zadatak2;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. 
Znaci nije vam potrebna provera za opseg brojeva.

Za potrebe Lotto igre na srecu potrebno je 
Kreirati klasu Kombinacija koja ima:
id kombinacije (String)
niz brojeva - niz je od 7 broja (ArrayList<Integer>)
konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
gettere za atribute Kombinacija(String id, int jedan, int dva, …)
metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
Zaglavlje metode je:
public boolean daLiJeIstaKombinacija( Kombinacija k)
metoda vraca true ako su svi elementi na istim pozicija isti
npr: this [0] == k [0], this [1] == k [1] …. 
metodu za stampu koja stampa podatke u formatu
ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23


Kreirati klasu Listic koja ima: 
niz kombinacija - maksimalno 7 kombinacija
metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. 
Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. 
Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
Zaglavlje metode 
public boolean dobitna(Kombinacija dobitnaKombinacija)
metodu koja stampa listic u formatu
ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23

ID: id kombinacije
brojevi: 1, 3, 5, 14, 15, 21, 23

…… i tako za sve kombinacije

	 */
		

	        ArrayList<Integer> izabraniBrojevi = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi1 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi2 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi3 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi4 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi5 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi6 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi7 = new ArrayList<Integer>();
	        ArrayList<Integer> izabraniBrojevi8 = new ArrayList<Integer>();

	        
	        Kombinacija dobitnaKombinacija = new Kombinacija("000", 12, 15, 18, 23, 39, 2, 5);
	        Kombinacija kombinacija1 = new Kombinacija("002", 12, 15, 18, 23, 39, 2, 5);
	        Kombinacija kombinacija2 = new Kombinacija("003", 1, 15, 8, 23, 39, 2, 5);
	        Kombinacija kombinacija3 = new Kombinacija("004", 1, 15, 18, 2, 39, 2, 5);
	        Kombinacija kombinacija4 = new Kombinacija("005", 1, 15, 8, 23, 3, 21, 5);
	        Kombinacija kombinacija5 = new Kombinacija("006", 12, 15, 18, 23, 39, 2, 5);
	        Kombinacija kombinacija6 = new Kombinacija("007", 12, 15, 23, 25, 39, 8, 5);
	        Kombinacija kombinacija7 = new Kombinacija("008", 15, 12, 18, 23, 39, 2, 5);
	        Kombinacija kombinacija8 = new Kombinacija("009", 12, 15, 18, 23, 39, 2, 5);
	        
	        Listic listic = new Listic();
	        listic.dodajKombinaciju(kombinacija1);
	        listic.dodajKombinaciju(kombinacija2);
	        listic.dodajKombinaciju(kombinacija3);
	        listic.dodajKombinaciju(kombinacija4);
	        listic.dodajKombinaciju(kombinacija5);
	        listic.dodajKombinaciju(kombinacija6);
	        listic.dodajKombinaciju(kombinacija7);
	        listic.dodajKombinaciju(kombinacija8);
	        
	        listic.dobitna(dobitnaKombinacija);
	        listic.stampajListic();
	        
	        
	    }

	} //nesto nije kako treba


