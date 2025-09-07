package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class FrameScreen extends JFrame{
	public static GameScreen gameScreen;
	public static FrameScreen frameScreen;
	public FrameScreen() {
		gameScreen = new GameScreen();
		ControllerVectorSnake ctlVectorSnake = new ControllerVectorSnake(gameScreen);
		add(gameScreen);
		setSize(500, 500);
		
		this.addKeyListener(ctlVectorSnake);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		frameScreen = new FrameScreen();
	}
	
	
	
	
}
