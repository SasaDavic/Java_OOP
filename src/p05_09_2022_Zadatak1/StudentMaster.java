package p05_09_2022_Zadatak1;

public class StudentMaster extends Student {
		
	
	public StudentMaster() {
		super();
	}
	public StudentMaster(String punoIme, String index, int godStudija) {
		super(punoIme, index, godStudija);
	}
			@Override
			public double cenaSkolarine() {
				return 100000;
			}
			@Override
			public boolean finansiranjeIzBudzeta() {
				if (this.getGodStudija() < 2) {
					return true;
				} else {
					return false;
				}
			}
}
