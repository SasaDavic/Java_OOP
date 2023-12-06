package p26_08_2022_Zadatak1;

public class Student extends Osoba {
	
	private int brIndexa;
	private double dugSkolarina;
	
	
	public Student(String imeIprezime, String jmbg, int brIndexa, double dugSkolarina) {
		super(imeIprezime, jmbg);
		this.brIndexa = brIndexa;
		this.dugSkolarina = dugSkolarina;
	}
	
	public void uplatiSkolarinu(int uplata) {
		this.dugSkolarina -= uplata;
	}
	@Override
	public void stampaj() {
		System.out.println("Student: ");
		super.stampaj();
		System.out.println("Broj indexa: " + this.brIndexa);
		System.out.println("Dug za skolarinu: " + this.dugSkolarina);
		
	}



}
