package p05_09_2022_Zadatak3;

public class Pravougaonik extends Figura {
	private int a;
	private int b;
	
	
	public Pravougaonik(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return a * b;
	}
	@Override
	public double obim() {
		// TODO Auto-generated method stub
		return 2 * (a + b);
	}
	

}
