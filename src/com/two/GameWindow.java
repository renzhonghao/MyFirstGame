package com.two;
import java.io.IOException;

import javax.swing.JFrame;


public class GameWindow extends JFrame{
	public GameWindow(){		
		GameStart start = new GameStart();
		this.add(start);
		this.setSize(320, 480);
		this.setTitle("别炸我蘑菇");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		start.requestFocus(); // 使panel获得键盘焦点
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
	}

}
