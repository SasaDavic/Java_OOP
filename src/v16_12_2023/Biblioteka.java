package v16_12_2023;

import java.util.ArrayList;

public class Biblioteka {

	private ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
	
	public void dodajKnjigu(Knjiga knjiga) {
		listaKnjiga.add(knjiga);
	}
	
	public void ukloniKnjigu(String naslov) {
		for (int i = 0; i < listaKnjiga.size(); i++) {
			if(listaKnjiga.get(i).getNalov().equals(naslov)) {
				listaKnjiga.remove(i);
			}
		}
	}
	public void pretraziKnjige(String autor) {
		for (int i = 0; i < listaKnjiga.size(); i++) {
			if(listaKnjiga.get(i).getAutor().equals(autor)) {
				listaKnjiga.get(i).stampaj();
			}
		}
	}
}
