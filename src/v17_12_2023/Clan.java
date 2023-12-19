package v17_12_2023;

import java.util.ArrayList;

public class Clan {
	
	private String imeClana;
	private String prezimeClana;
	public int brojClanskeKarte;
	public int brojIznajmljenjihKnjiga;
	private ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
	private ArrayList<String> komentar = new ArrayList<>();
	
	public Clan() {
		super();
	}

	public Clan(String imeClana, String prezimeClana, int brojClanskeKarte) {
		super();
		this.imeClana = imeClana;
		this.prezimeClana = prezimeClana;
		this.brojClanskeKarte = brojClanskeKarte;
		this.brojIznajmljenjihKnjiga = 0;
	}



	public String getImeClana() {
		return imeClana;
	}

	public void setImeClana(String imeClana) {
		this.imeClana = imeClana;
	}

	public String getPrezimeClana() {
		return prezimeClana;
	}

	public void setPrezimeClana(String prezimeClana) {
		this.prezimeClana = prezimeClana;
	}

	public int getBrojClanskeKarte() {
		return brojClanskeKarte;
	}

	public void setBrojClanskeKarte(int brojClanskeKarte) {
		this.brojClanskeKarte = brojClanskeKarte;
	}

	public int getBrojIznajmljenjihKnjiga() {
		return brojIznajmljenjihKnjiga;
	}

	public void setBrojIznajmljenjihKnjiga(int brojIznajmljenjihKnjiga) {
		this.brojIznajmljenjihKnjiga = brojIznajmljenjihKnjiga;
	}

	public ArrayList<Knjiga> getListaKnjiga() {
		return listaKnjiga;
	}

	public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
		this.listaKnjiga = listaKnjiga;
	}

	public ArrayList<String> getKomentar() {
		return komentar;
	}

	public void setKomentar(ArrayList<String> komentar) {
		this.komentar = komentar;
	}

	public void iznajmiKnjigu(Knjiga knjiga) {
		listaKnjiga.add(knjiga);
		komentar.add("Iznajmio knjigu!");
		brojIznajmljenjihKnjiga++;
	}
	
	public void vratiKnjigu(String naslov) {
		for (int i = 0; i < listaKnjiga.size(); i++) {
			if (listaKnjiga.get(i).getNaslov().equals(naslov)) {
				komentar.set(i, "Vracena.");
				brojIznajmljenjihKnjiga--;
				}
		}
	}
	
	public void vratiKnjigu(int sifra) {
		for (int i = 0; i < listaKnjiga.size(); i++) {
			if (listaKnjiga.get(i).getSifraKnjige() == sifra) {
				komentar.set(i, "Vracena.");
				brojIznajmljenjihKnjiga--;
				}
		}
	}
	
	public void stampajClana() {
		System.out.println("******************************************");
		System.out.println("Ime: " + this.imeClana);
		System.out.println("Prezime: " + this.prezimeClana);
		System.out.println("Clanska karta: " + this.brojClanskeKarte);
		System.out.println("Spisak kniga: ");
		for (int i = 0; i < listaKnjiga.size(); i++) {
			System.out.print(i + 1 + ". ");
			listaKnjiga.get(i).stampajPodatke();
			System.out.println(">>> " + komentar.get(i) + " <<<");			
		}
		System.out.println();
		System.out.println("******************************************");
	}
}
