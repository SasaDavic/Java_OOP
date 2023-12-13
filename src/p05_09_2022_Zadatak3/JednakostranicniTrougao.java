package p05_09_2022_Zadatak3;

public class JednakostranicniTrougao extends Figura {
	
	private int a;
	
	public JednakostranicniTrougao(int a) {
		super();
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	@Override
	public double povrsina() {
	double koren3 = Math.sqrt(3);
		return a * a * koren3 / 4;
	}
	@Override
	public double obim() {
		return 3 * a;
	}
}
