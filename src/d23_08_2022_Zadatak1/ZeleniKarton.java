package d23_08_2022_Zadatak1;

public class ZeleniKarton {
	private String punoImeStudenta;
	private int brIndexa;
	private String nazivPredmeta;
	private String punoImeProfesora;
	private int ocena;
	
	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}
	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getPunoImeProfesora() {
		return punoImeProfesora;
	}
	public void setPunoImeProfesora(String punoImeProfesora) {
		this.punoImeProfesora = punoImeProfesora;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ZeleniKarton(String punoImeStudenta, int brIndexa, String nazivPredmeta, String punoImeProfesora,
			int ocena) {
		this.punoImeStudenta = punoImeStudenta;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.punoImeProfesora = punoImeProfesora;
		this.ocena = ocena;
	}

	public boolean jePolozio() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndexa);
		System.out.println("Profesor: " + this.punoImeProfesora);
		System.out.println("------------------------------------------");
	}
	
	
	

}
