package dodaci;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Dugme {
	public static void main(String[] args) {
		// Kreiranje instance JFrame
				JFrame frame = new JFrame("Napravi dugme"); //naziv kartice

		// Kreiranje instance JButton
				JButton dugme = new JButton("Klikni me");

		// Postavljanje veličine i pozicije dugmeta
				dugme.setBounds(100, 50, 100, 50); // x, y, sirina, visina

		// Dodavanje dugmeta na JFrame
				frame.add(dugme);

		// Postavljanje veličine i vidljivosti JFrame
				frame.setSize(300, 200);
				frame.setLayout(null);
				frame.setVisible(true);
			}
}
