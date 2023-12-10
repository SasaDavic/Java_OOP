package p05_09_2022_Zadatak2;

public class VisaKartica extends PlatnaKartica {
	
	private String ovlascenoLice;
		
	 public VisaKartica(double suma, String brKartice, int godIsteka, int mesecIsteka, String ovlascenoLice) {
		super(suma, brKartice, godIsteka, mesecIsteka);
		this.ovlascenoLice = ovlascenoLice;
	}
	public String getOvlascenoLice() {
		return ovlascenoLice;
	}
	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

		private double provizija(double transakcija) {
		  double x = transakcija * 0.018;
		  if (x < 4) {
			  return 4;
		  } else {
			  return x;
		  }
	  }
		  
		@Override
		public void izvrsiTransakciju(double transakcija) {
			this.suma -= (transakcija + provizija(transakcija));
			
		}
		@Override
		public void stampaj() {
		System.out.println("Visa Card: " + this.brKartice + ", " + this.mesecIsteka + "/" + this.godIsteka
							+ ", $" + this.suma);
			
		}
}
