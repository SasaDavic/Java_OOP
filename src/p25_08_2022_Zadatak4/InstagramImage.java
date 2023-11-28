package p25_08_2022_Zadatak4;

import java.util.ArrayList;

public class InstagramImage {
	private ArrayList<InstagramTag> tag = new ArrayList<InstagramTag>();
	private String dimenzijaSlike;
	private String putanjaDoSlike;
		
	public InstagramImage(String dimenzijaSlike, String putanjaDoSlike) {
		this.dimenzijaSlike = dimenzijaSlike;
		this.putanjaDoSlike = putanjaDoSlike;
	}
		
	public ArrayList<InstagramTag> getTag() {
		return tag;
	}

	public String getDimenzijaSlike() {
		return dimenzijaSlike;
	}
	public void setDimenzijaSlike(String dimenzijaSlike) {
		this.dimenzijaSlike = dimenzijaSlike;
	}
	public String getPutanjaDoSlike() {
		return putanjaDoSlike;
	}
	public void setPutanjaDoSlike(String putanjaDoSlike) {
		this.putanjaDoSlike = putanjaDoSlike;
	}

	public void dodajTag(InstagramTag tags) {
		tag.add(tags);
	}
	
	// Method that returns a string representation of the image object
    public void print() {
    	System.out.println("Image: " + this.putanjaDoSlike + " (" + this.dimenzijaSlike + ") with ");
        for (int i = 0; i < tag.size(); i++) {
            this.tag.get(i).print();
            System.out.println(", ");
            }
        }
        
 
}
