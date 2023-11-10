package d16_08_2022_Zadatak2;

public class SmartAirConditioning {
	public String marka;
	public int temperatura;
	public String mod; //hladi/greje
	
	public void stampaj() {
		System.out.println("Klima uredjaj marke " + this.marka + " podesen je da " + this.mod);
		System.out.println("Temperatura je podesena na " + this.temperatura + " stepeni");
	}
	public boolean jeVecaTemperaturaNapolju(int spoljnaTemperatura) {
		return (spoljnaTemperatura > this.temperatura) ? true : false;
	}
	
}
