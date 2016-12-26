package com.two;


import javax.swing.SwingUtilities;

public class Start {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GameWindow win;
				win = new GameWindow();
				win.setVisible(true);
			}
		});
	}
}
