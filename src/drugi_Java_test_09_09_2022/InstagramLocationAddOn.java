package drugi_Java_test_09_09_2022;

public class InstagramLocationAddOn extends InstagramAddOn {
	private String nazivLokacije;

	public InstagramLocationAddOn(String id, int xPozicija, int yPozicija, int sirinaAddOn, int visinaAddOn,
			String nazivLokacije) {
		super(id, xPozicija, yPozicija, sirinaAddOn, visinaAddOn);
		this.nazivLokacije = nazivLokacije;
	}

	public String getNazivLokacije() {
		return nazivLokacije;
	}

	public void setNazivLokacije(String nazivLokacije) {
		this.nazivLokacije = nazivLokacije;
	}

	@Override
	public int minSirinaAddOn() {
		return 100;
	}

	@Override
	public int minVisinaAddOn() {
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + this.xPozicija + ", " + this.yPozicija + "] (" + this.visinaAddOn + ", " +
				this.sirinaAddOn + ") L " + this.nazivLokacije);
		
	}
	

}
