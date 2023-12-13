package p05_09_2022_Zadatak4;

public class VideoPlayer {

	private int duzina;
	private int trenutnoVreme;
	private int jacinaZvuka;
	private int kvalitet; //(144, 240, 360, 480, 720, 1080)
	
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitet() {
		return kvalitet;
	}
	public void setKvalitet(int kvalitet) {
		this.kvalitet = kvalitet;
	}
	public VideoPlayer(int duzina, int trenutnoVreme, int jacinaZvuka, int kvalitet) {
		super();
		this.duzina = duzina;
		this.trenutnoVreme = trenutnoVreme;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitet = kvalitet;
	}
	public VideoPlayer() {
		super();
	}

	public void stampaj() {
		System.out.println(this.trenutnoVreme + " sec");
		System.out.println("Jacina zvuka " + this.jacinaZvuka);
		System.out.println("Kvalitet " + this.kvalitet);
	}
}
