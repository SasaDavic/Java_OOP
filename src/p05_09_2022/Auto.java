package p05_09_2022;

public class Auto extends Vozilo {
private int brojVrata;
	
	@Override
	public void stampaj() {		
		System.out.println("Reg:" + this.registracija);
		System.out.println("Marka:" + this.marka);
		System.out.println("Brzina:" + this.brzina);
		System.out.println("Kubikaza:" + this.kubikaza);
		System.out.println("Max brzina:" + this.maxBrzina);
		System.out.println("Broj vrata: " + this.brojVrata);
	}
}
