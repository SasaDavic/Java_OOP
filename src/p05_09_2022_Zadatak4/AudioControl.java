package p05_09_2022_Zadatak4;

public class AudioControl extends Control {
	
	private boolean pojacaj;
	
	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}
	public boolean isPojacaj() {
		return pojacaj;
	}
	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		int x = video.getJacinaZvuka();
		if (this.pojacaj == true) {
			if (x < 100) {
				video.setJacinaZvuka(x + 1);
			} else {
				video.setJacinaZvuka(100);
			}
		} else {
			if (x > 0) {
				video.setJacinaZvuka(x - 1);
			} else {
				video.setJacinaZvuka(0);
			}
		}
		
	}
}
