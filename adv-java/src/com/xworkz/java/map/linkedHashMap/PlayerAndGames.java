package com.xworkz.java.map.linkedHashMap;

import java.util.LinkedHashMap;

public class PlayerAndGames {

	public static void main(String[] args) {
		Player ranjini=new Player("Ranjini", 200, 31);
		Player ramya=new Player("Ramya", 100, 29);
		Player rathi=new Player("Rathi", 50, 28);
		Player rani=new Player("Rani", 250, 22);
		
		Game snake=new Game("Snake Wars");
		Game rummy=new Game("Rummy");
		Game puppyCrush=new Game("Puppy Crush");
		Game blockPuzzle=new Game("block Puzzle");
		Game cookingMaster=new Game("Cooking Master");
		Game hotBloodHunter=new Game("Hot Blood Hunter");
		Game fingers=new Game("Fingers");
		Game jetPack=new Game("Jet Pack");
		Game zooRun=new Game("Zoo Run");

		LinkedHashMap<Player, Game> players= new LinkedHashMap<Player, Game>();
		
		
	}

}
