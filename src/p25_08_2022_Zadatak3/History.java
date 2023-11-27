package p25_08_2022_Zadatak3;

import java.util.ArrayList;

public class History {
	
	private ArrayList<HistoryPage> historypage = new ArrayList<HistoryPage>();
	
	public History() {
	}

	public void openPage(String pageName, String link, int min, int hour) {
		HistoryPage page = new HistoryPage(pageName, link, min, hour);
		historypage.add(page);
	}
	public void deletePage(String link) {
		for (int i = 0; i < historypage.size(); i++) {
			if(historypage.get(i).getLink().equals(link)) {
				historypage.remove(i);
			}
		}
	}
	public void deleteCookies(String link) {
		for (int i = 0; i < historypage.size(); i++) {
			if(historypage.get(i).getLink().equals(link)) {
				historypage.get(i).deleteCookies();
			}
		}
	}
	public void deleteHistory() {
		historypage.clear();
	}
	public void saveCredentials(String nazivStranice, String user, String pass) {
		for (int i = 0; i < historypage.size(); i++) {
			if(historypage.get(i).getPageName().equals(nazivStranice)) {
				historypage.get(i).saveCredentials(user, pass);
			}
		}
	}
	public void viewHistory() {
		for (int i = 0; i < historypage.size(); i++) {
			historypage.get(i).print();
		}
	}
	public void deleteAllCookies() {
		for (int i = 0; i < historypage.size(); i++) {
				historypage.get(i).deleteCookies();			
		}
	}
	 public void deleteCookiesByHour(int currentHour, int currentMinute) {
		    for (int i = 0; i < historypage.size(); i++) {
		      int x = historypage.get(i).getHour() * 60 + historypage.get(i).getMin();
		      int y = currentHour * 60 + currentMinute;
		      if (y - x <= 60) {
		    	  historypage.get(i).deleteCookies();
		      }
		    }
	 }

}
