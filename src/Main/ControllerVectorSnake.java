package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControllerVectorSnake implements KeyListener{
	
	private GameScreen gameScreen;
	
	
	
	public ControllerVectorSnake(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			gameScreen.snake.setVector(Snake.Go_up);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			gameScreen.snake.setVector(Snake.Go_down);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gameScreen.snake.setVector(Snake.Go_right);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			gameScreen.snake.setVector(Snake.Go_left);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
