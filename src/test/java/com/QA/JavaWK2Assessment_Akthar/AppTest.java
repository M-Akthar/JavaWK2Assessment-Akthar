package com.QA.JavaWK2Assessment_Akthar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private Player p1 = new Player();
	private Swamp s1 = new Swamp();

	@Test
	public void northTest() {
		p1.moveNorth();
		p1.moveNorth();
		assertEquals("Simple move N test", 2, p1.getPositionY());
	}
	
	@Test
	public void southTest() {
		p1.moveSouth();
		p1.moveSouth();
		assertEquals("Simple move S test", -2, p1.getPositionY());
	}	
	
	@Test
	public void moveTest() {
		p1.moveSouth();
		p1.moveSouth();
		p1.moveNorth();
		
		p1.moveEast();
		p1.moveEast();
		
		p1.moveWest();
		
		assertEquals("Simple move test", -1, p1.getPositionY());
		assertEquals("Simple move test", 1, p1.getPositionX());
	}	
	
	@Test
	public void positionCheckTest() {
		s1.player.setPositionX(11);
		s1.playerPositionCheck();
		assertEquals("Player position Check", -10, s1.player.getPositionX());
	}
	
	@Test
	public void positionCheckTest2() {
		s1.player.setPositionX(-11);
		s1.playerPositionCheck();
		assertEquals("Player position Check", 10, s1.player.getPositionX());
	}
	
	@Test
	public void positionCheckTest3() {
		s1.player.setPositionY(11);
		s1.playerPositionCheck();
		assertEquals("Player position Check", 10, s1.player.getPositionY());
	}
	
	@Test
	public void positionCheckTest4() {
		s1.player.setPositionY(-11);
		s1.playerPositionCheck();
		assertEquals("Player position Check", 10, s1.player.getPositionY());
	}
	
}
