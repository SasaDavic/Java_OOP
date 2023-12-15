package d05_09_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*

Kreirati klasu Sektor koja ima:
 naziv sektora
 platu koja je za taj sektor

Kreirati abstraktnu klasu Radnik koja ima:
 ime i prezime
 niz sektora u kojima radi
 abstraktnu metodu koja vraca platu radnika
 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
 suma plata svih sektor / broj sektora * 0.5
 override uje metodu za platu, tako da se plata racuna po formuli:
(prosecna plata za sve sektore u kojima radi) * (broj sektora).

U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

	 */
		Sektor a = new Sektor("proizvodnja", 50000);
		Sektor b = new Sektor("kvalitet", 70000);
		Sektor c = new Sektor("finalna kontrola", 80000);
		Sektor d = new Sektor("magacin", 100000);
		Sektor e = new Sektor("HR", 100000);
		
		Magacioner a1 = new Magacioner("Miki Mikic");
		Menadzer b1 = new Menadzer("Toni Matic");
		a1.zaposliSeUsektor(a);
		a1.zaposliSeUsektor(d);
		b1.zaposliSeUsektor(a);
		b1.zaposliSeUsektor(d);

		System.out.println("Plata menadzera je: " + b1.plata());
		System.out.println("Plata magacionera je: " + a1.plata());
	}

}
