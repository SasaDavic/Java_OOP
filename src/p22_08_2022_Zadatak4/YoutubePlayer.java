package p22_08_2022_Zadatak4;

public class YoutubePlayer {
	private Video video;
	private int kvalitet; //144, 240, 360, 480, 720, 1080
	private String rezim; // mini player , bioskopski rezim , preko celog ekrana
	private int jacinaZvuka;
	private int trenutnoVremeVidea;
	
	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitet = 144;
		this.rezim = "mini player";
	}
	
	
	public void setVideo(Video video) {
		this.video = video;
	}


	public Video getVideo() {
		return video;
	}
	public int getKvalitet() {
		return kvalitet;
	}
	public String getRezim() {
		return rezim;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	
	public void ucitajVideo() {
		this.trenutnoVremeVidea = 0;
		this.video.pogledaj();
	}
	
	public void pojacaj() {
		this.jacinaZvuka += 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}
	
	public void smanji() {
		this.jacinaZvuka -= 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}
	
	public void postaviKvalitet(int brzinaNetaMb) {
		if (brzinaNetaMb < 2) {
			this.kvalitet = 144;
		} else if (brzinaNetaMb < 4) {
			this.kvalitet = 240;
		} else if (brzinaNetaMb < 6) {
			this.kvalitet = 360;
		} else if (brzinaNetaMb < 8) {
			this.kvalitet = 720;
		} else {
			this.kvalitet = 1080;
		}
	}
	
	public void aktivirajMiniPlayerMod() {
		this.rezim = "mini player";
	}
	
	public void aktivirajBioskopskiMod() {
		this.rezim = "bioskopski rezim";
	}
	
	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "preko celog ekrana";
	}
	
	public void premotajUnapred() {
		this.trenutnoVremeVidea += 10;
		if (this.trenutnoVremeVidea > this.video.getDuzinaSec()) {
			this.trenutnoVremeVidea = this.video.getDuzinaSec();
		}
	}
	
	public void premotajUnazad() {
		this.trenutnoVremeVidea -= 10;
		if (this.trenutnoVremeVidea < 0) {
			this.trenutnoVremeVidea = 0;
		}
	}
	
	public void iscrtajZvuk() {
		int n = this.jacinaZvuka / 10;
		if (n == 0) {
			System.out.print("</");
		} else {
			System.out.print("<:");
			for (int i = 0; i < n; i++) {
				System.out.print("|");
			}
		}
		System.out.println();
	}
	
	public void iscrtajRezim() {
		if (this.rezim.equals("mini player")) {
			System.out.println("[ ]");
		} else if (this.rezim.equals("bioskopski rezim")) {
			System.out.println("[ ..]");
		} else if (this.rezim.equals("preko celog ekrana")) {
			System.out.println("[||||]");
		}
	}
	
	public void iscrtajTrenutnoVreme() {
		int minut = this.video.getDuzinaSec() / 60;
		int sekund = this.video.getDuzinaSec() % 60;
		int minutTrenutno = this.trenutnoVremeVidea / 60;
		int sekundTrenutno = this.trenutnoVremeVidea % 60;
		System.out.println(minutTrenutno + ":" + sekundTrenutno + " / " + minut + ":" + sekund);
	}
	
	public void iscrtajTimeline() {
		int zvezdice = this.trenutnoVremeVidea * 100 / this.video.getDuzinaSec();
		for (int i = 0; i < 100; i++) {
			if (i < zvezdice) {
				System.out.print("*");
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
	}
	
	public void iscitaj() {
		iscrtajTrenutnoVreme();
		System.out.print("Zvuk ");
		iscrtajZvuk();
		System.out.print("Timeline: ");
		iscrtajTimeline();
		System.out.println("Kvalitet: " + this.kvalitet);
		System.out.print("Rezim: ");
		iscrtajRezim();
		System.out.println(this.video.getNaziv());
		System.out.println("Likes: " + this.video.getBrLike() + " | Dislikes " + this.video.getBrDislike());
		System.out.println(this.video.getBrPregleda() + " pregleda");
	}
	
	public String share() {
		return "https://youtube.com/" + this.video.getId();
	}
	

}
