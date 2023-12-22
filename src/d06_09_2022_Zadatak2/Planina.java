package d06_09_2022_Zadatak2;

public class Planina {
	private String imePlanine;
	private String nazivDrzaveUKojojSePlaninaNalazi;
	private double visinaPlanine;
	public String getImePlanine() {
		return imePlanine;
	}
	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}
	public String getNazivDrzaveUKojojSePlaninaNalazi() {
		return nazivDrzaveUKojojSePlaninaNalazi;
	}
	public void setNazivDrzaveUKojojSePlaninaNalazi(String nazivDrzaveUKojojSePlaninaNalazi) {
		this.nazivDrzaveUKojojSePlaninaNalazi = nazivDrzaveUKojojSePlaninaNalazi;
	}
	public double getVisinaPlanine() {
		return visinaPlanine;
	}
	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}
	public Planina() {
		super();
	}
	public Planina(String imePlanine, String nazivDrzaveUKojojSePlaninaNalazi, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.nazivDrzaveUKojojSePlaninaNalazi = nazivDrzaveUKojojSePlaninaNalazi;
		this.visinaPlanine = visinaPlanine;
	}
	
	

}
