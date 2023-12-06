package p26_08_2022_Zadatak1;

public class Profesor extends Osoba {
	private String nazivPredmeta;
	private double iznosPlate;
	
	
	public Profesor(String imeIprezime, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(imeIprezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}
	
	public void povecajPlatu(double procenat) {
		this.iznosPlate = this.iznosPlate * (1 + procenat / 100);
	}
	@Override
	public void stampaj() {
		System.out.println("Profesor: ");
		super.stampaj();
		System.out.println("Naziv predmeta: " + this.nazivPredmeta);
		System.out.println("Iznos plate: " + this.iznosPlate);
	}
	
}
