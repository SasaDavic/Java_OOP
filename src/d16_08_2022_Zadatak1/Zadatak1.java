package d16_08_2022_Zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u 
koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

	 */
		
		Proizvod jogurt = new Proizvod();
		jogurt.cena = 250;
		jogurt.naziv = "Imlek - jogurt";
		jogurt.tezinaGrami = 500;
		jogurt.stampaj();
		
		System.out.println("********************************");
		
		Proizvod pavlaka = new Proizvod();
		pavlaka.cena = 400;
		pavlaka.naziv = "Imlek - pavlaka";
		pavlaka.tezinaGrami = 1000;
		pavlaka.stampaj();
		
		

	}

}
