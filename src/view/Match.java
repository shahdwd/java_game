package view;

import engine.Game;

public class Match {
	
public static void equal1(){
	Game.map=Main.map1;
	Game.heroes=Main.heroes1;
	Game.availableHeroes=Main.availableHeroes1;
	Game.zombies=Main.zombies1;
}

public static void equal2(){
	Main.map1=Game.map;
	Main.heroes1=Game.heroes;
	Main.availableHeroes1=Game.availableHeroes;
	Main.zombies1=Game.zombies;
}
}
