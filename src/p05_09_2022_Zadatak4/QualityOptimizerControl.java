package p05_09_2022_Zadatak4;

public class QualityOptimizerControl extends Control {
	
	private double brzinaInterneta;
		
	public QualityOptimizerControl(double brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}
	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}
	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		double x = this.brzinaInterneta * 10.1;
		if (x <= 144) {
			video.setKvalitet(144);
		} else if (x <= 240) {
			video.setKvalitet(240);
		} else if (x <= 360) {
			video.setKvalitet(360);
		} else if (x <= 720) {
			video.setKvalitet(720);
		} else {
			video.setKvalitet(1080);
		}
		
	} 
}
