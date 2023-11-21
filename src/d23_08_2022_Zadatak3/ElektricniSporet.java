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
			if (pozicija == 1) {
				this.goreDesno.iskljuciRinglu();
				this.doleDesno.iskljuciRinglu();
				this.doleLevo.iskljuciRinglu();
			} else if (pozicija == 2) {
				this.goreLevo.iskljuciRinglu();
				this.doleDesno.iskljuciRinglu();
				this.doleLevo.iskljuciRinglu();
			} else if (pozicija == 2) {
				this.goreDesno.iskljuciRinglu();
				this.doleDesno.iskljuciRinglu();
				this.goreLevo.iskljuciRinglu();
			} else if (pozicija == 2) {
				this.goreDesno.iskljuciRinglu();
				this.goreLevo.iskljuciRinglu();
				this.doleLevo.iskljuciRinglu();
			}
		}
	}
	
/*

metodu pojacaj kojoj se prosledjuje pozicija ringle
pozicija 1 je ringla gore levo
pozicija 2 je ringla gore desno
pozicija 3 je ringla dole levo
pozicija 4 je ringla dole desno
Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 
Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
pozicija 1 je ringla gore levo
pozicija 2 je ringla gore desno
pozicija 3 je ringla dole levo
pozicija 4 je ringla dole desno
metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
metodu koja stampa podatke u formatu:
marka - garancija u godinama
Ringle:
Gore levo:
Ringla je ukljucena/iskljucena
Tip ringle: tip ringle
Jacina: jacina
Grejac: jacina grejaca kW
Gore desno:
Ringla je ukljucena/iskljucena
Tip ringle: tip ringle
Jacina: jacina
Grejac: jacina grejaca kW
Dole levo:
Ringla je ukljucena/iskljucena
Tip ringle: tip ringle
Jacina: jacina
Grejac: jacina grejaca kW
Dole desno:
Ringla je ukljucena/iskljucena
Tip ringle: tip ringle
Jacina: jacina
Grejac: jacina grejaca kW


 */
}
