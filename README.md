https://www.youtube.com/watch?v=f6DHAgL7FWc

https://start.spring.io/

Maven

3.2.0 (M3)

Eclipse

File -> Import -> Import Existing Maven Project -> a pom.xml will be selected -> ok

src/main/java > com.xxxxxx right click choose New > Class

Give a name e.g. AppGamingBasicJava -> check public static main void -> Finish

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

right clik MarioGame, Ctrl+1 to auto create a new class
the 'Package' add ".game" at the end

right click GameRunner to create class

right click run to create method in GameRunner class

Add constructor in GameRunner as has related code in AppGamingBasicJava:
	private MarioGame game;

	public GameRunner(MarioGame game){
		this.game = game;
	}

You can now back to AppGamingbasic -> right click to click 'Run' the Java App

MarioGame class can add method:
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go into a hole");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Accelerate");
	}
}

----------------------------------------------------
Another game using same game control

comment:
//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);

Add:
		var superContraGame = new SuperContragame();
		var gameRunner = new GameRunner(superContraGame);

new class remember the 'Package' add ".game" at the end

paste the same method to the game, but different action in the method

Q: After that you will found the new can cannot be run, because the GameRunner classs was tightly coupled to the Mario game, how to fix it?

