package p25_08_2022_Zadatak3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HistoryPage {
	private String nazivStranice;
	private String link;
	private LocalTime vreme = LocalTime.now (); // inicijalizujte atribut vreme sa trenutnim vremenom
	private String username;
	private String password;
	
	public HistoryPage() {
		this.username = "sasa@sifra";
		this.password = "sifra123";
	}
	public HistoryPage(String nazivStranice, String link, String username, String password) {
		this.nazivStranice = nazivStranice;
		this.link = link;
		this.username = username;
		this.password = password;
		this.vreme = vreme.truncatedTo (ChronoUnit.MINUTES); // ovo je ispravno mesto za odbacivanje sekundi i milisekundi iz vremena
		}

	public String getNazivStranice() {
		return nazivStranice;
	}

	public void setNazivStranice(String nazivStranice) {
		this.nazivStranice = nazivStranice;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void sacuvajKredencijale(String user, String pass) {
		this.password = pass;
		this.username = user;
	}

	public void obrisiKolacice() {
		this.username = null;
		this.password = null;
	}
	
	public void stampaj() {
		System.out.print(this.vreme + " - " + this.nazivStranice +
				"..." + this.link);
		if(this.username != null && this.password != null) {
			System.out.println("*");
		}
	}
	}


