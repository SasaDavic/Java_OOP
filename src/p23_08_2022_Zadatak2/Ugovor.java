package p23_08_2022_Zadatak2;

public class Ugovor {
	
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private double cenaNekretnine;
	private String adresa;
	
	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}

	public double getCenaNekretnine() {
		return cenaNekretnine;
	}

	public void setCenaNekretnine(double cenaNekretnine) {
		this.cenaNekretnine = cenaNekretnine;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, double cenaNekretnine, String adresa) {
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cenaNekretnine = cenaNekretnine;
		this.adresa = adresa;
	}

	public double procenatZarade() {
		if (kupac.isVecKupovao() == true) {
			return 0.03;
		} else {
			return 0.02;
		}
	}
	
	public double zaradaAgencije() {
		return 1000 + this.cenaNekretnine * procenatZarade();
	}
	
	public void stampajUgovor() {
		System.out.println("Dana " + this.datum + "god. sklopljen je ugovor izmedju ");
		prodavac.stampaj(); System.out.print(" i "); kupac.stampaj();
		System.out.println(" o kupovini nekretnine " + this.adresa + " po ceni od " + this.cenaNekretnine);
		System.out.println(" pri cemu je kupac u obavezi da agenciji isplati novcanu "
				+ "vrednost u iznosu od " + zaradaAgencije()); 
		
	}
	
	


}
