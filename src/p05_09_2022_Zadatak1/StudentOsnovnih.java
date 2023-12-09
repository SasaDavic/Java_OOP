package p05_09_2022_Zadatak1;

public class StudentOsnovnih extends Student {
	
		public StudentOsnovnih() {
			super();
		}
		public StudentOsnovnih(String punoIme, String index, int godStudija) {
			super(punoIme, index, godStudija);
		}
		
		@Override
		public double cenaSkolarine() {
			return 90000;
		}
		@Override
		public boolean finansiranjeIzBudzeta() {
			if (this.godStudija < 5) {
				return true;
			}
			return false;
		}
}
