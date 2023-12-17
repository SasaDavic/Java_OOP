package p06_09_2022_Zadatak4;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Kreirati apstraktnu klasu Atleticar čiji su tributi: 
ime i prezime privatni
i rezultat ostvaren na takmičenju koji je zasticen
Javne metode klase su: 
apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara 
(metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, 
a kod skakača veći. 

Kreirati i klasu Disciplina čiji su privatni atributi: 
ime discipline
tip discipline (Trkacka ili Skakacka)
niz atletičara koji učestvuju u toj disciplini. 
U javnom delu klase definisati: 
konstuktore, gettere i settere
konstruktor koji postavlja ime discipline i tip
metodu dodaj atleticara u disciplinu
metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline. 
U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,  
(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline. 
	 */

		Skakac s1 = new Skakac("M1", 21);
		Skakac s2 = new Skakac("M2", 20);
		Skakac s3 = new Skakac("M3", 24);
		Skakac s4 = new Skakac("M4", 25);
		Skakac s5 = new Skakac("M5", 23);
		
		
		Trkac t1 = new Trkac("P1", 14);
		Trkac t2 = new Trkac("P2", 15);
		Trkac t3 = new Trkac("P3", 17);
		Trkac t4 = new Trkac("P4", 18);
		Trkac t5 = new Trkac("P5", 19.5);
		
		Disciplina d1 = new Disciplina("Skok u dalj", "Skakac");
		d1.dodajAtleticara(s1);
		d1.dodajAtleticara(s2);
		d1.dodajAtleticara(s3);
		d1.dodajAtleticara(s4);
		d1.dodajAtleticara(s5);
		d1.diskvalifikujAtleticara("M4");
		d1.pobednikDiscipline();
		
		Disciplina d2 = new Disciplina("110m s preponama", "Trkac");
		d2.dodajAtleticara(t1);
		d2.dodajAtleticara(t2);
		d2.dodajAtleticara(t3);
		d2.dodajAtleticara(t4);
		d2.dodajAtleticara(t5);
		d2.diskvalifikujAtleticara("P1");
		d2.pobednikDiscipline();
		
		
	}

}
