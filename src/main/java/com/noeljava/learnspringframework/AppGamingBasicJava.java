package com.noeljava.learnspringframework;

import com.noeljava.learnspringframework.game.GameRunner;
import com.noeljava.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
