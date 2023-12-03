package d25_08_2022_Zadatak2;

import java.util.ArrayList;

public class Kombinacija {
	private String id;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
	
	
		public Kombinacija(String id, int br1, int br2, int br3, int br4,int br5, int br6, int br7) {
		this.id = id;
		this.nizBrojeva.add(br1);
		this.nizBrojeva.add(br2);
		this.nizBrojeva.add(br3);
		this.nizBrojeva.add(br4);
		this.nizBrojeva.add(br5);
		this.nizBrojeva.add(br6);
		this.nizBrojeva.add(br7);
	}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public ArrayList<Integer> getNizBrojeva() {
			return nizBrojeva;
		}

		public boolean daLiJeIstaKombinacija(ArrayList<Integer> k) {
			int brojac = 0;
			for (int i = 0; i < this.nizBrojeva.size(); i++) {
				for (int j = 0; j < k.size(); j++) {
					if(nizBrojeva.get(i).equals(k.get(j))) {
						brojac++;
					}
					
				}
			}
			if (brojac / 2 == 7) {
				return true;
			} else {
				return false;
			}
		}

		public void stampaj() {
			System.out.println("ID: " + this.id);
			System.out.print("Brojevi: ");
			for (int i = 0; i < nizBrojeva.size(); i++) {
				System.out.print(nizBrojeva.get(i) + ", ");
			}
			System.out.println();
		}
		
}
