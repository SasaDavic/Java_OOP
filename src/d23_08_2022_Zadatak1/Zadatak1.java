package d23_08_2022_Zadatak1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
Kreirati klasu ZeleniKarton koja ima:
ime i prezime studenta 
broj indeksa 
naziv predmeta
ime i prezime profesora
ocenu - od 5 do 10
gettere i settere
konstruktore
metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
metodu stampaj koja stampa podatke u formatu:
		(naziv predmeta) - (ocena)
		Student: ime i prezime, broj indeksa
		Profesor: ime i prezime

	U glavnoj klasi:
kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

	 */
		
		ArrayList<ZeleniKarton> karton = new ArrayList<ZeleniKarton>();
		ZeleniKarton a1 = new ZeleniKarton("Mila Mitic", 2563, "Matematicka analiza 1", "Miodrag Jovic", 5);
		karton.add(a1);
		ZeleniKarton a2 = new ZeleniKarton("Milos Mikic", 7896, "Kompleksna analiza", "Dragana Cvetkovic", 8);
		karton.add(a2);
		ZeleniKarton a3 = new ZeleniKarton("Danijela Kisic", 8965, "Kompleksna analiza", "Dragana Cvetkovic", 5);
		karton.add(a3);
		ZeleniKarton a4 = new ZeleniKarton("Milos Jovanovic", 7412, "Kompleksna analiza", "Dragana Cvetkovic", 9);
		karton.add(a4);
		ZeleniKarton a5 = new ZeleniKarton("Jovana Antic", 7856, "Kompleksna analiza", "Dragana Cvetkovic", 10);
		karton.add(a5);
		ZeleniKarton a6 = new ZeleniKarton("Milica Jovanovic", 7654, "Kompleksna analiza", "Dragana Cvetkovic", 7);
		karton.add(a6);
		ZeleniKarton a7 = new ZeleniKarton("Milos Jokic", 7852, "Kompleksna analiza", "Dragana Cvetkovic", 9);
		karton.add(a7);
		ZeleniKarton a8 = new ZeleniKarton("Milan Mitic", 2563, "Matematicka analiza 1", "Miodrag Jovic", 5);
		karton.add(a8);
		ZeleniKarton a9 = new ZeleniKarton("Dragan Mitic", 7463, "Matematicka analiza 1", "Miodrag Jovic", 7);
		karton.add(a9);
		ZeleniKarton a10 = new ZeleniKarton("Aleksa Pantic", 3663, "Matematicka analiza 1", "Miodrag Jovic", 7);
		karton.add(a10);
		
		for (int i = 0; i < karton.size(); i++) {
			karton.get(i).stampaj();
		}
		
		double suma = 0;
		for (int i = 0; i < karton.size(); i++) {
			suma += karton.get(i).getOcena();
		}
		double prosek = suma / karton.size();
		System.out.println("Prosek: " + prosek);
		
		double suma1 = 0;
		int brojac = 0;
		for (int i = 0; i < karton.size(); i++) {
			if (karton.get(i).getOcena() > 5) {
				suma1 += karton.get(i).getOcena();
				brojac++;
			}
		}
		DecimalFormat df = new DecimalFormat("#.##");
		double prosekPolozenih = suma1 / brojac;
		String p = df.format(prosekPolozenih);
		System.out.println("Prosek polozenih ispita: " + p);
	}

}
