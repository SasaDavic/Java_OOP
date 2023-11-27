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
		for (int i = 0; i < historypage.size(); i++) {
				historypage.remove(i);
		}
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
		      if (historypage.get(i).getHour() == currentHour) {
		    	  historypage.get(i).deleteCookies();
		        }
		      if (historypage.get(i).getHour() + 1 == currentHour && historypage.get(i).getMin() > currentMinute) {
		    	  historypage.get(i).deleteCookies();
		      }
		    }
	 }
/*

metoda pogledajIstoriju - stampa sve posecene stranice
metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)
 */
}
