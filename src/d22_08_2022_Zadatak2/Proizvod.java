package d22_08_2022_Zadatak2;

public class Proizvod {
	private String sifra;
	private String naziv;
	private double cenaPoKg;
		
		public Proizvod(String sifra, String naziv, double cenaPoKg) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaPoKg = cenaPoKg;
		}
		public void setCenaPoKg(double cenaPoKg) {
			this.cenaPoKg = cenaPoKg;
		}

		public String getSifra() {
			return sifra;
		}
		public void setSifra(String sifra) {
			this.sifra = sifra;
		}
		public String getNaziv() {
			return naziv;
		}
		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}
		public double getCenaKg() {
			return this.cenaPoKg;
		}
		public double getCenaLb() {
			return this.cenaPoKg / 2.2046;
		}
		public void stampaj() {
			System.out.println(this.sifra + " - " + this.naziv);
		}
		
}
