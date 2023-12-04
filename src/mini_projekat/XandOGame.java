package mini_projekat;

import java.util.ArrayList;
import java.util.Scanner;

public class XandOGame {
	Scanner s = new Scanner(System.in);
	private ArrayList<String> tabla = new ArrayList<String>();
	private boolean nextPlayer;
	private Player igracX;
	private Player igracO;
	
	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			tabla.add(" ");
		}
	}

		public XandOGame(Player igracX, Player igracO) {
		this.nextPlayer = true;
		this.igracX = igracX;
		this.igracO = igracO;
		for (int i = 0; i < 9; i++) {
			tabla.add(" ");
		}
	}

		public Player getIgracX() {
			return igracX;
		}

		public void setIgracX(Player igracX) {
			this.igracX = igracX;
		}

		public Player getIgracO() {
			return igracO;
		}

		public void setIgracO(Player igracO) {
			this.igracO = igracO;
		}

		public void stampajTablu() {
			for (int i = 0; i < 3; i++) {
				for (int j = 3*i; j < 3*i + 3; j++) {
					System.out.print(tabla.get(j) + " | ");
				}
				System.out.println();
			}
		}
		public void startGame() {
			for (int i = 0; i < 9; i++) {
				tabla.set(i, " ");
			}
			System.out.println("Igra igrac X: ");
			this.nextPlayer = true;
		}

		public boolean isGameOver() {
			for (int i = 0; i < 9; i++) {
				if (this.tabla.get(i).equals(" ")) {
					return false;
				} else if(isWinnerO() == true) {
					return true;
				} else if (isWinnerX() == true) {
					return true;
				}
			}
			return false;
		}
		public boolean isFieldFree(int pozicija) {
			if (this.tabla.get(pozicija).equals(" ")) {
				return true;
			} else {
				return false;
			}
		}
		// ili
		/*
		 * public boolean isFieldFree(int pozicija) {
		if (this.table.get(pozicija).equals("x") || this.table.get(pozicija).equals("o")) {
			return false; //popunjeno polje
		} else {
			return true;
		}
	}
		 */
		public void playNext() {
			if(this.nextPlayer == true) {
				this.nextPlayer = false;
				System.out.println("Igra igrac Oks");
			} else {
				this.nextPlayer = true;
				System.out.println("Igra igrac Iks");
			}
		}
		
		public void makeAMove(int pozicija) {
			if (isFieldFree(pozicija) == false) {
				while (isFieldFree(pozicija) == false) {
					System.out.println("Polje nije slobodno, pokusajte ponovo!");
					System.out.println("Unesite broj polja: ");
					pozicija = s.nextInt();
				}
			}
			if (this.nextPlayer == true) {
				this.tabla.set(pozicija, "x");
			} else {
				this.tabla.set(pozicija, "o");
			}
			playNext();
		}
		public boolean isWinnerX() {
			if ((this.tabla.get(0).equals("x") && this.tabla.get(1).equals("x") && this.tabla.get(2).equals("x")) ||
					(this.tabla.get(3).equals("x") && this.tabla.get(4).equals("x") && this.tabla.get(5).equals("x")) ||
					(this.tabla.get(6).equals("x") && this.tabla.get(7).equals("x") && this.tabla.get(8).equals("x")) ||
					(this.tabla.get(0).equals("x") && this.tabla.get(3).equals("x") && this.tabla.get(6).equals("x")) ||
					(this.tabla.get(1).equals("x") && this.tabla.get(4).equals("x") && this.tabla.get(7).equals("x")) ||
					(this.tabla.get(2).equals("x") && this.tabla.get(5).equals("x") && this.tabla.get(8).equals("x")) ||
					(this.tabla.get(0).equals("x") && this.tabla.get(4).equals("x") && this.tabla.get(8).equals("x")) ||
					(this.tabla.get(2).equals("x") && this.tabla.get(4).equals("x") && this.tabla.get(6).equals("x")) ){
				System.out.println("Pobednik je igrac X!");
				return true;
			} else {
				return false;
			}
		}
		public boolean isWinnerO() {
			if ((this.tabla.get(0).equals("o") && this.tabla.get(1).equals("o") && this.tabla.get(2).equals("o")) ||
					(this.tabla.get(3).equals("o") && this.tabla.get(4).equals("o") && this.tabla.get(5).equals("o")) ||
					(this.tabla.get(6).equals("o") && this.tabla.get(7).equals("o") && this.tabla.get(8).equals("o")) ||
					(this.tabla.get(0).equals("o") && this.tabla.get(3).equals("o") && this.tabla.get(6).equals("o")) ||
					(this.tabla.get(1).equals("o") && this.tabla.get(4).equals("o") && this.tabla.get(7).equals("o")) ||
					(this.tabla.get(2).equals("o") && this.tabla.get(5).equals("o") && this.tabla.get(8).equals("o")) ||
					(this.tabla.get(0).equals("o") && this.tabla.get(4).equals("o") && this.tabla.get(8).equals("o")) ||
					(this.tabla.get(2).equals("o") && this.tabla.get(4).equals("o") && this.tabla.get(6).equals("o")) ){
				System.out.println("Pobednik je igrac O!");
				return true;
			} else {
				return false;
			}
		}
		
		public boolean isValidMove(int pozicija) {
			if (pozicija >=0 && pozicija <= 8) {
				return true;
			} else {
				return false;
			}
		}
		
		public int gameScore() {
			if(isWinnerX() == true) {
				return 1;
			} else if(isWinnerO() == true) {
				return 2;
			} else {
				return 0;
			}
		}
	

}
