package p25_08_2022_Zadatak5;

import java.util.ArrayList;

public class TableRow {

		
		private ArrayList<String> cellRow = new ArrayList<String>();
		
		public TableRow() {
		}

		public void addRowCell(String cell) {
			cellRow.add(cell);
		}
		public void print() {
			for (int i = 0; i < cellRow.size(); i++) {
				System.out.print(cellRow.get(i) + "\t\t|\t\t");
			}
			System.out.println();
		}
		
		public void printHTML() {
			System.out.print("<tr>");
			for (int i = 0; i < cellRow.size(); i++) {
				System.out.print("<td>" + cellRow.get(i) + "</td>");
			}
			System.out.println("</tr>");
		}
		public boolean isEqual(String text) {
			for (int i = 0; i < cellRow.size(); i++) {
				if(this.cellRow.get(i).equals(text)) {
					return true;
				}
			}
			return false;
		}
}
