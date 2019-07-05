package com.QA.JavaWK2Assessment_Akthar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Swamp {
	Player player = new Player();
	
	String[] eventArray = {
			"Jordan asks you to reverse a string. bleh...you died", //0
			"Drowners pull you down to a watery grave", //1
			"You find a portal - you manage to escape, but to where? That's a story for another assessment day", //2
			"You find a crazed man muttering something about an air conditioner. He attacks with 95% accuracy. bleh..you died.", //3
			"You find a mushroom and an apple. You eat the apple. bleh..you died.", //4
			"You find a tower. Luckily the door is unlocked. Inside you find a magic robe of protection."
			+ " You also notice a treasure chest. Opening the chest reveals a 12-gauge pump action shotgun with unlimited ammo and a map - You Win", //5
			"E7", //6
			"E8" //7
	};
//	Super generic events should be replaced with super epic events if you have time.
	
	Map<String, String> eventCoordinates = new HashMap<>();
	
//	private int swampSize = 10;
	private boolean fateDecided = false;
	
	public Swamp() {
		super();
		// Improvement would be to somehow randomise this, without duplicate entries and values.
		// This may also need an overhaul to get the radar working.
		this.eventCoordinates.put("3,0", this.eventArray[0]);
		this.eventCoordinates.put("0,3", this.eventArray[1]);
		this.eventCoordinates.put("0,-3", this.eventArray[2]);
		this.eventCoordinates.put("-4,0", this.eventArray[3]);
		this.eventCoordinates.put("-2,2", this.eventArray[4]);
		this.eventCoordinates.put("-2,-2", this.eventArray[5]);
		this.eventCoordinates.put("-3,-3", this.eventArray[6]);
		this.eventCoordinates.put("-4,-4", this.eventArray[7]);
		
	}
	
//	public void populateSwamp() {
//		// This is my attempt to randomly populate the swamp
//		
//		Random num = new Random();
//
//		int[] positive = {1, 2, 3, 4, 5};
//		int[] negative = {-1, -2, -3, -4, -5};
//		// Starts at 1 to prevent 0,0 but then you would not have eg 4,0 or 0,4
//		// If I got it to work I would most likely add checks/ conditions in the loop 
//		
//		int positionGen = 5;
//		String generatedPosition = "";
//		
//		for(int i = 0; i < this.eventArray.length; i++) {
//			
//			for(int j = 0; j < 2; j++) {
//				
//				int sign = num.nextInt(2);
//				
//				if(sign == 0) {
//					
//					generatedPosition += positive[sign];
//					// Comma becomes a problem. I can try and filter it out using more conditionals but am running out of time.
//					
//				} else if(sign == 1) {
//					
//					
//					
//				}
//			}
//			
////			Plan was to generate a string to put into the eventCoordinates map as the key. Checking to see if it already existed. If not then
////			I would put it in the map using the string as a key and eventArray[i] as the value. If the key already had a value assigned then I would
////			loop again.
//			
//		}
//		
////		this.eventCoordinates.put("2,3", this.eventArray[0]);
////		this.eventCoordinates.put("2,-3", this.eventArray[2]);
////		this.eventCoordinates.put("4,4", this.eventArray[3]);
////		this.eventCoordinates.put("-5,0", this.eventArray[4]);
////		this.eventCoordinates.put("-2,3", this.eventArray[5]);
////		this.eventCoordinates.put("-2,-3", this.eventArray[6]);
////		this.eventCoordinates.put("-3,-3", this.eventArray[7]);
////		this.eventCoordinates.put("-4,-4", this.eventArray[8]);
//		
//	}
	
	public void radar(){
		// Not the prettiest code but it works :D
		
		int positionX = player.getPositionX();
		int positionY = player.getPositionY();
		
		int positionNorth10 = positionY + 1;
		int positionNorth20 = positionY + 2;
		
		int positionEast10 = positionX + 1;
		int positionEast20 = positionX + 2;
		
		int positionSouth10 = positionY - 1;
		int positionSouth20 = positionY - 2;
		
		int positionWest10 = positionX - 1;
		int positionWest20 = positionX - 2;
		
		String playerCoordinatesNorth10m = "" + positionX + "," + positionNorth10;
		String playerCoordinatesNorth20m = "" + positionX + "," + positionNorth20;
		
		String playerCoordinatesSouth10m = "" + positionX + "," + positionSouth10;
		String playerCoordinatesSouth20m = "" + positionX + "," + positionSouth20;
		
		String playerCoordinatesEast10m = "" + positionEast10 + "," + positionY;
		String playerCoordinatesEast20m = "" + positionEast20 + "," + positionY;
		
		String playerCoordinatesWest10m = "" + positionWest10 + "," + positionY;
		String playerCoordinatesWest20m = "" + positionWest20 + "," + positionY;
		
		// North
		if(eventCoordinates.get(playerCoordinatesNorth10m) != null) {
			System.out.println("There is a something close by to the north. Approxmately 10m");
		} else if(eventCoordinates.get(playerCoordinatesNorth20m) != null) {
			System.out.println("You can just about see a silhouette to the north. Approximately 20m ");
		}
		
		// East
		if(eventCoordinates.get(playerCoordinatesEast10m) != null) {
			System.out.println("There is a something close by to the east. Approxmately 10m");
		} else if(eventCoordinates.get(playerCoordinatesEast20m) != null) {
			System.out.println("You can just about see a silhouette to the east. Approximately 20m ");
		}
		
		// South
		if(eventCoordinates.get(playerCoordinatesSouth10m) != null) {
			System.out.println("There is a something close by to the south. Approxmately 10m");
		} else if(eventCoordinates.get(playerCoordinatesSouth20m) != null) {
			System.out.println("You can just about see a silhouette to the south. Approximately 20m ");
		}
		
		// West
		if(eventCoordinates.get(playerCoordinatesWest10m) != null) {
			System.out.println("There is a something close by to the west. Approxmately 10m");
		} else if(eventCoordinates.get(playerCoordinatesWest20m) != null) {
			System.out.println("You can just about see a silhouette to the west. Approximately 20m ");
		}
		
		// i don't like relying on null too much. I feel the above might be described as bodgy?
		// There might be a more efficient way of doing this. Attempt to refactor should I have time.
	}
	
	public void eventInstance() {
//		player.setPositionX(2);
//		player.setPositionY(3);
		
		String playerCoordinates = "" + player.getPositionX() + "," + player.getPositionY();
		
//		System.out.println(eventCoordinates.get(playerCoordinates));
		
		if(eventCoordinates.get(playerCoordinates) != null) {
			System.out.println(eventCoordinates.get(playerCoordinates));
			this.fateDecided = true;
		} 
		
	}
	
	public void playerPositionCheck() {
		// This will fake the infinite terrain. Think blair witch project.
		
		int playerPositionX = player.getPositionX();
		int playerPositionY = player.getPositionY();
		
		// The 5 here is the swamp size. It might be wise to put this in a variable.
		if(playerPositionX > 5) {
			player.setPositionX(-5);
		} else if(playerPositionX < -5) {
			player.setPositionX(5);
		} else if(playerPositionY > 5) {
			player.setPositionY(-5);
		} else if(playerPositionY < -5) {
			player.setPositionY(5);
		}
		
	}
	
	public void play() {
		// Output epic intro scenario here
		String intro = "You open your eyes. A thick fog limits visibility, you seem to be in a boggy marsh. You feel the tight grip of a wrist compass. "
				+ "Startled, you sense movement around you."
				+ " Unsure of how you arrived in such a place, one thing was clear...You must find a way out.";
		// Good thing you are not marking my English ability.
		
		System.out.println(intro);
		
		// Scanner and while loop here rather than in main
		Scanner scan = new Scanner(System.in);
		
		while(!this.fateDecided) {
			
			radar();
			
			System.out.println("--- Which direction would you like to travel? North, East, South or West? ---");
			String input = scan.nextLine().toLowerCase();
			
			// Might have to switch to a .equals
			if(input.equals("north")) {
				player.moveNorth();
				System.out.println("You have moved north");
				
				playerPositionCheck();
				eventInstance();
			} else if (input.equals("east")) {
				player.moveEast();
				System.out.println("You have moved east");
				
				playerPositionCheck();
				eventInstance();
			} else if(input.equals("south")) {
				player.moveSouth();
				System.out.println("You have moved south");
				
				playerPositionCheck();
				eventInstance();
			} else if (input.equals("west")){
				player.moveWest();
				System.out.println("You have moved west");
				
				playerPositionCheck();
				eventInstance();
			} else {
				System.out.println("--- Please enter a valid direction ---");
			}
			
		}
		
		scan.close();
		
	}
	
	
	
}
