package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable{
	
	Thread thread;
	static int[][] bg = new int[20][20];
	public Snake snake;
	
	
	
	public GameScreen() {
		snake = new Snake();
		bg[10][10] = 2;
		thread = new Thread(this);
		thread.start();
	}
	
	
	
	public void run() {
		while(true) {
			snake.update();
			repaint();
			try {
				thread.sleep(100);
			} catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
	}
	
	
	public void paintBg(Graphics g) {
		g.setColor(Color.GRAY);
		for(int i = 0 ; i < 20; i++) {
			for(int j = 0 ; j < 20 ; j++) {
				g.fillRect(j*20+1, i*20+1, 18, 18);
				if(bg[j][i] == 2) {
					g.setColor(Color.YELLOW);
					g.fillRect(j*20+1, i*20+1, 18, 18);
					g.setColor(Color.GRAY);
				}
			}
		}
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		paintBg(g);
		snake.drawSnake(g);
	}
}
