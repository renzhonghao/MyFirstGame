package com.two;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;



public class Background {
	private BufferedImage background;
	
	public Background() {
		background = ImageUtil.load("/img/beijing.png");
	}
	public int groundHeight(){
		return background.getHeight();
	}
	public void paintground(Graphics g){
		g.drawImage(background, 0, 0, null);
	}
	

}
