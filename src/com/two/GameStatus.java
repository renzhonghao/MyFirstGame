package com.two;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;


public class GameStatus {
	private BufferedImage start;
	private BufferedImage finish;
	private BufferedImage wait;

	public GameStatus() {
//			start = ImageIO.read(this.getClass().getResource("/img/start.png"));
//			finish = ImageIO.read(this.getClass().getResource("/img/gameover.png"));
//			wait = ImageIO.read(this.getClass().getResource("/img/wait.png"));
			start=ImageUtil.load("/img/start.png");
			finish=ImageUtil.load("/img/gameover.png");
			wait=ImageUtil.load("/img/wait.png");
	}
	public void paintstart(Graphics g){
		g.drawImage(start, 0, 0, null);
	}
	public void paintfinish(Graphics g){
		g.drawImage(finish, 0, 0, null);
	}
	public void paintwait(Graphics g){
		g.drawImage(wait, 0, 0, null);
	}

}
