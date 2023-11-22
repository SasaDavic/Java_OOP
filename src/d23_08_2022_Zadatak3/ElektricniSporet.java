package d23_08_2022_Zadatak3;

public class ElektricniSporet {
	
	private String marka;
	private int brGodina;
	private int maxUkljucenihRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;
	
	public ElektricniSporet(String marka, int brGodina, int maxUkljucenihRingli, Ringla goreLevo, Ringla goreDesno,
			Ringla doleLevo, Ringla doleDesno) {
		this.marka = marka;
		this.brGodina = brGodina;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}
	public String getMarka() {
		return marka;
	}
	public int getBrGodina() {
		return brGodina;
	}
	public int getMaxUkljucenihRingli() {
		return maxUkljucenihRingli;
	}
	public Ringla getGoreLevo() {
		return goreLevo;
	}
	public Ringla getGoreDrsno() {
		return goreDesno;
	}
	public Ringla getDoleLevo() {
		return doleLevo;
	}
	public Ringla getDoleDesno() {
		return doleDesno;
	}
	public void pojacaj(int pozicija) {
		if(pozicija == 1) {
			this.goreLevo.pojacajRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.pojacajRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.pojacajRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.pojacajRinglu();
		}
		int brojac = 0;
		if (this.doleDesno.ukljucenaRingla() == true) {
			brojac++;
		}
		if (this.doleLevo.ukljucenaRingla() == true) {
			brojac++;
		}
		if (this.goreDesno.ukljucenaRingla() == true) {
			brojac++;
		}
		if (this.goreLevo.ukljucenaRingla() == true) {
			brojac++;
		}
		if (brojac > this.maxUkljucenihRingli) {
			for (int i = 1; i < 5; i++) {
				if (i != pozicija) {
					iskljuciRinglu(i);
				}
			}
		}
	}
	
	public void iskljuciRinglu(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.iskljuciRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.iskljuciRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.iskljuciRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.iskljuciRinglu();
		}
	}
	
	public double ukupnaPotrosnja(double brSatiUkljucen) {
		double a = this.doleDesno.potrosnjaEE(brSatiUkljucen);
		double b = this.doleLevo.potrosnjaEE(brSatiUkljucen);
		double c = this.goreDesno.potrosnjaEE(brSatiUkljucen);
		double d = this.goreLevo.potrosnjaEE(brSatiUkljucen);
		return a + b + c + d;
	}
	public void stampaj() {
		System.out.println(this.marka + " - " + this.brGodina + "god.");
		System.out.println("Ringle: ");
		System.out.println("Gore Levo: ");
		this.goreLevo.stampaj();
		System.out.println("Gore desno: ");
		this.goreDesno.stampaj();
		System.out.println("Dole levo: ");
		this.doleLevo.stampaj();
		System.out.println("Dole desno: ");
		this.doleDesno.stampaj();
		
	}

}
