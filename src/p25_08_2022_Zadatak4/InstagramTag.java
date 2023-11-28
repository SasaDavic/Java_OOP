package p25_08_2022_Zadatak4;

public class InstagramTag {
	private int xKoordinata;
	private int yKoordinata;
	private InstagramUser tagovan;
	
	
	public InstagramTag(int xKoordinata, int yKoordinata, InstagramUser tagovan) {
		this.xKoordinata = xKoordinata;
		this.yKoordinata = yKoordinata;
		this.tagovan = tagovan;
	}

	public int getxKoordinata() {
		return xKoordinata;
	}

	public void setxKoordinata(int xKoordinata) {
		this.xKoordinata = xKoordinata;
	}

	public int getyKoordinata() {
		return yKoordinata;
	}

	public void setyKoordinata(int yKoordinata) {
		this.yKoordinata = yKoordinata;
	}

	public InstagramUser getTagovan() {
		return tagovan;
	}

	public void setTagovan(InstagramUser tagovan) {
		this.tagovan = tagovan;
	}
	 // Method that returns a representation of the tag object
    public void print() {
    	System.out.print("Tag: ");
    	this.tagovan.print();
    	System.out.println(" at (" + xKoordinata + ", " + yKoordinata + ")");
        }
	
}
