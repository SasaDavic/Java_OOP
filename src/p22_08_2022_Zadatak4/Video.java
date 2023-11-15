package p22_08_2022_Zadatak4;

public class Video {
	private String id;
	private String naziv;
	private int duzinaSec;
	private int brLike;
	private int brDislike;
	private int brPregleda;
		
	public Video(String id, String naziv, int duzinaSec) {
		this.id = id;
		this.naziv = naziv;
		this.duzinaSec = duzinaSec;
	}
	
	public String getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getDuzinaSec() {
		return duzinaSec;
	}

	public int getBrLike() {
		return brLike;
	}

	public int getBrDislike() {
		return brDislike;
	}

	public int getBrPregleda() {
		return brPregleda;
	}

	public void lajkuj() {
		this.brLike++;
	}
	public void dislajkuj() {
		this.brDislike++;
	}
	public void pogledaj() {
		this.brPregleda++;
	}
	
}
