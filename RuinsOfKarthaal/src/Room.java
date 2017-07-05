
public class Room {
	private String description; 
	private String descriptionB; 
	private  int numEnemies; 
	private boolean town;
	Room(){
		
	}
	Room(String desc, String descB, int numEn, boolean town){
		description = desc; 
		descriptionB = descB;
		numEnemies = numEn; 
	}
	
	String getDescriptions(){
		return description; 
	}
	void setDescription(String ndesc){
		description = ndesc;  
	}
	String getBreifDesc(){
		return descriptionB; 
	}
	
	void setBreifDesc(String ndescb){
		descriptionB = ndescb; 
	}
	int getNumEnemies(){
		return numEnemies; 
	}
	void setNumEnemies(int nNum){
		numEnemies = nNum; 
	}
	boolean isTown(){
		return town; 
	}
	void setTown(boolean isTown){
		town = isTown;
	}
}
