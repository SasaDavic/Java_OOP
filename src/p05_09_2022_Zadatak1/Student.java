package p05_09_2022_Zadatak1;

public abstract class Student {
	protected String punoIme;
	protected String brIndexa;
	protected int godStudija;
	
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	public Student() {
		super();
	}
	public Student(String punoIme, String index, int godStudija) {
		this.punoIme = punoIme;
		this.brIndexa = index;
		this.godStudija = godStudija;
	}
	
	public abstract double cenaSkolarine();
	
	public abstract boolean finansiranjeIzBudzeta();
	
	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.brIndexa + ", " + this.godStudija);
		String budzet = "";
		if (finansiranjeIzBudzeta() == true) {
			budzet = "iz budzeta";
		} else {
			budzet = "samofinansirajuci";
		}
		System.out.println("Finansiranje: " + budzet);
		System.out.println("Cena skolarine: " + cenaSkolarine());
	}
	
}
