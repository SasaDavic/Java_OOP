package drugi_Java_test_09_09_2022;

public abstract class InstagramAddOn {
	protected String id;
	protected int xPozicija;
	protected int yPozicija;
	protected int sirinaAddOn;
	protected int visinaAddOn;
	
	public String getId() {
		return id;
	}
	public int getxPozicija() {
		return xPozicija;
	}
	public int getyPozicija() {
		return yPozicija;
	}
	public int getSirinaAddOn() {
		return sirinaAddOn;
	}
	public int getVisinaAddOn() {
		return visinaAddOn;
	}
	public InstagramAddOn(String id, int xPozicija, int yPozicija, int sirinaAddOn, int visinaAddOn) {
		super();
		this.id = id;
		this.xPozicija = xPozicija;
		this.yPozicija = yPozicija;
		this.sirinaAddOn = sirinaAddOn;
		this.visinaAddOn = visinaAddOn;
	}
	
	public abstract int minSirinaAddOn();
	
	public abstract int minVisinaAddOn();
	
	public void povecajDimenzijeAddOn(int povecajVisinuZa, int povecajSirinuZa) {
		this.sirinaAddOn += povecajSirinuZa;
		this.visinaAddOn += povecajVisinuZa;
	}
	public void smanjiDimenzijuAddOn(int smanjiVisinuZa, int smanjiSirinuZa) {
		this.sirinaAddOn -= smanjiSirinuZa;
		this.visinaAddOn -= smanjiVisinuZa;
		if (this.sirinaAddOn < minSirinaAddOn()){
			this.sirinaAddOn = minSirinaAddOn();
			}
		if (this.visinaAddOn < minVisinaAddOn()) {
			this.visinaAddOn = minVisinaAddOn();
			}
		}
	public abstract void stampaj();

}
