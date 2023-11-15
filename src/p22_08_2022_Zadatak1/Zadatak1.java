package p22_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu Film koja ima:
naziv filma
iz koje godine je film 
reziser
konstruktore, gettere i settere koji su potrebni
metodu print koja stampa podatke u formatu
naziv filma, godina
Rezirao je: Ime prezime, starost.god

Kreirati klasu Reziser koja ima:
ime i prezime rezisera
starost
konstruktore, gettere i settere koji su potrebni
metodu print koja stampa podatke u formatu
ime prezime, starost.god

U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda

	 */

		
		Reziser a0 = new Reziser("Dragan Bjelogrlic", 60);
		Film b0 = new Film("Toma", 2021);
		b0.setReziser(a0);
		b0.print();
		
		
		
	}

}
