package p26_08_2022_Zadatak3;

public class EONPaket extends Paket {

	public EONPaket(String punoImeKorisnika, double mesecnaCena, int ugovornaObaveza) {
		super("EON LIGHT DUO", punoImeKorisnika, mesecnaCena, ugovornaObaveza, 150, 75);
	}
	
	@Override
	public int kolikoMeseciPlacateDinar() {
		return 3;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("+ " + this.kolikoMeseciPlacateDinar() + " meseca po dinar.");
	}
		
}
