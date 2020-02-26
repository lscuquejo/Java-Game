package com.tutorial.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 1550691097823471818L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	public Game() {
		new Window(WIDTH, HEIGHT, "let's build a game!", this);
	}

	public synchronized void start() {
		
	}
	
	public static void main(String args[]) {
		new Game();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
