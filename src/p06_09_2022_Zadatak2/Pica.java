package p06_09_2022_Zadatak2;

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
		public double ukupnaCena() {
			return cenaDodataka() + this.cenaPodloge;
		}
		@Override
		public void stampaj() {
			System.out.println("Pizza: ");
			System.out.println("Dodaci: ");
			for (int i = 0; i < dodaci.size(); i++) {
				System.out.print(i + 1 + ". ");
				dodaci.get(i).stampaj();
			}
			System.out.println("Cena podloge: " + this.cenaPodloge);
			
		} 
}
