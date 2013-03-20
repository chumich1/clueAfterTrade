package clueTests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import clueGame.ClueGame;

public class PlayerTests {

	@Before
	public void setUp() throws Exception {
	
		
	}

	@Test
	public void loadPeopleTest(){
		ClueGame game = new ClueGame();
		//not sure about the names
		Assert.assertTrue(game.getHumanPlayer().getName().equals("Professor Plum"));
		Assert.assertTrue(game.getPlayer(1).getName().equals("Miss Scarlet"));
		Assert.assertTrue(game.getPlayer(2).getName().equals("Colonel Mustard"));
		
		//Color
		//enum?
		Assert.assertTrue(game.getHumanPlayer().getColor().equals("PURPLE"));
		Assert.assertTrue(game.getPlayer(1).getColor().equals("RED"));
		Assert.assertTrue(game.getPlayer(2).getColor().equals("YELLOW"));
		
		
		//update locations on board
		Assert.assertEquals(0, game.getHumanPlayer().getStartLocation());
		Assert.assertEquals(1, game.getPlayer(1).getStartLocation());
		Assert.assertEquals(2, game.getPlayer(1).getStartLocation());
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
