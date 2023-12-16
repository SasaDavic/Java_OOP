package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {
	private String grad;
	private ArrayList<Objekat> niz = new ArrayList<>();
	
	
	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public ArrayList<Objekat> getNiz() {
		return niz;
	}

	public void setNiz(ArrayList<Objekat> niz) {
		this.niz = niz;
	}

	public PoreskaUprava(String grad) {
		super();
		this.grad = grad;
	}

	public void dodajObjekat(Objekat objekat) {
		niz.add(objekat);
	}
	
	public Objekat najveciPorez() {
		double max = 0;
		int redniBroj = 0;
		for (int i = 0; i < niz.size(); i++) {
			if(niz.get(i).porez() > max) {
				max = niz.get(i).porez();
				redniBroj = i;
			}
		}
		return niz.get(redniBroj);
	}
	
	public Objekat najmanjiPorez() {
		double min = niz.get(0).porez();
		int redniBroj = 0;
		for (int i = 0; i < niz.size(); i++) {
			if(niz.get(i).porez() < min) {
				min = niz.get(i).porez();
				redniBroj = i;
			}
		}
		return niz.get(redniBroj);
	}
	
		public double porezZaCeoGrad() {
			System.out.println("Porez za grad " + this.grad + "!");
			double suma = 0;
			for (int i = 0; i < niz.size(); i++) {
				suma += niz.get(i).porez();
			}
			return suma;
		}
		public void stampaj() {
			for (int i = 0; i < niz.size(); i++) {
				System.out.println(i + 1 + ". ");
				niz.get(i).stampaj();
				System.out.println("---------------------------------");
			}
			System.out.println("Porez za ceo grad " + porezZaCeoGrad());
			
			System.out.println("Najmanji porez " + najmanjiPorez().porez());
			
			System.out.println("Najveci porez " + najveciPorez().porez());
		}

}
