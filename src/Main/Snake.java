package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Snake {
	long t1 = 0;
	int doDai = 3;
	int[] x;
	int[] y;
	
	public static int Go_up = 1;
	public static int Go_down = -1;
	public static int Go_right = 2;
	public static int Go_left = -2;
	
	int vector = Snake.Go_down;
	
	
	
	public Snake() {
		x = new int[100];
		y = new int[100];
		
		x[0] = 5;
		y[0] = 4;
		
		x[1] = 5;
		y[1] = 3;
		

	}
	
	public void setVector(int Vector) {
		if(this.vector != -Vector) {
			this.vector = Vector;
		}
	}
	
	public Point getRandomPoint() {
		Random random = new Random();
		int xP = random.nextInt(20);
		int yP = random.nextInt(20);
		Point point = new Point(xP, yP);
		return point;
	}
	

	
	public void update() {
		if(System.currentTimeMillis() - t1 > 100) { 
			if(GameScreen.bg[x[0]][y[0]] ==  2) {
				doDai++;
				GameScreen.bg[x[0]][y[0]] =  0;
				GameScreen.bg[getRandomPoint().x][getRandomPoint().y] =  2;
			}
			
			
			for(int i = doDai - 1; i> 0 ; i--) {
				x[i] = x[i - 1];
				y[i] = y[i - 1];
			}
			
			if(vector == Snake.Go_up) {
				y[0]--;
			}
			if(vector == Snake.Go_down) {
				y[0]++;
			}
			if(vector == Snake.Go_right) {
				x[0]++;
			}
			if(vector == Snake.Go_left) {
				x[0]--;
			}
			
			
			if(x[0] < 0) x[0] = 19;
			if(x[0] > 19) x[0] = 0;
			if(y[0] < 0) y[0] = 19;
		    if(y[0] > 19) y[0] = 0;
		    
			
			t1 = System.currentTimeMillis();
		}
		
	}
	
	public void drawSnake(Graphics g) {
		g.setColor(Color.RED);
		for(int i = 0 ; i < doDai ; i++) {
			g.fillRect(x[i]*20+1, y[i]*20+1, 18, 18);
		}
		
	}
}
