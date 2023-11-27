package p25_08_2022_Zadatak3;

public class HistoryPage {
	
	private String pageName;
	private String link;
	private int min;
	private int hour;
	private String user;
	private String pass;
	
	public HistoryPage() {
		this.pageName = "";
		this.link = "";
		this.min = 0;
		this.hour = 0;
		this.user = null;
		this.pass = null;
		}

	public HistoryPage(String pageName, String link, int min, int hour) {
		this.pageName = pageName;
		this.link = link;
		this.min = min;
		this.hour = hour;
		this.user = null;
		this.pass = null;
		}

	public String getPageName() {
		return pageName;
		}

	public void setPageName(String pageName) {
		this.pageName = pageName;
		}

	public String getLink() {
		return link;
		}

	public void setLink(String link) {
		this.link = link;
		}

	public int getMin() {
		return min;
		}

	public void setMin(int min) {
		this.min = min;
		}

	public int getHour() {
		return hour;
		}

	public void setHour(int hour) {
		this.hour = hour;
		}

	public String getUser() {
		return user;
		}

	public String getPass() {
		return pass;
		}
	
	public void saveCredentials(String user, String pass) {
		this.pass = pass;
		this.user = user;
		}
	public void deleteCookies() {
	    this.user = null;
	    this.pass = null;
		}
	public void print() {
		System.out.print(this.hour + " - " + this.min + " - " + this.pageName + "..." + this.link);
		if (this.pass != null && this.user != null) {
			System.out.print(" *");
		}
		System.out.println();
	}

}
