package p26_08_2022_Zadatak3;

public class DUOPaket extends Paket {
	
	private String uredjaj;
			
	public DUOPaket(String punoImeKorisnika, double mesecnaCena, int ugovornaObaveza, String uredjaj) {
		super("EON FULL DUO", punoImeKorisnika, mesecnaCena, ugovornaObaveza, 250, 100);
		this.uredjaj = uredjaj;
	}
	
	@Override
	public int kolikoMeseciPlacateDinar() {
		return 6;
	}
	
	public void povecajBrzinu(int uvecanje) {
		this.brzinaZaDownload += uvecanje;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("+ " + this.kolikoMeseciPlacateDinar() + " meseci po dinar.");
	}
		
}
