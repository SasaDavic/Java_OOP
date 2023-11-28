package p25_08_2022_Zadatak4;

import java.util.ArrayList;

public class InstagramPost {
	
	private ArrayList<InstagramImage> image = new ArrayList<InstagramImage>();
	private String opisPosta;
	private InstagramUser user;
	
	
	public InstagramPost(String opisPosta, InstagramUser user) {
		this.opisPosta = opisPosta;
		this.user = user;
	}

	public String getOpisPosta() {
		return opisPosta;
	}

	public void setOpisPosta(String opisPosta) {
		this.opisPosta = opisPosta;
	}

	public InstagramUser getUser() {
		return user;
	}

	public void setUser(InstagramUser user) {
		this.user = user;
	}

	public ArrayList<InstagramImage> getImage() {
		return image;
	}

	public void dodajSliku(InstagramImage slika) {
		image.add(slika);
	}
	// Method that returns a string representation of the post object
    public void print() {
    	this.user.print();
    	System.out.println("Post: " + this.opisPosta);
        for (int i = 0; i < image.size(); i++) {
            image.get(i).print();
        }
     
}}
