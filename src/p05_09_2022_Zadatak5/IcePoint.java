package p05_09_2022_Zadatak5;

public class IcePoint extends Proizvod {
	private String tipSladoleda;
	private boolean velikiIcePoint;
	
	public String getTipSladoleda() {
		return tipSladoleda;
	}
	public void setTipSladoleda(String tipSladoleda) {
		this.tipSladoleda = tipSladoleda;
	}
	public boolean isVelikiIcePoint() {
		return velikiIcePoint;
	}
	public void setVelikiIcePoint(boolean velikiIcePoint) {
		this.velikiIcePoint = velikiIcePoint;
	}
		public IcePoint(String tipSladoleda, boolean velikiIcePoint) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.velikiIcePoint = velikiIcePoint;
	}
		
		@Override
		public void racun() {
			double y = 0;
		if (this.velikiIcePoint == true) {
			y = cenaSvihDodataka() + 130;
		} else {
			y = cenaSvihDodataka() + 100;
		}
			System.out.println("Cena Ice Point sladoleda je: " + y);
		}
		@Override
		public void stampaj() {
		System.out.println("Ice Point: ");
		System.out.println("Tip: " + this.tipSladoleda);
		System.out.println("Veliki Ice Point " + this.isVelikiIcePoint());
		System.out.println("Dodaci: ");
		for (int i = 0; i < nizDodataka.size(); i++) {
			System.out.print(i + 1 + ". ");
			nizDodataka.get(i).stampaj();
		}
		racun();	
		}
}