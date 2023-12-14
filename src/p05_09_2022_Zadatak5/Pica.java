package p05_09_2022_Zadatak5;

public class Pica extends Proizvod {
	private double cenaPodloge;
	
	
		public double getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(double cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

		public Pica(double cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

		@Override
		public void racun() {
			double cena = this.cenaPodloge + cenaSvihDodataka();
		System.out.println("Cena pizze je : " + cena);			
		}

		@Override
		public void stampaj() {
			System.out.println("Pizza: ");
			System.out.println("Cena podloge: " + this.cenaPodloge);
			System.out.println("Dodaci: ");
			for (int i = 0; i < nizDodataka.size(); i++) {
				System.out.print(i + 1 + ". ");
				nizDodataka.get(i).stampaj();
			}
			racun();			
		} 
			
}
