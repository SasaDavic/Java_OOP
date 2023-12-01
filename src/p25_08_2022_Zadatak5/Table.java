package p25_08_2022_Zadatak5;

import java.util.ArrayList;

public class Table {
	private TableHeader header;
	private ArrayList<TableRow> table = new ArrayList<TableRow>();
	private int brojRedovaPoStrani;
	
	
	
	public int getBrojRedovaPoStrani() {
		return brojRedovaPoStrani;
	}

	public void setBrojRedovaPoStrani(int brojRedovaPoStrani) {
		this.brojRedovaPoStrani = brojRedovaPoStrani;
	}

	public Table(int brojRedovaPoStrani) {
	
		this.brojRedovaPoStrani = brojRedovaPoStrani;
	}

	public void setHeader(TableHeader header) {
		this.header = header;
	}
	public void addRow(TableRow row) {
		table.add(row);
	}

	public void print() {
		header.print();
		for (int i = 0; i < table.size(); i++) {
			table.get(i).print();
		}
	}
	public void printHTML( ) {
		System.out.println("<table>");
		System.out.println("<thead>");
		header.printHTML();
		System.out.println("</thead>");
		System.out.println("<tbody>");
		for (int i = 0; i < table.size(); i++) {
			table.get(i).printHTML();
		}
		System.out.println("</tbody>");
		System.out.println("</table>");
	}
	
	public void filter(String pronadjiText) {
		header.print();
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).isEqual(pronadjiText) == true) {
				table.get(i).print();
			}
		}
	}
	public void printPaginator() {
		int a = table.size();
		int str = a / this.brojRedovaPoStrani + 1;
		for (int i = 1; i <= str; i++) {
			System.out.print("| " + i);
		}
		System.out.println();
	}
	public void print(int brStrane) {
		int a = table.size();
		int str = a / this.brojRedovaPoStrani + 1;
		if (brStrane <= str) {
			int x = (brStrane - 1) * this.brojRedovaPoStrani;
			header.print();
			for (int i = x; i < x + this.brojRedovaPoStrani; i++) {
				table.get(i).print();
			}
		} else {
			System.out.println("Tabela ima " + str + " str.");
		}
		
		System.out.println("Broj redova po strani [" + this.brojRedovaPoStrani + "]");
		printPaginator();
	}
		



}
