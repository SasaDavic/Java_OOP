package d22_08_2022_Zadatak2;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	public Vaga() {
	}
	public String getMernaJedinica() {
		return mernaJedinica;
	}
	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public double sracunajCenu(double tezinaProizvoda) {
		if (this.mernaJedinica.equals("lb")) {
			return tezinaProizvoda * proizvod.getCenaLb();
		} else if (this.mernaJedinica.equals("kg")) {
			return tezinaProizvoda * proizvod.getCenaKg();
		} else {
			return 0;
		}
	}
	public void stampaj(double tezinaProizvoda) {
		System.out.println(this.proizvod.getSifra() + " - " + this.proizvod.getNaziv());
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(tezinaProizvoda + "kg x " + this.proizvod.getCenaKg());
		}
		if (this.mernaJedinica.equals("lb")) {
			System.out.println(tezinaProizvoda + "lb x " + this.proizvod.getCenaLb());
		}
		System.out.println("Ukupno: " + sracunajCenu(tezinaProizvoda));
	}

}
