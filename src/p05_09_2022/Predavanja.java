package p05_09_2022;

public class Predavanja {

	public static void main(String[] args) {
		Kamion kamion = new Kamion(
				"23902", "BMW", 100, 10000, 120, 19999);
		kamion.stampaj();
		kamion.dodajGas();
//		kamion.sta
		
//		kamion.setBrzina(100);
//		kamion.setKubikaza(1000);
//		kamion.setMarka("BMW");
//		kamion.setRegistracija("NI-329-32");
//		kamion.setMaxBrzina(140);
//		
//		kamion.stampaj();
//		kamion.stamapajKamion();
//		
		Auto auto = new Auto();
		auto.setBrzina(130);
		auto.setKubikaza(1000);
		auto.setMarka("BMW");
		auto.setRegistracija("NI-555-32");
		auto.setMaxBrzina(220);
		auto.stampaj();
		
		
//		Vozilo v = new Vozilo();
	
		
		
//		
//		System.out.println("Kraj");

	}

}
