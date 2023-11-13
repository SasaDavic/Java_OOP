package d18_08_2022_Zadatak2;

public class FacebookPost {
	  public String namePosted;
	  public String nameProfil;
	  public String text;
	  public int likes;
	  public int share;
	  
	  public void like() {
		  this.likes++;
	  }
	  
	  public void dislike() {
		  this.likes--;
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
