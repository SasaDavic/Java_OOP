package p05_09_2022_Zadatak2;

public class MasterKartica extends PlatnaKartica {
	
	 public MasterKartica(double suma, String brKartice, int godIsteka, int mesecIsteka) {
		super(suma, brKartice, godIsteka, mesecIsteka);
	}
	  
	  	public void naplatiOdrzavanje() {
		this.suma -= 2;
		}
	  
		@Override
		public void izvrsiTransakciju(double transakcija) {
			this.suma -= (transakcija * 1.015);
			
		}
		@Override
		public void stampaj() {
			System.out.println("Master Card: " + this.mesecIsteka + "/" + 
					this.godIsteka + ", " + this.brKartice + ", $" + this.suma);
	
		}
}
