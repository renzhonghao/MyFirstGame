package com.two;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtil {
	static public BufferedImage load(String name){
		try{
			return ImageIO.read(ImageUtil.class.getResourceAsStream(name));
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}

}
