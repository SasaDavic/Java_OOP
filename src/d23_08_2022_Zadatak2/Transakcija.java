package d23_08_2022_Zadatak2;

public class Transakcija {
	private String id;
	private Racun odlivSredstava;
	private Racun prilivSredstava;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Racun getOdlivSredstava() {
		return odlivSredstava;
	}
	public void setOdlivSredstava(Racun odlivSredstava) {
		this.odlivSredstava = odlivSredstava;
	}
	public Racun getPrilivSredstava() {
		return prilivSredstava;
	}
	public void setPrilivSredstava(Racun prilivSredstava) {
		this.prilivSredstava = prilivSredstava;
	}
	public Transakcija(String id, Racun odlivSredstava, Racun prilivSredstava) {
		this.id = id;
		this.odlivSredstava = odlivSredstava;
		this.prilivSredstava = prilivSredstava;
	}
	public Transakcija() {
	
	}
	
	private double provizija(double prenos) {
		if (prenos < 4500) {
			return 45;
		} else {
			return prenos * 0.01;
		}
	}

	public void prenosSred(double prenos) {
		double x = -1 * ( prenos + provizija(prenos) );
		if(this.odlivSredstava.promenaStanja(x) == true) {
			this.odlivSredstava.promenaStanja(x);
		}	
	}
	
	public void stampaj( ) {
		System.out.println("id transakcije: " + this.id);
		System.out.print("Racun sa: ");
		this.odlivSredstava.stampaj();
		System.out.print("Racun na: ");
		this.prilivSredstava.stampaj();
	}

}
