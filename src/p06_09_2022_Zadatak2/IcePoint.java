package p06_09_2022_Zadatak2;

public class IcePoint extends Proizvod{
	private String tipSladoleda;
	private boolean velikiIcePOint;
	
	public String getTipSladoleda() {
		return tipSladoleda;
	}
	public void setTipSladoleda(String tipSladoleda) {
		this.tipSladoleda = tipSladoleda;
	}
	public boolean isVelikiIcePOint() {
		return velikiIcePOint;
	}
	public void setVelikiIcePOint(boolean velikiIcePOint) {
		this.velikiIcePOint = velikiIcePOint;
	}
		public IcePoint(String tipSladoleda, boolean velikiIcePOint) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.velikiIcePOint = velikiIcePOint;
	}
		@Override
		public double ukupnaCena() {
			int x = 0;
			if (this.velikiIcePOint == true) {
				x = 130;
			} else {
				x = 100;
			}
			return x + cenaDodataka();
		}
		@Override
		public void stampaj() {
			if(this.velikiIcePOint == true) {
				System.out.println("Veliki IcePoint");
			} else {
				System.out.println("Mali IcePoint");
			}
			System.out.println("Tip sladoleda: " + this.tipSladoleda);
			System.out.println("Dodaci: ");
			for (int i = 0; i < dodaci.size(); i++) {
				System.out.print(i + 1 + ". ");
				dodaci.get(i).stampaj();
			}
		}
}
