package p16_08_2022_Zadatak2;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
Krairti klasu SlackMessage koja ima:
tekst poruke
ime i prezime osobe koja je stavila poruku
datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
[ime i prezime osobe] - [kad je poslata]
[Tekst poruke]

Dopuna:
Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu koji je naveden iznad i u 
mainu pozovite metode nad objektima koje ste kreirali.
	 */
		
		
		SlackMessage prva = new SlackMessage();
		prva.textPoruke = "Zdravo!";
		prva.datumIvreme = "15.08.2023 15:44";
		prva.porukaOdOsobe = "Mina";
		System.out.println(prva.porukaOdOsobe + " - " + prva.datumIvreme);
		System.out.println(prva.textPoruke);
		prva.stampaj();
		
		SlackMessage druga = new SlackMessage();
		druga.textPoruke = "hellloooo!";
		druga.datumIvreme = "20.05.2022 16:40";
		druga.porukaOdOsobe = "Pera";
		System.out.println(druga.porukaOdOsobe + " - " + druga.datumIvreme);
		System.out.println(druga.textPoruke);
		druga.stampaj();
		
		
		
		
	}

}
