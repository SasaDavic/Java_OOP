package v17_12_2023;

import java.util.ArrayList;

public class Clan {
	
	private String imeClana;
	private String prezimeClana;
	public int brojIznajmljenihKnjiga;
	private ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
	private ArrayList<String> komentar = new ArrayList<>();
	
	public Clan() {
		super();
	}

	public Clan(String imeClana, String prezimeClana) {
		super();
		this.imeClana = imeClana;
		this.prezimeClana = prezimeClana;
		this.brojIznajmljenihKnjiga = 0;
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
		brojIznajmljenihKnjiga++;
	}
	
	public void vratiKnjigu(String naslov) {
		for (int i = 0; i < listaKnjiga.size(); i++) {
			if (listaKnjiga.get(i).getNaslov().equals(naslov)) {
				komentar.set(i, "Vracena.");
				}
		}
	}
	
	public void stampajClana() {
		System.out.println("Ime: " + this.imeClana);
		System.out.println("Prezime: " + this.prezimeClana);
		System.out.println("Spisak kniga: ");
		for (int i = 0; i < listaKnjiga.size(); i++) {
			System.out.print(i + 1 + ". ");
			listaKnjiga.get(i).stampajPodatke();
			System.out.print(">>> " + komentar.get(i) + " <<<");
			
		}
	}
}
