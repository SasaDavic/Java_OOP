package d16_08_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za izabranu temperaturu 
atribut za mod (hladi/greje) - string
metodu za stampu (proizvoljno)
metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
Metoda kao parametar prima temperaturu koja je napolju.

U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

	 */
		int spoljnaTemp = 25;
		
		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.marka = "Samsung";
		klima1.mod = "greje";
		klima1.temperatura = 30;
		klima1.stampaj();
		if (klima1.jeVecaTemperaturaNapolju(spoljnaTemp) == true) {
			System.out.println("Napolju je veca temperatura!");
		} else {
			System.out.println("Napolju je manja temperatura!");
		}
		
		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima2.marka = "Beko";
		klima2.mod = "hladi";
		klima2.temperatura = 20;
		klima2.stampaj();
		if (klima2.jeVecaTemperaturaNapolju(spoljnaTemp) == true) {
			System.out.println("Napolju je veca temperatura!");
		} else {
			System.out.println("Napolju je manja temperatura!");
		}
		
	}

}
