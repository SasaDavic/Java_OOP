package d05_09_2022_Zadatak1;

public class Magacioner extends Radnik {
	
	public Magacioner(String punoIme) {
		super(punoIme);
	}
	
	private double prosecnaPlataSvihSektora() {
		double plata = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			plata += nizSektora.get(i).getPlata();
		}
		return plata / nizSektora.size() * 0.5;
	}
		
		@Override
		public double plata() {
			return prosecnaPlataSvihSektora() * nizSektora.size();
		}
}
