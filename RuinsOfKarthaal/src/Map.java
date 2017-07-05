
public class Map {
	
	Room[][] rooms; 
	
	Map(){
		rooms = new Room[6][6]; 
		rooms[0][0] = new Room("You wake up in a serene meadow not remembering your name. "
				+ "You seem to have belongins besides a rucksack and the ragged clothes that you are wearing. "
				+ "Before you leave to the nearest town, you struggle to remember your name. ", 
				"a serene meadow with nothing of value.", 0 , false); 
		
		rooms[0][1] = new Room("You find yourself in a dense wooded area. You spot a skeleton on the groud clutching a small bag.", 
				"A dense wooded area with a skeleton clutching a bag", 1, false); ; 
	}
}
