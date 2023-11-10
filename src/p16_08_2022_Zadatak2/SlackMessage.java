package p16_08_2022_Zadatak2;

public class SlackMessage {
	public String textPoruke;
	public String porukaOdOsobe;
	public String datumIvreme;
	
	public void stampaj() {
		System.out.println("-----------------------------------");
		System.out.println(porukaOdOsobe + " - " + datumIvreme);
		System.out.println(textPoruke);
		System.out.println("-----------------------------------");
	}
}
