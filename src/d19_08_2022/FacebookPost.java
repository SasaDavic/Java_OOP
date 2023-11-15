package d19_08_2022;

public class FacebookPost {
	private String namePosted;
	private String nameProfil;
	private String text;
	private int likes;
	private int share;
		 
	public FacebookPost() {
	}
		
	public FacebookPost(String namePosted, String nameProfil, String text) {
		this.namePosted = namePosted;
		this.nameProfil = nameProfil;
		this.text = text;
	}

	public void like() {
		this.likes++;
	}
	
	public void dislike() {
		this.likes--;
		if (this.likes < 0) {
			this.likes = 0;
		}
	}
	
	public void share() {
		this.share++;
	}

	public void print() {
		System.out.println(this.namePosted + " >>> " + this.nameProfil);
		System.out.println(this.text);
		System.out.println("Likes " + this.likes + " | Shares " + this.share);
	}

}
