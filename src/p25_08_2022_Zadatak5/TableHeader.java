package p25_08_2022_Zadatak5;

import java.util.ArrayList;

public class TableHeader {
	private ArrayList<String> cellHeader = new ArrayList<String>();
		
	public TableHeader() {
	}

	public void addHeaderCell(String cell) {
		cellHeader.add(cell);
	}
	public void print() {
		for (int i = 0; i < cellHeader.size(); i++) {
			System.out.print(cellHeader.get(i) + "\t\t|\t\t");
		}
		System.out.println();
	}
	
	public void printHTML() {
		System.out.print("<tr>");
		for (int i = 0; i < cellHeader.size(); i++) {
			System.out.print("<th>" + cellHeader.get(i) + "</th>");
		}
		System.out.println("</tr>");
	}
	

}
