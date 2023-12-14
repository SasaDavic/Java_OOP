package p05_09_2022_Zadatak5;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
Npr: Ice point vanila sa dodacima: plazma, cokolada
Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez

Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
 naziv dodatka
 cenu dodatka
 konstruktore, gettere i settere koji su vam potrebni
 metodu stampaj koja stampa u formatu:
(dodatak)  (cena)

Kreirati abstraktnu klasu Proizvod koja ima:
 niz dodataka
 metodu ubaciDodatak koja dodaje dodatak u niz
 metodu koja vraca cenu svih dodataka koje ima proizvod
 abstraktnu metodu ukupnu racunaj cenu 
 abstraktnu metodu stampaj

Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
 tip sladoleda (vanila, cokolada)
 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
 override uje metodu koja ukupnu cenu racuna:
ako je mali ice point na cenu svih dodataka doda 100
ako je veliki ice point cenu svih dodataka doda 130
override uje metodu stampaj da stampa sve podatke
	
Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
 cena podloge
 override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
override uje metodu stampaj da stampa sve podatke
	
U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. 
Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

	 */
		IcePoint ice1 = new IcePoint("vanila", true);
		IcePoint ice2 = new IcePoint("cokolada", false);
		IcePoint ice3 = new IcePoint("stracatela", false);
		Pica pizza1 = new Pica(150);
		Pica pizza2 = new Pica(100);
		
		Dodatak a1 = new Dodatak("keks", 25);
		Dodatak a2 = new Dodatak("banana", 100);
		Dodatak a3 = new Dodatak("cokolada", 150);
		Dodatak a4 = new Dodatak("slag", 30);
		Dodatak a5 = new Dodatak("karamela", 75);
		
		Dodatak b1 = new Dodatak("sunka", 250);
		Dodatak b2 = new Dodatak("kackavalj", 150);
		Dodatak b3 = new Dodatak("origano", 10);
		Dodatak b4 = new Dodatak("masline", 50);
		Dodatak b5 = new Dodatak("pecurke", 75);
		
		ice1.ubaciDodatak(a2);
		ice1.ubaciDodatak(a1);
		ice2.ubaciDodatak(a3);
		ice3.ubaciDodatak(a5);
		ice3.ubaciDodatak(a1);
		pizza1.ubaciDodatak(b1);
		pizza1.ubaciDodatak(b2);
		pizza1.ubaciDodatak(b3);
		pizza1.ubaciDodatak(b4);
		pizza1.ubaciDodatak(b5);
		pizza2.ubaciDodatak(b4);
		pizza2.ubaciDodatak(b5);
		ArrayList<Proizvod> p = new ArrayList<>();
		p.add(ice1);
		p.add(ice2);
		p.add(ice3);
		p.add(pizza1);
		p.add(pizza2);
		for (int i = 0; i < p.size(); i++) {
			p.get(i).stampaj();
			System.out.println("*****************");
		}
			
		}
	}


