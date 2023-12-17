package p06_09_2022_Zadatak4;

public class Trkac extends Atleticar {

	public Trkac(String punoIme, double rezultat) {
		super(punoIme, rezultat);
	}

	@Override
	public boolean boljiRezultatOd(Atleticar atleticar) {
		if(this.rezultat <= atleticar.getRezultat()) {
			return true;
		} else {
			return false;
		}
	}

}
