package d05_09_2022_Zadatak1;

public class Menadzer extends Radnik {
	
	
	public Menadzer(String punoIme) {
		super(punoIme);
	}

	public double plata() {
		double plata = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			plata += nizSektora.get(i).getPlata();
		}
		return plata;
	}
}
