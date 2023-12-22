package d06_09_2022_Zadatak2;

public class RekreativniPlaninar extends Planinar{

	private int tezinaOpremeKg;
	private String okrugPlaninara;
	private int maxUsponBezOpreme;
	public RekreativniPlaninar(int identifikacioniBroj, String imeIPrezime, int tezinaOpremeKg, String okrugPlaninara,
			int maxUsponBezOpreme) {
		super(identifikacioniBroj, imeIPrezime);
		this.tezinaOpremeKg = tezinaOpremeKg;
		this.okrugPlaninara = okrugPlaninara;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}
	public int getTezinaOpremeKg() {
		return tezinaOpremeKg;
	}
	public String getOkrugPlaninara() {
		return okrugPlaninara;
	}
	public int getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + this.getIdentifikacioniBroj() + 
				" ime: " + this.getImeIPrezime() + " Okrug: " + this.okrugPlaninara);
		
	}
	@Override
	public double clanarina() {
		return 1000;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
		double x = planina.getVisinaPlanine();
		int y = this.tezinaOpremeKg * 50;
		double z = x + y;
		if(this.maxUsponBezOpreme < z) {
			return false;
		} else {
			return true;
		}
	}
	

}
