package com.springboot.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;

public class VerifyCode {
	private int base = 30;
	private int width = 4*base;
	private int height = base;
	private int len = 4;
	private String codes = "23456789ABCDEFGHIJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
	private String[] fontNames = {"微软雅黑","宋体","华文楷体","华文楷体","华文新魏","黑体","楷体_GB2312"};
	private static String text;

	private BufferedImage img = null;
	private Graphics2D g2 = null;

	public void drawImage(OutputStream output){
		img= new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		g2 = (Graphics2D)img.getGraphics();
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, width, height);

		StringBuffer sb = new StringBuffer();// 用来装载验证码上的文本
		for(int i=0;i<len;i++){
			//设置字体
			g2.setFont(new Font(fontNames[this.getRandom(0,fontNames.length)],Font.BOLD,25));
			//设置颜色
			g2.setColor(new Color(this.getRandom(0, 150),this.getRandom(0, 150),this.getRandom(0, 150)));
			//旋转
			double theta = this.getRandom(-45, 45)*Math.PI/180;
			g2.rotate(theta,i*base+5,height-6);
			//写字符
			String code = codes.charAt(this.getRandom(0, codes.length()))+"";
			sb.append(code);
			g2.drawString(code, i*base+5, height-6);
			//旋转回来
			g2.rotate(-theta,i*base+5,height-6);
		}
		text = sb.toString();

		for(int i=0;i<10;i++){
			g2.setColor(new Color(this.getRandom(0, 150),this.getRandom(0, 150),this.getRandom(0, 150)));
			g2.drawLine(this.getRandom(0,width), this.getRandom(0,height), this.getRandom(0,width), this.getRandom(0,height));
		}
		g2.setColor(Color.GRAY);
		g2.drawRect(0, 0, width-1, height-1);

		try {
			ImageIO.write(img,"JPEG",output);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			//释放资源
			g2.dispose();
		}
	}
	//返回验证码图片上的文本
	public String getTest(){
		return text;
	}
	public int getRandom(int start,int end){
		Random random = new Random();
		return random.nextInt(end - start) + start;
	}
}
