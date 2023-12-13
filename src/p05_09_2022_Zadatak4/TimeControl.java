package p05_09_2022_Zadatak4;

public class TimeControl extends Control {
	
	private boolean premotajUnapred;
	
	public TimeControl(boolean premotajUnapred) {
		super();
		this.premotajUnapred = premotajUnapred;
	}
	

	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		int x = video.getTrenutnoVreme();
		int y = video.getDuzina();
		if (this.premotajUnapred == true) {
			if (x + 15 <= y) {
				video.setTrenutnoVreme(x + 15);
			} else {
				video.setTrenutnoVreme(y);
			}
		} else {
			if (x - 15 < 0) {
				video.setTrenutnoVreme(0);
			} else {
				video.setTrenutnoVreme(x - 15);
			}
		}
		
	}
	
}
